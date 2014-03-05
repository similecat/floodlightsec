package apron.acl;

import java.util.ArrayList;
import java.util.List;

import org.openflow.protocol.OFFlowMod;
import org.openflow.protocol.OFStatisticsRequest;
import org.openflow.protocol.action.OFAction;
import org.openflow.protocol.statistics.OFStatisticsType;

public class ACLRequest{
    public String app = new String("");
    public OFFlowMod ofFlowMod = null;
    public String field = new String("");
    public List<OFAction> actions = new ArrayList<OFAction>();
    public String ownership = new String("");
    public Integer rules_per_switch = new Integer(0);
    public Float size_per_switch = new Float(0.0);
    public String notification = new String("");
    public OFStatisticsType statistics = null;
    
    public void APP(String s){
    	this.app = s;
    }
    public void MsgTranslate(OFFlowMod msg){
    	try {
			this.ofFlowMod = msg.clone();
		} catch (CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	//action
    	for(int i = 0; i < msg.getActions().size(); ++i){
    		try {
				this.actions.add(msg.getActions().get(i).clone());
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
    public void MsgTranslate(OFStatisticsRequest msg){
    	this.statistics = msg.getStatisticType();
    }
    //flow_predicate
    public int getField(String field){
    	if(field.equals("TCP_SRC")){
    		return this.getTcpSrc();
    	}
    	else if(field.equals("TCP_DST")){
    		return this.getTcpDst();
    	}
    	else if(field.equals("VLAN_ID")){
    		return this.getVlanId();
    	}
    	else if(field.equals("IP_SRC")){
    		return this.getIpSrc();
    	}
    	else if(field.equals("IP_DST")){
    		return this.getIpDst();
    	}
    	return -1;
    }
    public int getTcpSrc(){
    	if(this.ofFlowMod == null){
    		return -1;
    	}
    	return ofFlowMod.getMatch().getTransportSource();
    }
    public int getTcpDst(){
    	if(this.ofFlowMod == null){
    		return -1;
    	}
    	return ofFlowMod.getMatch().getTransportDestination();
    }
    public int getVlanId(){
    	if(this.ofFlowMod == null){
    		return -1;
    	}
    	return ofFlowMod.getMatch().getDataLayerVirtualLan();
    }
    public int getIpSrc(){
    	if(this.ofFlowMod == null){
    		return -1;
    	}
    	return ofFlowMod.getMatch().getNetworkSource();
    }
    public int getIpSrcMask(){
    	if(this.ofFlowMod == null){
    		return -1;
    	}
    	return ~((1<<ofFlowMod.getMatch().getNetworkSourceMaskLen())-1);
    }
    public int getIpDst(){
    	if(this.ofFlowMod == null){
    		return -1;
    	}
    	return ofFlowMod.getMatch().getNetworkDestination();
    }
    //TODO:Topo
    
    //Ownership
    public void ownFlows(){
    	this.app = "OWN_FLOWS";
    }
    public void othersFlows(){
    	this.app = "OTHERS_FLOWS";
    }
    public void allFlows(){
    	this.app = "ALL_FLOWS";
    }
    //Maxpriority

    public int getPriority(){
    	if(ofFlowMod != null){
    		return ofFlowMod.getPriority();
    	}
    	return -1;
    }
    //TODO:Flowtable
    
    //action
    public int getActionSize(){
    	return actions.size();
    }
    //Notification
    public boolean checkNotification(String s){
    	return s == notification;
    }
    public void eventInterception(){
    	this.notification = "EVENT_INTERCEPTION";
    }
    public void modifyEventOrder(){
    	this.notification = "MODIFY_EVENT_ORDER";
    }
    //Statistics
    public Boolean cmpStatistics(String perm){
    	return this.levelStatistics(getStatistics()) >= 
    			this.levelStatistics(perm);
    }
    public int levelStatistics(String s){
    	if(s.equals("FLOW_LEVEL")){
    		return 1;
    	}
    	else if(s.equals("PORT_LEVEL")){
    		return 2;
    	}
    	else if(s.equals("SWITCH_LEVEL")){
    		return 3;
    	}
    	else
    		return 0;
    }
    public String getStatistics(){
    	switch(this.statistics){
    	case DESC:
    		return "SWITCH_LEVEL";
    	case FLOW:
    		return "FLOW_LEVEL";
    	case AGGREGATE:
    		return "SWITCH_LEVEL";
    	case TABLE:
    		return "FLOW_LEVEL";
    	case PORT:
    		return "PORT_LEVEL";
    	case QUEUE: 
    		return "SWITCH_LEVEL";
    	case VENDOR:
    		return "SWITCH_LEVEL";
    	default:
    		return "";
    	}
    }
};
