package apron.test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.openflow.protocol.OFFlowMod;
import org.openflow.protocol.OFMatch;
import org.openflow.protocol.action.OFAction;

import apron.acl.ACLRequest;
import apron.permissionlanguage.ApronLexer;
import apron.permissionlanguage.ApronParser;
import apron.permissionlanguage.Evaluator;
import apron.permissionlanguage.SyntaxGenerator;

public class FlowPreTestor2 {
	public String lan = new String("PERM flow LIMITING IP_SRC 165.124.184.0");
	public OFFlowMod msg = new OFFlowMod();
	public ACLRequest req = null;
	public FlowPreTestor2(){
		OFMatch mt = new OFMatch();
		List<OFAction> neoActions = new LinkedList<OFAction>();
		mt.setNetworkSource(stringToIp("165.124.184.1"));
		msg.setMatch(mt);
		msg.setActions(neoActions);
	}
	
	public boolean execute(){
		Evaluator eval;
		try {
			eval = CreateEvaluator();
			eval.permReq.MsgTranslate(msg);
			return eval.execute();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public Evaluator CreateEvaluator() throws IOException{
		InputStream is = new ByteArrayInputStream(lan.getBytes());
		ANTLRInputStream input = new ANTLRInputStream(is);
		ApronLexer lexer = new ApronLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ApronParser parser = new ApronParser(tokens);
		ParseTree tree = parser.program(); // parse

        SyntaxGenerator syn = new SyntaxGenerator();
        return new Evaluator(syn.visit(tree));
	}
	public int stringToIp(String ipAddr){
    	int ret = 0;
    	String[] ipArr = ipAddr.split("\\.");
        ret |= (Integer.parseInt(ipArr[0]) & 0xFF)<<24;
        ret |= (Integer.parseInt(ipArr[1]) & 0xFF)<<16;
        ret |= (Integer.parseInt(ipArr[2]) & 0xFF)<<8;
        ret |= (Integer.parseInt(ipArr[3]) & 0xFF)<<0;
        return ret;
    }
}
