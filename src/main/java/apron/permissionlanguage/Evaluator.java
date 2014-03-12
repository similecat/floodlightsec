package apron.permissionlanguage;


import apron.acl.ACLRequest;
import apron.syntaxtree.Operation;
import apron.syntaxtree.SyntaxTree;

public class Evaluator{
	public SyntaxTree syn = null;
    public ACLRequest permReq = new ACLRequest();
    
    public Evaluator(SyntaxTree st){
    	this.syn = st;
    }
    
    public boolean execute(){
    	return this.execute(this.syn);
    }
    public boolean execute(ACLRequest permissionRequest){
    	;
    	return this.execute();
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
    public boolean execute(SyntaxTree st){
    	switch(st.Type){
    	case program:
    		return this.execute(st.child(0));
    	case perm_list:
    		for(int i = 0; i < st.childs(); ++i){
    			if(this.execute(st.child(i)) == false){
    				return false;
    			}
    		}
    		return true;
    	case perm:
    		if(st.childs() == 1){
				return true;
			}
    		if(this.execute(st.child(0))){
    			return this.execute(st.child(1));
    		}
    		else{
    			return true;
    		}
    	case perm_name:
    		if(st._string.equals(permReq.app)){
    			return true;
    		}
    		return false;
    	case filter_expr:
    		//operation and
    		for(int i = 0; i < st.childs(); ++i){
    			if(this.execute(st.child(i)) == false){
    				return false;
    			}
    		}
    		return true;

    	case filter_term:
    		//operation or
    		for(int i = 0; i < st.childs(); ++i){
    			if(this.execute(st.child(i))){
    				return true;
    			}
    		}
    		return false;
    	case filter_factor:
    		if(st.op.equals(Operation.NOT)&&
    				this.execute(st.child(0))){
    			return false;
    		}
    		return true;
    	case filter_not_factor:
    		return this.execute(st.child(0));
    	case flow_predicate:
    		//TODO
    		String field = st.child(0)._string;
    		for(int i = 0; i < st.child(1).childs(); ++i){
    			SyntaxTree valueRange = st.child(1).child(i);
    			if(valueRange.childs() == 1&&
    					valueRange.child(0)._int == permReq.getField(field)){
    				return true;
    			}
    			else if(valueRange.child(0)._int <= permReq.getField(field)&&
    					valueRange.child(1)._int >= permReq.getField(field)){
        			return true;
    			}
    		}
    		return false;

    	case ip_range:
    		int ip = stringToIp(st.child(0)._string);
    		int mask = stringToIp(st.child(1)._string);
	    	int ipReq = permReq.getIpSrc();
	    	int maskReq = permReq.getIpSrcMask();
    		return (ip&mask) == (ipReq&maskReq);
    	case action:
    		if(st.childs()>0){
    			return this.execute(st.child(0));
    		}
    		String actionSingle = "";
    		for(int i = 0; i < permReq.getActionSize(); ++i){
        		switch(permReq.actions.get(i).getType()){
       			case OUTPUT:
       				actionSingle = "FORWARD";
       			case SET_TP_SRC:
       				actionSingle = "MODIFY";
       			case SET_TP_DST:
       				actionSingle = "MODIFY";
       			case SET_NW_SRC:
       				actionSingle = "MODIFY";
       			case SET_NW_DST:
        			actionSingle = "MODIFY";
				default:
					if(!actionSingle.equals(st._string)){
						return false;						
					}
        		}
    		}
    		return true;
    	case field_list:
    		String actionModify = "";
    		for(int i = 0; i < permReq.getActionSize(); ++i){
    			switch(permReq.actions.get(i).getType()){
    			case SET_TP_SRC:
    				actionModify = "TCP_SRC";
    			case SET_TP_DST:
    				actionModify = "TCP_DST";
    			case SET_NW_SRC:
    				actionModify = "IP_SRC";
    			case SET_NW_DST:
    				actionModify = "IP_DST";
				default:
					Boolean isInAction = false;
					for(int j = 0; j < st.childs(); ++j){
						if(st.child(j)._string.equals(actionModify)){
							isInAction = true;
							break;
						}
					}
					if(isInAction)
						continue;
					return false;
    			}
    		}
    		return true;
    	case ownership:
    		return permReq.ownership.equals(st._string);
    	case max_priority:
    		return permReq.getPriority() <= st._int;
    	case RULE_COUNT_PER_SWITCH:
    		//TODO
    		break;
    	case SIZE_PERCENTAGE_PER_SWITCH:
    		//TODO
    		break;
    	case notification:
    		return permReq.notification.equals(st._string);
    	case statistics:
    		return permReq.cmpStatistics(st._string);
    	case pktout:
    		return !(permReq.isPktOut() && st._int == 0);
    	case network:
    		return permReq.network<=st._int;
    	case filesystem:
    		return permReq.filesystem<=st._int;
    	case processruntime:
    		return permReq.processruntime<=st._int;
		default:
			return true;
    	}
		return true;
    }
}
