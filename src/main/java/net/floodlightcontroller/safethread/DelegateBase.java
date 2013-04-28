package net.floodlightcontroller.safethread;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.floodlightcontroller.core.module.IFloodlightService;
import net.floodlightcontroller.safethread.message.ApiRequest;
import net.floodlightcontroller.safethread.message.ApiResponse;
import net.floodlightcontroller.util.QueueReader;
import net.floodlightcontroller.util.QueueWriter;


/**
 * The base class for API proxies. 
 * 
 * @author shichao, Xitao Wen
 * 
 */
public abstract class DelegateBase implements IFloodlightService {

	protected final long id; // Object ID assigned by kernel
	protected final FloodlightModuleRunnable app; // Associated app
	
	protected final QueueWriter<ApiRequest> kernelQueueWriter; // Kernel api queue
	protected static Logger logger = LoggerFactory
			.getLogger(DelegateBase.class);

	protected DelegateBase(long id, FloodlightModuleRunnable app, QueueWriter<ApiRequest> qw) {
		this.id = id;
		this.app = app;
		this.kernelQueueWriter = qw;
	}

	public long getDelegateId() {
		return this.id;
	}

	protected void apiRequestAsync(String method, List<Object> args) {
		ApiRequest req = new ApiRequest(this.id, method, this.app, args, null);
		this.writeApiRequestToKernelQueue(req);
	}

	protected Object apiRequestSync(String method, List<Object> args) {
		Object retMonitor = new Object();
		Queue<ApiResponse> retQueue = new ConcurrentLinkedQueue<ApiResponse>();
		QueueWriter<ApiResponse> retWriter = new QueueWriter<ApiResponse>(retMonitor, retQueue);
		QueueReader<ApiResponse> retReader = new QueueReader<ApiResponse>(retMonitor, retQueue);
		ApiRequest req = new ApiRequest(this.id, method, this.app, args,
				retWriter);
		this.writeApiRequestToKernelQueue(req);
		
		//logger.debug("Wait reader at apiRequestSync({}, {})", new Object[]{method, args});
		retReader.waitsNoTimeout();
		ApiResponse ret = retReader.read();
		//logger.debug("Wait return");
//		ApiResponse ret = retReader.pollingRead();
		
		if (ret == null) {
			// waits timeout
			return null;
		}
		else if (ret.getObjectId() != this.id || !ret.getMethod().equals(method)) {
			//System.err.println("Api Result dispatchted to the wrong place");
			return null;
		} else {
			return ret.getReturnValue();
		}
	}

	private void writeApiRequestToKernelQueue(ApiRequest req) {
		kernelQueueWriter.write(req);
		kernelQueueWriter.notifies();
	}
}
