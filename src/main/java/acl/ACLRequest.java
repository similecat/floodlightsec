package acl;

public class ACLRequest{
    public String app = new String("");
    //Flowpredicate flowpredicate;
    public Flowpredicate flowpredicate = new Flowpredicate();
    //Topo
    //Action
    public Action action = new Action();
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
    //Flowpredicate flowpredicate;
    //Topo
    //Action
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
