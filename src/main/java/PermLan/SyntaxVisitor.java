package PermLan;

import SyntaxTree.*;
public class SyntaxVisitor extends apronBaseVisitor <SynTree>{
	
//program
	//perm_list
    public SynTree visitFinal(apronParser.FinalContext ctx){
        SynTree ret = new SynTree(NodeType.program);
        ret.add(visit(ctx.perm_list()));
        return ret;
    }
//perm_list
	//perm_list__wo
    public SynTree visitPerm_list__wo(apronParser.Perm_list__woContext ctx){
        SynTree ret = new SynTree(NodeType.perm_list);
        ret.add(visit(ctx.perm()));
        return ret;
    }
    //perm_list__w
    public SynTree visitPerm_list__w(apronParser.Perm_list__wContext ctx){
    	SynTree ret = new SynTree(NodeType.perm_list);
        ret.add(visit(ctx.perm()));
        ret.add(visit(ctx.perm_list()));
        return ret;
    }
//perm
    //perm__wo
    public SynTree visitPerm__wo(apronParser.Perm__woContext ctx){
    	SynTree ret = new SynTree(NodeType.perm);
        ret.add(visit(ctx.perm_name()));
        return ret;
    }
    //perm__w
    public SynTree visitPerm__w(apronParser.Perm__wContext ctx){
    	SynTree ret = new SynTree(NodeType.perm);
        ret.add(visit(ctx.perm_name()));
        ret.add(visit(ctx.filter_expr()));
        return ret;
    }
//perm_name
    public SynTree visitPerm_name(apronParser.Perm_nameContext ctx){
    	SynTree ret = new SynTree(NodeType.perm_name);
        ret.add(ctx.STRING().getText());
        return ret;
    }
//filter_expr
    //filter_expr__term
    public SynTree visitFilter_expr__term(apronParser.Filter_expr__termContext ctx){
    	//SynTree ret = new SynTree(NodeType.filter_expr);
    	//ret.add(visit(ctx.filter_term()));
        return visit(ctx.filter_term());
    }
    //filter_expr__expr_and_term
    public SynTree visitFilter_expr__expr_and_term(apronParser.Filter_expr__expr_and_termContext ctx){
    	SynTree ret = new SynTree(NodeType.filter_expr,Operation.AND);
    	ret.add(visit(ctx.filter_expr()));
        ret.add(visit(ctx.filter_term()));
        return ret;
    }
//filter_term
    //filter_term__factor
    public SynTree visitFilter_term__factor(apronParser.Filter_term__factorContext ctx){
    	//SynTree ret = new SynTree(NodeType.filter_term);
    	//ret.add(visit(ctx.filter_factor()));
        return visit(ctx.filter_factor());
    }
    //filter_term__term_or_factor
    public SynTree visitFilter_term__term_or_factor(apronParser.Filter_term__term_or_factorContext ctx){
    	SynTree ret = new SynTree(NodeType.filter_term,Operation.OR);
    	ret.add(visit(ctx.filter_term()));
        ret.add(visit(ctx.filter_factor()));
        return ret;
    }
//filter_factor
    //filter_factor__not_factor
    public SynTree visitFilter_factor__not_factor(apronParser.Filter_factor__not_factorContext ctx){
    	//SynTree ret = new SynTree(NodeType.filter_factor);
    	//ret.add(visit(ctx.filter_not_factor()));
        return visit(ctx.filter_not_factor());
    }
    //filter_factor__NOT
    public SynTree visitFilter_factor__NOT(apronParser.Filter_factor__NOTContext ctx){
    	SynTree ret = new SynTree(NodeType.filter_factor,Operation.NOT);
    	ret.add(visit(ctx.filter_factor()));
        return ret;
    }
//filter_not_factor
    //filter_expr_
    public SynTree visitFilter_expr_(apronParser.Filter_expr_Context ctx){
    	//SynTree ret = new SynTree(NodeType.filter_not_factor);
    	//ret.add(visit(ctx.filter_expr()));
        return visit(ctx.filter_expr());
    }

    //flow_predicate_
    public SynTree visitFlow_predicate_(apronParser.Flow_predicate_Context ctx){
    	//SynTree ret = new SynTree(NodeType.filter_not_factor);
    	//ret.add(visit(ctx.flow_predicate()));
        return visit(ctx.flow_predicate());
    }
    //topo_
    public SynTree visitTopo_(apronParser.Topo_Context ctx){
    	//SynTree ret = new SynTree(NodeType.filter_not_factor);
      	//ret.add(visit(ctx.topo()));
        return visit(ctx.topo());
    }
    //action_
    public SynTree visitAction_(apronParser.Action_Context ctx){
    	//SynTree ret = new SynTree(NodeType.filter_not_factor);
        //ret.add(visit(ctx.action()));
        return visit(ctx.action());
    }
    //ownership_
    public SynTree visitOwnership_(apronParser.Ownership_Context ctx){
    	//SynTree ret = new SynTree(NodeType.filter_not_factor);
    	//ret.add(visit(ctx.ownership()));
        return visit(ctx.ownership());
    }
    //max_priority_
    public SynTree visitMax_priority_(apronParser.Max_priority_Context ctx){
    	//SynTree ret = new SynTree(NodeType.filter_not_factor);
    	//ret.add(visit(ctx.max_priority()));
        return visit(ctx.max_priority());
    }
    //flow_table_
    public SynTree visitFlow_table_(apronParser.Flow_table_Context ctx){
    	//SynTree ret = new SynTree(NodeType.filter_not_factor);
    	//ret.add(visit(ctx.flow_table()));
        return visit(ctx.flow_table());
    }
    //notification_
    public SynTree visitNotification_(apronParser.Notification_Context ctx){
    	//SynTree ret = new SynTree(NodeType.filter_not_factor);
    	//ret.add(visit(ctx.notification()));
        return visit(ctx.notification());
    }
  //statistics_
    public SynTree visitStatistics_(apronParser.Statistics_Context ctx){
    	//SynTree ret = new SynTree(NodeType.filter_not_factor);
    	//ret.add(visit(ctx.statistics()));
        return visit(ctx.statistics());
    }
//flow_predicate
    //ip_range_
    public SynTree visitIp_range_(apronParser.Ip_range_Context ctx){
    	//SynTree ret = new SynTree(NodeType.flow_predicate);
        //ret.add(visit(ctx.ip_range()));
        return visit(ctx.ip_range());
    }
    //field_
    public SynTree visitField_(apronParser.Field_Context ctx){
    	SynTree ret = new SynTree(NodeType.flow_predicate);
        ret.add(visit(ctx.field()));
        ret.add(visit(ctx.value_list()));
        return ret;
    }
//field
    public SynTree visitField(apronParser.FieldContext ctx){
    	SynTree ret = new SynTree(NodeType.field);
        ret.add(ctx.getText());
        return ret;
    }
//value_list
    //value_list__s
    public SynTree visitValue_list__s(apronParser.Value_list__sContext ctx){
    	//SynTree ret = new SynTree(NodeType.value_list);
    	//ret.add(visit(ctx.value_range()));
        return visit(ctx.value_range());
    }
    //value_list__w
    public SynTree visitValue_list__w(apronParser.Value_list__wContext ctx){
    	SynTree ret = new SynTree(NodeType.value_list);
    	ret.add(visit(ctx.value_range()));
        ret.add(visit(ctx.value_list()));
        return ret;
    }
//value_range
    //value_range__s
    public SynTree visitValue_range__s(apronParser.Value_range_sContext ctx){
    	SynTree ret = new SynTree(NodeType.value_range);
    	ret.add(Integer.valueOf(ctx.INT().getText()));
        return ret;
    }
    //value_range__w
    public SynTree visitValue_range__w(apronParser.Value_range_wContext ctx){
    	//Todo:compare filed and value list.
    	SynTree ret = new SynTree(NodeType.value_range);
        ret.add(Integer.valueOf(ctx.INT(0).getText()));
        ret.add(Integer.valueOf(ctx.INT(1).getText()));
        return ret;
    }
//ip_range
    public SynTree visitIp_range(apronParser.Ip_rangeContext ctx){
    	//Todo:compare filed and value list.
    	SynTree ret = new SynTree(NodeType.value_range);
        ret.add(ctx.ip_format(0).getText());
        ret.add(ctx.ip_format(1).getText());
        return ret;
    }
//ip_format    
//topo
    //physical_topo_
    public SynTree visitPhysical_topo_(apronParser.Physical_topo_Context ctx){
    	SynTree ret = new SynTree(NodeType.topo);
    	ret.add(visit(ctx.physical_topo()));
        return ret;
    }
    //virtual_topo_
    public SynTree visitVirtual_topo_(apronParser.Virtual_topo_Context ctx){
    	SynTree ret = new SynTree(NodeType.topo);
    	ret.add(visit(ctx.virtual_topo()));
        return ret;
    }
//physical_topo
    public SynTree visitPhysical_topo(apronParser.Physical_topoContext ctx){
    	//? is the and an operator
    	SynTree ret = new SynTree(NodeType.physical_topo);
    	ret.add(visit(ctx.switch_set()));
    	ret.add(visit(ctx.link_set()));
        return ret;
    }
//switch_set
    //all_switches_
    public SynTree visitAll_switches_(apronParser.All_switches_Context ctx){
        //todo:
    	//ret.add(visit(ctx.EVENT_INTERCEPTION());
    	SynTree ret = new SynTree(NodeType.switch_set);
    	ret.add(ctx.ALL_SWITCHES().getText());
        return ret;
    }
    //border_switches_
    public SynTree visitBorder_switches_(apronParser.Border_switches_Context ctx){
        //todo:
    	//ret.add(visit(ctx.border_switches_());
    	SynTree ret = new SynTree(NodeType.switch_set);
    	ret.add(ctx.BORDER_SWITCHES().getText());
        return ret;
    }
    //sw_idx_list_
    public SynTree visitSw_idx_list_(apronParser.Sw_idx_list_Context ctx){
    	SynTree ret = new SynTree(NodeType.switch_set);
        ret.add(visit(ctx.sw_idx_list()));
        return ret;
    }
//sw_idx_list
    //sw_idx_list__wo
    public SynTree visitSw_idx_list__wo(apronParser.Sw_idx_list__woContext ctx){
        //todo:
    	SynTree ret = new SynTree(NodeType.sw_idx_list);
    	ret.add(visit(ctx.sw_idx()));
        return ret;
    }
    //sw_idx_list__w
    public SynTree visitSw_idx_list__w(apronParser.Sw_idx_list__wContext ctx){
        //todo:
    	SynTree ret = new SynTree(NodeType.sw_idx_list);
    	ret.add(visit(ctx.sw_idx()));
    	ret.add(visit(ctx.sw_idx_list()));
        return ret;
    }
//sw_idx
    public SynTree visitSw_idx(apronParser.Sw_idxContext ctx){
        //todo:
    	//ret.add(visit(ctx.EVENT_INTERCEPTION());
    	SynTree ret = new SynTree(NodeType.sw_idx);
    	ret.add(Integer.valueOf(ctx.INT().getText()));
        return ret;
    }
//link_set
    //all_driect_links_
    public SynTree visitAll_driect_links_(apronParser.All_driect_links_Context ctx){
        //todo:
    	SynTree ret = new SynTree(NodeType.link_set);
    	ret.add(ctx.ALL_DIRECT_LINKS().getText());
    	return ret;
    }
    //all_paths_as_links_
    public SynTree visitAll_paths_as_links_(apronParser.All_paths_as_links_Context ctx){
        //todo:
    	SynTree ret = new SynTree(NodeType.link_set);
    	ret.add(ctx.ALL_PATHS_AS_LINKS().getText());
    	return ret;
    }
    //link_list_
    public SynTree visitLink_list_(apronParser.Link_list_Context ctx){
    	SynTree ret = new SynTree(NodeType.link_set);
        ret.add(visit(ctx.link_list()));
        return ret;
    }
//link_list
    //link_list__wo
    public SynTree visitLink_list__wo(apronParser.Link_list__woContext ctx){
    	SynTree ret = new SynTree(NodeType.link_list);
        ret.add(visit(ctx.link()));
        return ret;
    }
    //link_list__w
    public SynTree visitLink_list__w(apronParser.Link_list__wContext ctx){
    	SynTree ret = new SynTree(NodeType.link_list);
    	ret.add(visit(ctx.link()));
    	ret.add(visit(ctx.link_list()));
        return ret;
    }
//link
    //link__wo
    public SynTree visitLink__wo(apronParser.Link__woContext ctx){
    	SynTree ret = new SynTree(NodeType.link);
        ret.add(visit(ctx.link_idx()));
        return ret;
    }
    //link__w
    public SynTree visitLink__w(apronParser.Link__wContext ctx){
    	SynTree ret = new SynTree(NodeType.link);
        ret.add(visit(ctx.path()));
        return ret;
    }
//path
    //path__wo
    public SynTree visitPath__wo(apronParser.Path__woContext ctx){
    	//todo:
    	//ret.add(visit(ctx.EVENT_INTERCEPTION());
        //return ret;
    	SynTree ret = new SynTree(NodeType.path);
    	ret.add(visit(ctx.link_idx()));
    	return ret;
        
    }
    //path__w
    public SynTree visitPath__w(apronParser.Path__wContext ctx){
    	//todo:
    	//ret.add(visit(ctx.EVENT_INTERCEPTION());
        //return ret;
    	SynTree ret = new SynTree(NodeType.path);
    	ret.add(visit(ctx.link_idx()));
    	ret.add(visit(ctx.path()));
    	return ret;
        
    }
//link_idx
    //INT
    public SynTree visitLink_idx(apronParser.Link_idxContext ctx){
    	//todo:
    	//ret.add(visit(ctx.EVENT_INTERCEPTION());
        //return ret;
    	SynTree ret = new SynTree(NodeType.link_idx);
    	ret.add(ctx.INT().getText());
    	return ret;
    }
//virtual_topo
    public SynTree visitVirtual_topo(apronParser.Virtual_topoContext ctx){
    	//todo:
    	//ret.add(visit(ctx.EVENT_INTERCEPTION());
        //return ret;
    	SynTree ret = new SynTree(NodeType.virtual_topo);
    	return ret;
        
    }
//switch_mapping
    //single_big_switch_
    public SynTree visitSingle_big_switch_(apronParser.Single_big_switch_Context ctx){
    	//todo:
    	//ret.add(visit(ctx.EVENT_INTERCEPTION());
        //return ret;
    	SynTree ret = new SynTree(NodeType.switch_mapping);
    	return ret;
        
    }
    //virtual_switch_set_
    public SynTree visitVirtual_switch_set_(apronParser.Virtual_switch_set_Context ctx){
    	//todo:
    	//ret.add(visit(ctx.EVENT_INTERCEPTION());
        //return ret;
    	SynTree ret = new SynTree(NodeType.switch_mapping);
    	return ret;
        
    }
//virtual_switch_set
    //virtual_switch_set__wo
    public SynTree visitVirtual_switch_set__wo(apronParser.Virtual_switch_set__woContext ctx){
    	//todo:
    	//ret.add(visit(ctx.EVENT_INTERCEPTION());
        //return ret;
    	SynTree ret = new SynTree(NodeType.virtual_switch_set);
    	return ret;
        
    }
    //virtual_switch_set__w
    public SynTree visitVirtual_switch_set__w(apronParser.Virtual_switch_set__wContext ctx){
    	//todo:
    	//ret.add(visit(ctx.EVENT_INTERCEPTION());
        //return ret;
    	SynTree ret = new SynTree(NodeType.virtual_switch_set);
    	return ret;
        
    }
//action
    //drop_
    public SynTree visitDrop_(apronParser.Drop_Context ctx){
    	SynTree ret = new SynTree(NodeType.action);
    	ret.add(ctx.DROP().getText());
        return ret;
        
    }
    //forward_
    public SynTree visitForward_(apronParser.Forward_Context ctx){
    	SynTree ret = new SynTree(NodeType.action);
    	ret.add(ctx.FORWARD().getText());
        return ret;   
    }
    //modify_
    public SynTree visitModify_(apronParser.Modify_Context ctx){
    	SynTree ret = new SynTree(NodeType.action);
    	ret.add(ctx.MODIFY().getText());
        return ret;        
    }
    //modify_field_
    public SynTree visitModify_field_(apronParser.Modify_field_Context ctx){
    	SynTree ret = new SynTree(NodeType.action);
    	ret.add(visit(ctx.field_list()));
        return ret;
    }
//field_list
    //filed__wo
    public SynTree visitFiled__wo(apronParser.Filed__woContext ctx){
    	//SynTree ret = new SynTree(NodeType.field_list);
    	//ret.add(visit(ctx.field()));
        return visit(ctx.field());
    }
    //field__w
    public SynTree visitField__w(apronParser.Field__wContext ctx){
    	SynTree ret = new SynTree(NodeType.field_list);
    	ret.add(visit(ctx.field()));
    	ret.add(visit(ctx.field_list()));
        return ret;
    }
//ownership
    //own_flows_
    public SynTree visitOwn_flows_(apronParser.Own_flows_Context ctx){
    	SynTree ret = new SynTree(NodeType.ownership);
    	ret.add(ctx.OWN_FLOWS().getText());
        return ret;        
    }
    //others_flows_
    public SynTree visitOthers_flows_(apronParser.Others_flows_Context ctx){
    	SynTree ret = new SynTree(NodeType.ownership);
    	ret.add(ctx.OTHERS_FLOWS().getText());
        return ret;        
    }
    //all_flows_
    public SynTree visitAll_flows_(apronParser.All_flows_Context ctx){
    	SynTree ret = new SynTree(NodeType.ownership);
    	ret.add(ctx.ALL_FLOWS().getText());
        return ret;        
    }
//max_priority
    public SynTree visitMax_priority(apronParser.Max_priorityContext ctx){
    	SynTree ret = new SynTree(NodeType.max_priority);
    	ret.data(Integer.valueOf(ctx.INT().getText()));
        return ret;
    }
//flow_table
    //flow_table__1
    public SynTree visitFlow_table__1(apronParser.Flow_table__1Context ctx){
    	SynTree ret = new SynTree(NodeType.RULE_COUNT_PER_SWITCH);
    	ret.data(Integer.valueOf(ctx.INT().getText()));
        return ret;
    }
    //flow_table_2
    public SynTree visitFlow_table_2(apronParser.Flow_table_2Context ctx){
    	SynTree ret = new SynTree(NodeType.SIZE_PERCENTAGE_PER_SWITCH);
    	ret.data(Float.valueOf(ctx.FLOAT().getText()));
        return ret;
    }
//notification
    //event_interception_
    public SynTree visitEvent_interception_(apronParser.Event_interception_Context ctx){
    	SynTree ret = new SynTree(NodeType.notification);
    	ret.add(ctx.getText());
        return ret;
    }
  //modify_event_order_
    public SynTree visitModify_event_order_(apronParser.Modify_event_order_Context ctx){
    	SynTree ret = new SynTree(NodeType.notification);
    	ret.add(ctx.getText());
        return ret;
    }
    public SynTree visitNotification(apronParser.NotificationContext ctx){
    	SynTree ret = new SynTree(NodeType.notification);
    	ret.add(ctx.getText());
        return ret;
    }
//statistics
  //flow_level_
    public SynTree visitFlow_level_(apronParser.Flow_level_Context ctx){
    	SynTree ret = new SynTree(NodeType.statistics);
    	ret.add(ctx.getText());
        return ret;
    }
    //port_level_
    public SynTree visitPort_level_(apronParser.Port_level_Context ctx){
    	SynTree ret = new SynTree(NodeType.statistics);
    	ret.add(ctx.getText());
        return ret;
    }
    //switch_level_
    public SynTree visitSwitch_level_(apronParser.Switch_level_Context ctx){
    	SynTree ret = new SynTree(NodeType.statistics);
    	ret.add(ctx.getText());
        return ret;
    }
}
