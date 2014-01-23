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
    
    //Flowpredicate flowpredicate;
    //Topo
    //Action
    //Ownership
    //Maxpriority
    //Flowtable
    //Notification
    //Statistics
    public void APP(String s){
    	this.app = s;
    }
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
