package net.floodlightcontroller.safethread;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.openflow.protocol.OFFlowMod;
import org.openflow.protocol.OFMessage;
import org.openflow.protocol.OFPacketOut;
import org.openflow.protocol.OFType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import apron.constraint.ConstraintGenerator;
import apron.constraint.ConstraintLexer;
import apron.constraint.ConstraintParser;
import apron.permissionlanguage.Evaluator;
import apron.permissionlanguage.SyntaxGenerator;
import apron.permissionlanguage.ApronLexer;
import apron.permissionlanguage.ApronParser;
import apron.syntaxtree.SyntaxTree;
import net.floodlightcontroller.safethread.message.ApiRequest;
import net.floodlightcontroller.safethread.message.ApiResponse;
import net.floodlightcontroller.util.QueueReader;
import net.floodlightcontroller.util.QueueWriter;
import net.floodlightcontroller.core.internal.Controller;
import net.floodlightcontroller.devicemanager.internal.DeviceManagerImpl;

public class KernelDeputy implements Runnable {
	public static final int NTHREAD = 1;
	protected final QueueReader<ApiRequest> apiRequestQueueReader;
	protected final QueueWriter<ApiRequest> apiRequestQueueWriter; // Shared with DelegateSanitizer
	protected final Map<Long, Object> id2ObjectMap;  // Shared with DelegateSanitizer
	protected DelegateSanitizer sanitizer = null;
	
	protected static Logger logger = LoggerFactory
			.getLogger(KernelDeputy.class);
	//public static Object monitor = new Object();	
	//public static Queue<List<Object>> taskQueue = new ConcurrentLinkedQueue<List<Object>>();
	
	public KernelDeputy(Map<Long, Object> idMap) {
		Object apiMonitor = new Object();
		BlockingQueue<ApiRequest> apiQueue = new ArrayBlockingQueue<ApiRequest>(QueueReader.QUEUE_SIZE);
		apiRequestQueueWriter = new QueueWriter<ApiRequest>(apiMonitor, apiQueue);
		apiRequestQueueReader = new QueueReader<ApiRequest>(apiMonitor, apiQueue);
		
		id2ObjectMap = idMap;
	}
	
	public void setSanitizer(DelegateSanitizer s) {
		this.sanitizer = s;
	}
	
	public QueueWriter<ApiRequest> getApiRequestQueueWriter() {
		return apiRequestQueueWriter;
	}

//	public Map<Long, Object> getId2ObjectMap() {
//		return id2ObjectMap;
//	}
	
	@Override
	public void run() {
		//int workerCount = 0;
		TaskWorker tw = new TaskWorker();
		while (true) {
			// Wait for incoming API calls
			//apiRequestQueueReader.waitsNoTimeout();
			ApiRequest task = apiRequestQueueReader.pollingRead();
			
			// Process API calls until queue gets empty
//			ApiRequest task = apiRequestQueueReader.pollingRead();
			while (task!=null) {
				tw.setTask(task);
				tw.run();
				//new Thread(tw,"TaskWorker-" + workerCount++).start();
				
				//logger.debug("Kernel queue length: {}", apiRequestQueueReader.queue.size());
				task = apiRequestQueueReader.pollingRead();
			}			
		}
	}
	
	class TaskWorker implements Runnable {
		private ApiRequest task;
		private Evaluator eval;
		private SyntaxTree perm;
		private ConstraintGenerator cons;
		private ParseTree tree;
		
		//constraint language
		public Evaluator Create_Perm_Visitor(String inputFile) throws IOException{
			InputStream is = new FileInputStream(inputFile);
			ANTLRInputStream input = new ANTLRInputStream(is);
			ApronLexer lexer = new ApronLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ApronParser parser = new ApronParser(tokens);
			tree = parser.program();

			SyntaxGenerator syn = new SyntaxGenerator();
	        return new Evaluator(syn.visit(tree));
		}
		public SyntaxTree Create_Syn_Tree(String inputFile) throws IOException{
			InputStream is = new FileInputStream(inputFile);
			ANTLRInputStream input = new ANTLRInputStream(is);
			ApronLexer lexer = new ApronLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ApronParser parser = new ApronParser(tokens);
			ParseTree tree = parser.program(); // parse

	        SyntaxGenerator syn = new SyntaxGenerator();
	        return syn.visit(tree);
		}
		public ConstraintGenerator Create_Con_Visitor(String inputFile) throws IOException{
			InputStream is = new FileInputStream(inputFile);
			ANTLRInputStream input = new ANTLRInputStream(is);
			ConstraintLexer lexer = new ConstraintLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ConstraintParser parser = new ConstraintParser(tokens);
			ParseTree tree = parser.program(); // parse

			ConstraintGenerator con = new ConstraintGenerator();
			con.visit(tree);
	        return con;
		}
		
		public TaskWorker(){
			super();
			//loading permission language and constraint language.
			try {
				perm = Create_Syn_Tree("sample.perm");
				cons = Create_Con_Visitor("sample.con");
				int ret = cons.execute(perm);
				if(ret > 0){
					logger.debug("Constraint Checking Success!");
				}
				else{
					logger.debug("Constraint Checking Failed!");
				}
				
				eval = Create_Perm_Visitor("sample.perm");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void PermTranslate(ApiRequest r, Object obj, Method method, List<Object> args){
			FloodlightModuleRunnable app = r.getCaller();
			
			//TODO: Translate every API Call into permission language mode.
			eval.permReq.app = app.getClass().getPackage().getName();
			//DeviceManagerImpl
			if(obj.getClass().getName().equals("net.floodlightcontroller.devicemanager.internal.DeviceManagerImpl")){
				if(method == null){
					return;
				}
				else if(method.toString().equals("public void net.floodlightcontroller.devicemanager.internal.DeviceManagerImpl.addListener(net.floodlightcontroller.devicemanager.IDeviceListener)")){
					//addListener
					eval.permReq.eventInterception();
					return;
				}
			}
			//Controller
			else if(obj.getClass().getName().equals("net.floodlightcontroller.core.internal.Controller")){
				if(method == null){
					return;
				}
				else if(method.toString().equals("public synchronized void net.floodlightcontroller.core.internal.Controller.addOFMessageListener(org.openflow.protocol.OFType,net.floodlightcontroller.core.IOFMessageListener)")){
					//addOFMessageListener
					eval.permReq.eventInterception();
					return;
				}
			}
			//TopologyManager
			else if(obj.getClass().getName().equals("net.floodlightcontroller.topology.TopologyManager")){
				if(method == null){
					return;
				}
				else if(method.toString().equals("public boolean net.floodlightcontroller.topology.TopologyManager.isIncomingBroadcastAllowed(long,short)")){
					//TODO:isIncomingBroadcastAllowed
					return;
				}
				else if(method.toString().equals("public long net.floodlightcontroller.topology.TopologyManager.getL2DomainId(long)")){
					//TODO:getL2DomainId
					return;
				}
				else if(method.toString().equals("public net.floodlightcontroller.routing.Route net.floodlightcontroller.topology.TopologyManager.getRoute(long,short,long,short)")){
					//TODO:getRoute
					return;
				}
			}
			//OFSwitchImpl
			else if(obj.getClass().getName().equals("net.floodlightcontroller.core.internal.OFSwitchImpl")){
				if(method == null){
					return;
				}
				//sw.write(flow_mod,null);
				//sw.write(pkt_out,null);
				else if(method.toString().equals("public void net.floodlightcontroller.core.internal.OFSwitchImpl.write(org.openflow.protocol.OFMessage,net.floodlightcontroller.core.FloodlightContext) throws java.io.IOException")){
					//TODO: write; send_pkt_out no mapping from Filter to Permissions
					//sw.write includes flow_mod.
					OFMessage Msg = (OFMessage) args.get(0);
					if(Msg.getType().equals(OFType.FLOW_MOD)){
						OFFlowMod msg = (OFFlowMod) args.get(0);
						eval.permReq.MsgTranslate(msg);
						return;
					}
					/*
					else if(Msg.getType().equals(OFType.PACKET_OUT)){
						OFPacketOut msg = (OFPacketOut) args.get(0);
						eval.permReq.MsgTranslate(msg);
						return;
					}*/
					else if(Msg.getType().equals(OFType.FLOW_REMOVED)){
						;
					}
				}
				else if(method.toString().equals("public java.lang.Object net.floodlightcontroller.core.internal.OFSwitchImpl.getAttribute(java.lang.String)")){
					//TODO: getAttribute; send_pkt_out no mapping from Filter to Permissions
					eval.permReq.allFlows();
					return;
				}
			}
			
			logger.info("Missing Permission:\t"+obj.getClass().getName()+";"+method.toString()+";"+args.toString());
			
		}
		
		public void setTask(ApiRequest r) {
			task = r;
		}
		
		public void run() {
			// Translate request
			Object obj = id2ObjectMap.get(task.getObjectId());
			List<Object> args = task.getArgs();
			Class<?>[] argClasses = new Class[args.size()];
			Method method = null;
			Object ret = null;
			Boolean permissionCheck = false;
			
			for(int i=0;i<args.size();i++) {
				if (args.get(i) != null) {
					argClasses[i] = args.get(i).getClass();
				}
				else {
					argClasses[i] = null;
				}
			}
			
			// This approach has issue when parameter involves inherited classes
//			try {
//				method = obj.getClass().getMethod(task.getMethod(), argClasses);
//			} catch (SecurityException e) {
//				method = null;
//			} catch (NoSuchMethodException e) {
//				method = null;
//			}	
			
			// Some ugly pre-processing
			if (obj.getClass().equals(Controller.class)
					&& task.getMethod().equals("addOFMessageListener")) {
				((MessageListenerDelegate) args.get(1)).setSanitizer(sanitizer);
			} else if (obj.getClass().equals(DeviceManagerImpl.class)
					&& task.getMethod().equals("addListener")) {
				((DeviceListenerDelegate) args.get(0)).setSanitizer(sanitizer);
			}
			
			if (task.getMethod().equals("getSwitches")) {
				ret = ((Controller)obj).getSwitches();
				if (task.getQueueWriter() != null) {
					ApiResponse response = new ApiResponse(
							task.getObjectId(), task.getMethod(),
							task.getCaller(), ret);

					task.getQueueWriter().write(response);
					//task.getQueueWriter().notifies();
				}	
				return;
			}
			
			// Expensive but works
			for (Method m : obj.getClass().getMethods()) {
				if (m.getParameterTypes().length != argClasses.length)
					continue;

				if (task.getMethod().equals(m.getName())) {
					boolean matched = true;
					int count = 0;
					for (Class<?> c : m.getParameterTypes()) {
						if (argClasses[count]!=null && !c.isAssignableFrom(argClasses[count])) {
							if ((c.equals(long.class) && argClasses[count].equals(Long.class)) ||
									(c.equals(short.class) && argClasses[count].equals(Short.class)) ||
									(c.equals(int.class) && argClasses[count].equals(Integer.class)) ||
									(c.equals(boolean.class) && argClasses[count].equals(Boolean.class)) ||
									(c.equals(char.class) && argClasses[count].equals(Character.class)) ||
									(c.equals(byte.class) && argClasses[count].equals(Byte.class)) ||
									(c.equals(float.class) && argClasses[count].equals(Float.class)) ||
									(c.equals(double.class) && argClasses[count].equals(Double.class))) {
								// still matched, do nothing
							} else {	
								matched = false;
								break;
							}
						}
						count++;
					}
					if (matched == true) {
						method = m;
						break;
					}
				}
			}
			if (method == null) {
				logger.debug("No method matched: {}.{}()", new Object[]{obj.getClass(), task.getMethod()});
			}
			
			// TODO: Check permissions
			PermTranslate(task, obj, method, args);
			if(permissionCheck = eval.execute()){
				logger.info("Permission Checking:\t"+"True");
			}
			else{
				logger.info("Permission Checking:\t"+"False");
			}
			
			// Execute request
			try {
				if (method != null&&permissionCheck) {
					ret = method.invoke(obj, args.toArray());
				}
			} catch (IllegalArgumentException e) {
				logger.debug("Should not reach here: {}", e);
			} catch (IllegalAccessException e) {
				logger.debug("Should not reach here: {}", e);
			} catch (InvocationTargetException e) {
				logger.debug("Something inside the call goes wrong: {}", e);
			}	
			
			// Send back response if necessary
			if (task.getQueueWriter() != null) {
				ApiResponse response = new ApiResponse(
						task.getObjectId(), task.getMethod(),
						task.getCaller(), ret);

				task.getQueueWriter().write(response);
				task.getQueueWriter().notifies();
			}			
		}
	}
}
