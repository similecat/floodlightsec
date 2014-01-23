package PermLan;

import acl.*;

public class EvalVisitor extends apronBaseVisitor <Boolean>{
    public ACLRequest perm_req = new ACLRequest();
    public Boolean visitPerm_list__wo(apronParser.Perm_list__woContext ctx){
        Boolean ret = visit(ctx.perm());
        return ret;
    }
    public Boolean visitPerm_list__w(apronParser.Perm_list__wContext ctx){
        Boolean ret0 = visit(ctx.perm());
        Boolean ret1 = visit(ctx.perm_list());
        return ret0&&ret1;
    }
    public Boolean visitPerm__wo(apronParser.Perm__woContext ctx){
        //String perm_name = ctx.perm_name().getText();
        return true;
    }
    public Boolean visitPerm__w(apronParser.Perm__wContext ctx){
        Boolean ret = true;
        if(perm_req.app.equals(ctx.perm_name().getText())){
            ret = visit(ctx.filter_expr());
        }
        return ret;
    }
//filter_expr
    //filter_expr__term
    public Boolean visitFilter_expr__term(apronParser.Filter_expr__termContext ctx){
        Boolean ret0 = visit(ctx.filter_term());
        return ret0;
    }
    //filter_expr__expr_and_term
    public Boolean visitFilter_expr__expr_and_term(apronParser.Filter_expr__expr_and_termContext ctx){
        Boolean ret0 = visit(ctx.filter_expr());
        Boolean ret1 = visit(ctx.filter_term());
        return ret0&&ret1;
    }
//filter_term
    //filter_term__factor
    public Boolean visitFilter_term__factor(apronParser.Filter_term__factorContext ctx){
        Boolean ret0 = visit(ctx.filter_factor());
        return ret0;
    }
    //filter_term__term_or_factor
    public Boolean visitFilter_term__term_or_factor(apronParser.Filter_term__term_or_factorContext ctx){
        Boolean ret0 = visit(ctx.filter_term());
        Boolean ret1 = visit(ctx.filter_factor());
        return ret0||ret1;
    }
//filter_factor
    //filter_factor__not_factor
    public Boolean visitFilter_factor__not_factor(apronParser.Filter_factor__not_factorContext ctx){
        Boolean ret0 = visit(ctx.filter_not_factor());
        return ret0;
    }
    //filter_factor__NOT
    public Boolean visitFilter_factor__NOT(apronParser.Filter_factor__NOTContext ctx){
        Boolean ret0 = visit(ctx.filter_factor());
        return !ret0;
    }
//filter_not_factor
    //filter_expr_
    public Boolean visitFilter_expr_(apronParser.Filter_expr_Context ctx){
        Boolean ret0 = visit(ctx.filter_expr());
        return ret0;
    }

    //flow_predicate_
    public Boolean visitFlow_predicate_(apronParser.Flow_predicate_Context ctx){
        Boolean ret0 = visit(ctx.flow_predicate());
        return ret0;
    }
    //topo_
      public Boolean visitTopo_(apronParser.Topo_Context ctx){
          Boolean ret0 = visit(ctx.topo());
          return ret0;
      }
    //action_
      public Boolean visitAction_(apronParser.Action_Context ctx){
          Boolean ret0 = visit(ctx.action());
          return ret0;
      }
    //ownership_
      public Boolean visitOwnership_(apronParser.Ownership_Context ctx){
          Boolean ret0 = visit(ctx.ownership());
          return ret0;
      }
    //max_priority_
      public Boolean visitMax_priority_(apronParser.Max_priority_Context ctx){
          Boolean ret0 = visit(ctx.max_priority());
          return ret0;
      }
    //flow_table_
      public Boolean visitFlow_table_(apronParser.Flow_table_Context ctx){
          Boolean ret0 = visit(ctx.flow_table());
          return ret0;
      }
    //notification_
    public Boolean visitNotification_(apronParser.Notification_Context ctx){
        Boolean ret0 = visit(ctx.notification());
        return ret0;
    }
  //statistics_
    public Boolean visitStatistics_(apronParser.Statistics_Context ctx){
        Boolean ret0 = visit(ctx.statistics());
        return ret0;
    }
//flow_predicate
    //ip_range_
    public Boolean visitIp_range_(apronParser.Ip_range_Context ctx){
        //Boolean ret0 = visit(ctx.flow_predicate());
        //Todo: compare IP ip_format WITH MASK ip_format with ACLRequest
        return true;
    }
    //field_
    public Boolean visitField_(apronParser.Field_Context ctx){
        Boolean ret0 = new Boolean(false);
        if(perm_req.flowpredicate.field.equals(ctx.field().getText())){
        	ret0 = visit(ctx.value_list());
        }
        else{
        	return true;
        }
        return ret0;
    }
//field
//value_list
    //value_list__s
    public Boolean visitValue_list__s(apronParser.Value_list__sContext ctx){
        Boolean ret0 = visit(ctx.value_range());
        return ret0;
    }
    //value_list__w
    public Boolean visitValue_list__w(apronParser.Value_list__wContext ctx){
        Boolean ret0 = visit(ctx.value_range());
        Boolean ret1 = false;
        if(ret0 == true){
        	return ret0;
        }
        else{
        	ret1 = visit(ctx.value_list());
        }
        return ret1;
    }
//value_range
    //value_range__s
    public Boolean visitValue_range__s(apronParser.Value_range_sContext ctx){
        Boolean ret0 = new Boolean(false);
        if(perm_req.flowpredicate.value.equals(Integer.valueOf(ctx.INT().getText()))){
        	ret0 = true;
        }
        return ret0;
    }
    //value_range__w
    public Boolean visitValue_range__w(apronParser.Value_range_wContext ctx){
    	//Todo:compare filed and value list.
        Boolean ret0 = new Boolean(false);
        if(perm_req.flowpredicate.value.compareTo(Integer.valueOf(ctx.INT(0).getText()))<=0
        		&&perm_req.flowpredicate.value.compareTo(Integer.valueOf(ctx.INT(0).getText()))>=0){
        	ret0 = true;
        }
        return ret0;
    }
//ip_range
//ip_format    
//topo
    //physical_topo_
    public Boolean visitPhysical_topo_(apronParser.Physical_topo_Context ctx){
        Boolean ret0 = visit(ctx.physical_topo());
        return ret0;
    }
    //virtual_topo_
    public Boolean visitVirtual_topo_(apronParser.Virtual_topo_Context ctx){
        Boolean ret0 = visit(ctx.virtual_topo());
        return ret0;
    }
//physical_topo
    public Boolean visitPhysical_topo(apronParser.Physical_topoContext ctx){
    	Boolean ret0 = visit(ctx.switch_set());
    	Boolean ret1 = visit(ctx.link_set());
        return ret0&&ret1;
    }
//switch_set
    //all_switches_
    public Boolean visitAll_switches_(apronParser.All_switches_Context ctx){
        //todo:
    	//Boolean ret0 = visit(ctx.EVENT_INTERCEPTION());
        return true;
    }
    //border_switches_
    public Boolean visitBorder_switches_(apronParser.Border_switches_Context ctx){
        //todo:
    	//Boolean ret0 = visit(ctx.border_switches_());
        return true;
    }
    //sw_idx_list_
    public Boolean visitSw_idx_list_(apronParser.Sw_idx_list_Context ctx){
        Boolean ret0 = visit(ctx.sw_idx_list());
        return ret0;
    }
//sw_idx_list
    //sw_idx_list__wo
    public Boolean visitSw_idx_list__wo(apronParser.Sw_idx_list__woContext ctx){
        //todo:
    	Boolean ret0 = visit(ctx.sw_idx());
        return ret0;
    }
    //sw_idx_list__w
    public Boolean visitSw_idx_list__w(apronParser.Sw_idx_list__wContext ctx){
        //todo:
    	Boolean ret0 = visit(ctx.sw_idx());
    	Boolean ret1 = visit(ctx.sw_idx_list());
        return ret0&&ret1;
    }
//sw_idx
    public Boolean visitSw_idx(apronParser.Sw_idxContext ctx){
        //todo:
    	//Boolean ret0 = visit(ctx.EVENT_INTERCEPTION());
        return true;
    }
//link_set
    //all_driect_links_
    public Boolean visitAll_driect_links_(apronParser.All_driect_links_Context ctx){
        //todo:
    	return true;
    }
    //all_paths_as_links_
    public Boolean visitAll_paths_as_links_(apronParser.All_paths_as_links_Context ctx){
        //todo:
    	return true;
    }
    //link_list_
    public Boolean visitLink_list_(apronParser.Link_list_Context ctx){
        Boolean ret0 = visit(ctx.link_list());
        return ret0;
    }
//link_list
    //link_list__wo
    public Boolean visitLink_list__wo(apronParser.Link_list__woContext ctx){
        Boolean ret0 = visit(ctx.link());
        return ret0;
    }
    //link_list__w
    public Boolean visitLink_list__w(apronParser.Link_list__wContext ctx){
    	Boolean ret0 = visit(ctx.link());
    	Boolean ret1 = visit(ctx.link_list());
        return ret0&&ret1;
    }
//link
    //link__wo
    public Boolean visitLink__wo(apronParser.Link__woContext ctx){
        Boolean ret0 = visit(ctx.link_idx());
        return ret0;
    }
    //link__w
    public Boolean visitLink__w(apronParser.Link__wContext ctx){
        Boolean ret0 = visit(ctx.path());
        return ret0;
    }
//path
    //path__wo
    public Boolean visitPath__wo(apronParser.Path__woContext ctx){
    	//todo:
    	//Boolean ret0 = visit(ctx.EVENT_INTERCEPTION());
        //return ret0;
    	return true;
        
    }
    //path__w
    public Boolean visitPath__w(apronParser.Path__wContext ctx){
    	//todo:
    	//Boolean ret0 = visit(ctx.EVENT_INTERCEPTION());
        //return ret0;
    	return true;
        
    }
//link_idx
    //INT
    public Boolean visitLink_idx(apronParser.Link_idxContext ctx){
    	//todo:
    	//Boolean ret0 = visit(ctx.EVENT_INTERCEPTION());
        //return ret0;
    	return true;
        
    }
//virtual_topo
    public Boolean visitVirtual_topo(apronParser.Virtual_topoContext ctx){
    	//todo:
    	//Boolean ret0 = visit(ctx.EVENT_INTERCEPTION());
        //return ret0;
    	return true;
        
    }
//switch_mapping
    //single_big_switch_
    public Boolean visitSingle_big_switch_(apronParser.Single_big_switch_Context ctx){
    	//todo:
    	//Boolean ret0 = visit(ctx.EVENT_INTERCEPTION());
        //return ret0;
    	return true;
        
    }
    //virtual_switch_set_
    public Boolean visitVirtual_switch_set_(apronParser.Virtual_switch_set_Context ctx){
    	//todo:
    	//Boolean ret0 = visit(ctx.EVENT_INTERCEPTION());
        //return ret0;
    	return true;
        
    }
//virtual_switch_set
    //virtual_switch_set__wo
    public Boolean visitVirtual_switch_set__wo(apronParser.Virtual_switch_set__woContext ctx){
    	//todo:
    	//Boolean ret0 = visit(ctx.EVENT_INTERCEPTION());
        //return ret0;
    	return true;
        
    }
    //virtual_switch_set__w
    public Boolean visitVirtual_switch_set__w(apronParser.Virtual_switch_set__wContext ctx){
    	//todo:
    	//Boolean ret0 = visit(ctx.EVENT_INTERCEPTION());
        //return ret0;
    	return true;
        
    }
//action
    //drop_
    public Boolean visitDrop_(apronParser.Drop_Context ctx){
    	Boolean ret0 = new Boolean(false);
    	if(perm_req.action.op.equals("DROP")){
    		ret0 = true;
    	}
        return ret0;
        
    }
    //forward_
    public Boolean visitForward_(apronParser.Forward_Context ctx){
    	Boolean ret0 = new Boolean(false);
    	if(perm_req.action.op.equals("FORWARD")){
    		ret0 = true;
    	}
        return ret0;
        
    }
    //modify_
    public Boolean visitModify_(apronParser.Modify_Context ctx){
    	Boolean ret0 = new Boolean(false);
    	if(perm_req.action.op.equals("MODIFY")){
    		ret0 = true;
    	}
        return ret0;
        
    }
    //modify_field_
    public Boolean visitModify_field_(apronParser.Modify_field_Context ctx){
    	Boolean ret0 = new Boolean(false);
    	if(perm_req.action.op.equals("MODIFYFIELD")){
    		ret0 = visit(ctx.field_list());
    	}
        return ret0;
        
    }
//field_list
    //filed__wo
    public Boolean visitFiled__wo(apronParser.Filed__woContext ctx){
    	Boolean ret0 = new Boolean(false);
    	if(perm_req.action.field.equals(ctx.field().getText())){
    		ret0 = true;
    	}
        return ret0;
        
    }
    //field__w
    public Boolean visitField__w(apronParser.Field__wContext ctx){
    	Boolean ret0 = new Boolean(false);
    	if(perm_req.action.op.equals(ctx.field().getText())){
    		ret0 = true;
    	}
    	else{
    		ret0 = visit(ctx.field_list());
    	}
        return ret0;
        
    }
//ownership
    //own_flows_
    public Boolean visitOwn_flows_(apronParser.Own_flows_Context ctx){
    	Boolean ret0 = new Boolean(false);
    	if(perm_req.ownership.equals("OWN_FLOWS")){
    		ret0 = true;
    	}
        return ret0;
        
    }
    //others_flows_
    public Boolean visitOthers_flows_(apronParser.Others_flows_Context ctx){
    	Boolean ret0 = new Boolean(false);
    	if(perm_req.ownership.equals("OTHERS_FLOWS")){
    		ret0 = true;
    	}
        return ret0;
    }
    //all_flows_
    public Boolean visitAll_flows_(apronParser.All_flows_Context ctx){
    	Boolean ret0 = new Boolean(false);
    	if(perm_req.ownership.equals("ALL_FLOWS")){
    		ret0 = true;
    	}
        return ret0;
    }
//max_priority
    public Boolean visitMax_priority(apronParser.Max_priorityContext ctx){
    	Boolean ret0 = new Boolean(false);
    	if(perm_req.priority <= Integer.valueOf(ctx.getText())){
    		ret0 = true;
    	}
        return ret0;
    }
//flow_table
    //flow_table__1
    public Boolean visitFlow_table__1(apronParser.Flow_table__1Context ctx){
    	Boolean ret0 = new Boolean(false);
    	if(perm_req.rules_per_switch <= Integer.valueOf(ctx.getText())){
    		ret0 = true;
    	}
        return ret0;
    }
    //flow_table_2
    public Boolean visitFlow_table_2(apronParser.Flow_table_2Context ctx){
    	Boolean ret0 = new Boolean(false);
    	if(perm_req.size_per_switch <= Float.valueOf(ctx.getText())){
    		ret0 = true;
    	}
        return ret0;
    }
//notification
    //event_interception_
    public Boolean visitEvent_interception_(apronParser.Event_interception_Context ctx){
    	Boolean ret0 = new Boolean(false);
    	if(perm_req.notification.equals("EVENT_INTERCEPTION")){
    		ret0 = true;
    	}
        return ret0;
    }
  //modify_event_order_
    public Boolean visitModify_event_order_(apronParser.Modify_event_order_Context ctx){
    	Boolean ret0 = new Boolean(false);
    	if(perm_req.notification.equals("MODIFY_EVENT_ORDER")){
    		ret0 = true;
    	}
        return ret0;
    }
//statistics
    //flow_level_
    public Boolean visitFlow_level_(apronParser.Flow_level_Context ctx){
    	Boolean ret0 = new Boolean(false);
    	if(perm_req.statistics.equals("FLOW_LEVEL")){
    		ret0 = true;
    	}
        return ret0;
    }
    //port_level_
    public Boolean visitPort_level_(apronParser.Port_level_Context ctx){
    	Boolean ret0 = new Boolean(false);
    	if(perm_req.statistics.equals("PORT_LEVEL")){
    		ret0 = true;
    	}
        return ret0;
    }
    //switch_level_
    public Boolean visitSwitch_level_(apronParser.Switch_level_Context ctx){
    	Boolean ret0 = new Boolean(false);
    	if(perm_req.statistics.equals("SWITCH_LEVEL")){
    		ret0 = true;
    	}
        return ret0;
    }
}
