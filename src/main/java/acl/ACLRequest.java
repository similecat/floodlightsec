package acl;

import java.util.ArrayList;
import java.util.List;

import org.openflow.protocol.OFFlowMod;
import org.openflow.protocol.OFMatch;
import org.openflow.protocol.OFPacketOut;
import org.openflow.protocol.action.OFAction;
import org.openflow.protocol.action.OFActionType;

public class ACLRequest{
    public String app = new String("");
    //Flowpredicate flowpredicate;
    public Flowpredicate flowpredicate = new Flowpredicate();
    public OFMatch match = null;
    public String field = "";
    //Topo
    //Action
    public List<OFAction> action = new ArrayList<OFAction>();
    //Ownership
    public String ownership = new String("");
    //Maxpriority
    public Integer priority;
    //Flowtable
    public Integer rules_per_switch = new Integer(0);
    public Float size_per_switch = new Float(0.0);
    //Notification
    public String notification = new String("");
    //Statistics
    public String statistics = new String("");
    
    public void APP(String s){
    	this.app = s;
    }
    public void MsgTranslate(OFFlowMod msg){
    	//priority
    	this.priority = (int) msg.getPriority();
    	//flow predicate
    	this.match = msg.getMatch().clone();
    	//action
    	for(int i = 0; i < msg.getActions().size(); ++i){
    		try {
				this.action.add(msg.getActions().get(i).clone());
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
    public void MsgTranslate(OFPacketOut msg){
    	;
    }
    //Flowpredicate flowpredicate;
    
    public void setField(String s){
    	if(s.equals("TCP_SRC")||
    			s.equals("TCP_DST")||
    			s.equals("IP_SRC")||
    			s.equals("IP_DST")){
    		field = s.toString();
    	}
    }
    
    public void field_tcp_src(){
    	field = "TCP_SRC";
    }
    public boolean is_field_tcp_src(){
    	return field.equals("TCP_SRC");
    }
    public void field_tcp_dst(){
    	field = "TCP_DST";
    }
    public boolean is_field_tcp_dst(){
    	return field.equals("TCP_DST");
    }
    public void field_ip_src(){
    	field = "IP_SRC";
    }
    public boolean is_field_ip_src(){
    	return field.equals("IP_SRC");
    }
    public void field_ip_dst(){
    	field = "IP_DST";
    }
    public boolean is_field_ip_dst(){
    	return field.equals("IP_DST");
    }
    //Topo
    //Action
    public boolean check_drop(){
    	//drop
    	for(int i = 0; i < action.size(); ++i){
    		if(action.get(i).getType().equals(OFActionType.OUTPUT)){
    			return false;
    		}
    	}
    	return true;
    }
    public boolean check_forward(){
    	for(int i = 0; i < action.size(); ++i){
    		if(!action.get(i).getType().equals(OFActionType.OUTPUT)){
    			return false;
    		}
    	}
    	return true;
    }
    public boolean check_modify(){
    	for(int i = 0; i < action.size(); ++i){
    		if(action.get(i).getType().equals(OFActionType.OUTPUT)||
    				action.get(i).getType().equals(OFActionType.OPAQUE_ENQUEUE)||
    				action.get(i).getType().equals(OFActionType.VENDOR)){
    			return false;
    		}
    	}
    	return true;
    }
    public boolean check_modify(String s){
        List<OFAction> actions = new ArrayList<OFAction>();
    	for(int i = 0; i < action.size(); ++i){
    		try {
				this.action.add(action.get(i).clone());
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	boolean fg = true;
    	while(fg){
    		fg = false;
    		for(int i = 0; i < actions.size(); ++i){
    			boolean fs = false;
    			if(actions.get(i).getType().equals(OFActionType.SET_TP_SRC)&&
    					s.equals("TCP_SRC")){
    				fs = true;
    			}
    			else if(actions.get(i).getType().equals(OFActionType.SET_TP_DST)&&
    					s.equals("TCP_DST")){
    				fs = true;
    			}
    			else if(actions.get(i).getType().equals(OFActionType.SET_NW_SRC)&&
    					s.equals("IP_SRC")){
    				fs = true;
    			}
    			else if(actions.get(i).getType().equals(OFActionType.SET_NW_DST)&&
    					s.equals("IP_DST")){
    				fs = true;
    			}
    			if(fs){
    				fg = true;
    				actions.remove(i);
    				break;
    			}
    		}
    	}
    	return true;
    }
    //Ownership
    public void Own_flows(){
    	this.app = "OWN_FLOWS";
    }
    public void Others_flows(){
    	this.app = "OTHERS_FLOWS";
    }
    public void All_flows(){
    	this.app = "ALL_FLOWS";
    }
    //Maxpriority
    public void set_priority(int p){
    	this.priority = p;
    }
    //Flowtable
    //Notification
    //Statistics
    
    public void Flow_level(){
    	this.statistics = "FLOW_LEVLE";
    }
    public void Port_level(){
    	this.statistics = "PORT_LEVLE";
    }
    public void Switch_level(){
    	this.statistics = "SWITCH_LEVLE";
    }
};
