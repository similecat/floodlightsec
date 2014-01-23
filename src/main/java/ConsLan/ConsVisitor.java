package ConsLan;

import ConsTree.*;
import SyntaxTree.*;

public class ConsVisitor extends constraintBaseVisitor<SynTree> {
	ConsTree lang = new ConsTree();

	public void execute(){
		lang.execute();
	}
	public int execute(SynTree syntree){
		return lang.execute(syntree);
	}
	
//program
	//stat*
//stat
    
	//bind_
    public SynTree visitBind_(constraintParser.Bind_Context ctx){
        SynTree ret = visit(ctx.binding());
        lang.add(ret);
        return ret;
    }
    //assert_list_
    public SynTree visitAssert_list_(constraintParser.Assert_list_Context ctx){
        SynTree ret = visit(ctx.assert_list());
        lang.add(ret);
        return ret;
    }
    
//binding
    //LET var_perm '=' '{' perm_list '}'	#bind_list
    public SynTree visitBind_list(constraintParser.Bind_listContext ctx){
        SynTree ret = new SynTree(NodeType.binding);
        ret.add(visit(ctx.var_perm()));
        ret.add(visit(ctx.perm_list()));
        return ret;
    }
    //|LET var_perm '=' APP app_name		#bind_app
    public SynTree visitBind_app(constraintParser.Bind_appContext ctx){
        SynTree ret = new SynTree(NodeType.binding);
        ret.add(visit(ctx.var_perm()));
        ret.add(visit(ctx.app_name()));
        return ret;
    }
    //|LET var_perm '=' perm_expr			#bind_expr
    public SynTree visitBind_expr(constraintParser.Bind_exprContext ctx){
        SynTree ret = new SynTree(NodeType.binding);
        ret.add(visit(ctx.var_perm()));
        ret.add(visit(ctx.perm_expr()));
        return ret;
    }
//var_perm:
    //STRING
    public SynTree visitVar_perm(constraintParser.Var_permContext ctx){
        SynTree ret = new SynTree(NodeType.var_perm);
        ret.add(ctx.STRING().getText());
        return ret;
    }
//app_name:
    //STRING
    public SynTree visitApp_name(constraintParser.App_nameContext ctx){
        SynTree ret = new SynTree(NodeType.app_name);
        ret.add(ctx.STRING().getText());
        return ret;
    }
//perm_expr:
    //var_perm							#perm_expr__wo
    public SynTree visitPerm_expr__wo(constraintParser.Perm_expr__woContext ctx){
        return visit(ctx.var_perm());
    }
    //|perm_expr UNION var_perm			#perm_expr_union
    public SynTree visitPerm_expr_union(constraintParser.Perm_expr_unionContext ctx){

        SynTree ret = new SynTree(NodeType.perm_expr);
        ret.add(visit(ctx.perm_expr()));
        ret.add(visit(ctx.var_perm()));
    	return ret;
    }
//assert_list:
    //assert_stmt							#assert_stmt__wo
    public SynTree visitAssert_stmt__wo(constraintParser.Assert_stmt__woContext ctx){
        return visit(ctx.assert_stmt());
    }
    //|assert_stmt assert_list			#assert_stmt__w
    public SynTree visitAssert_stmt__w(constraintParser.Assert_stmt__wContext ctx){

        SynTree ret = new SynTree(NodeType.assert_list);
        ret.add(visit(ctx.assert_stmt()));
        ret.add(visit(ctx.assert_list()));
        return ret;
    }
//assert_stmt:
    //ASSERT assert_expr					#assert_st_expr
    public SynTree visitAssert_st_expr(constraintParser.Assert_st_exprContext ctx){

    	return visit(ctx.assert_expr());
    }
    //|ASSERT exclusive					#assert_st_exc
    public SynTree visitAssert_st_exc(constraintParser.Assert_st_excContext ctx){

    	return visit(ctx.exclusive());
    }
//assert_expr:
    //NOT assert_expr						#assert_not
    public SynTree visitAssert_not(constraintParser.Assert_notContext ctx){

        SynTree ret = new SynTree(NodeType.assert_expr,Operation.NOT);
        ret.add(visit(ctx.assert_expr()));
    	return ret;
    }
    //|assert_expr OR boolean_expr		#assert_or
    public SynTree visitAssert_or(constraintParser.Assert_orContext ctx){

        SynTree ret = new SynTree(NodeType.assert_expr,Operation.OR);
        ret.add(visit(ctx.assert_expr()));
        ret.add(visit(ctx.boolean_expr()));
    	return ret;
    }
    //|assert_expr AND boolean_expr		#assert_and
    public SynTree visitAssert_and(constraintParser.Assert_andContext ctx){

        SynTree ret = new SynTree(NodeType.assert_expr,Operation.AND);
        ret.add(visit(ctx.assert_expr()));
        ret.add(visit(ctx.boolean_expr()));
    	return ret;
    }
    //|boolean_expr						#assert_bool
    public SynTree visitAssert_bool(constraintParser.Assert_boolContext ctx){

    	return visit(ctx.boolean_expr());
    }
//boolean_expr:
    //perm_expr cmp_operator perm_expr
    public SynTree visitBoolean_expr(constraintParser.Boolean_exprContext ctx){

        SynTree ret = new SynTree(NodeType.boolean_expr);
        ret.add(visit(ctx.perm_expr(0)));
        ret.add(visit(ctx.cmp_operator()));
        ret.add(visit(ctx.perm_expr(1)));
    	return ret;
    }
//cmp_operator:
    public SynTree visitCmp_operator(constraintParser.Cmp_operatorContext ctx){

        SynTree ret = new SynTree(NodeType.cmp_operator);
        ret.data(ctx.getText());
    	return ret;
    }
    //'<'
    //|'>'
    //|'='
    //|'<='
    //|'>='
//exclusive:
    //EITHER perm_expr OR perm_expr	
    public SynTree visitExclusive(constraintParser.ExclusiveContext ctx){
        SynTree ret = new SynTree(NodeType.exclusive);
        ret.add(visit(ctx.perm_expr(0)));
        ret.add(visit(ctx.perm_expr(1)));
    	return ret;
    }	
//perm_list
	//perm_list__wo
    public SynTree visitPerm_list__wo(constraintParser.Perm_list__woContext ctx){
        SynTree ret = new SynTree(NodeType.perm_list);
        ret.add(visit(ctx.perm()));
        return ret;
    }
    //perm_list__w
    public SynTree visitPerm_list__w(constraintParser.Perm_list__wContext ctx){
    	SynTree ret = new SynTree(NodeType.perm_list);
        ret.add(visit(ctx.perm()));
        ret.add(visit(ctx.perm_list()));
        return ret;
    }
//perm
    //perm__wo
    public SynTree visitPerm__wo(constraintParser.Perm__woContext ctx){
    	SynTree ret = new SynTree(NodeType.perm);
        ret.add(visit(ctx.perm_name()));
        return ret;
    }
    //perm__w
    public SynTree visitPerm__w(constraintParser.Perm__wContext ctx){
    	SynTree ret = new SynTree(NodeType.perm);
        ret.add(visit(ctx.perm_name()));
        ret.add(visit(ctx.filter_expr()));
        return ret;
    }
//perm_name
    public SynTree visitPerm_name(constraintParser.Perm_nameContext ctx){
    	SynTree ret = new SynTree(NodeType.perm_name);
        ret.add(ctx.STRING().getText());
        return ret;
    }
//filter_expr
    //filter_expr__term
    public SynTree visitFilter_expr__term(constraintParser.Filter_expr__termContext ctx){
    	//SynTree ret = new SynTree(NodeType.filter_expr);
    	//ret.add(visit(ctx.filter_term()));
        return visit(ctx.filter_term());
    }
    //filter_expr__expr_and_term
    public SynTree visitFilter_expr__expr_and_term(constraintParser.Filter_expr__expr_and_termContext ctx){
    	SynTree ret = new SynTree(NodeType.filter_expr,Operation.AND);
    	ret.add(visit(ctx.filter_expr()));
        ret.add(visit(ctx.filter_term()));
        return ret;
    }
//filter_term
    //filter_term__factor
    public SynTree visitFilter_term__factor(constraintParser.Filter_term__factorContext ctx){
    	//SynTree ret = new SynTree(NodeType.filter_term);
    	//ret.add(visit(ctx.filter_factor()));
        return visit(ctx.filter_factor());
    }
    //filter_term__term_or_factor
    public SynTree visitFilter_term__term_or_factor(constraintParser.Filter_term__term_or_factorContext ctx){
    	SynTree ret = new SynTree(NodeType.filter_term,Operation.OR);
    	ret.add(visit(ctx.filter_term()));
        ret.add(visit(ctx.filter_factor()));
        return ret;
    }
//filter_factor
    //filter_factor__not_factor
    public SynTree visitFilter_factor__not_factor(constraintParser.Filter_factor__not_factorContext ctx){
    	//SynTree ret = new SynTree(NodeType.filter_factor);
    	//ret.add(visit(ctx.filter_not_factor()));
        return visit(ctx.filter_not_factor());
    }
    //filter_factor__NOT
    public SynTree visitFilter_factor__NOT(constraintParser.Filter_factor__NOTContext ctx){
    	SynTree ret = new SynTree(NodeType.filter_factor,Operation.NOT);
    	ret.add(visit(ctx.filter_factor()));
        return ret;
    }
//filter_not_factor
    //filter_expr_
    public SynTree visitFilter_expr_(constraintParser.Filter_expr_Context ctx){
    	//SynTree ret = new SynTree(NodeType.filter_not_factor);
    	//ret.add(visit(ctx.filter_expr()));
        return visit(ctx.filter_expr());
    }

    //flow_predicate_
    public SynTree visitFlow_predicate_(constraintParser.Flow_predicate_Context ctx){
    	//SynTree ret = new SynTree(NodeType.filter_not_factor);
    	//ret.add(visit(ctx.flow_predicate()));
        return visit(ctx.flow_predicate());
    }
    //topo_
    public SynTree visitTopo_(constraintParser.Topo_Context ctx){
    	//SynTree ret = new SynTree(NodeType.filter_not_factor);
      	//ret.add(visit(ctx.topo()));
        return visit(ctx.topo());
    }
    //action_
    public SynTree visitAction_(constraintParser.Action_Context ctx){
    	//SynTree ret = new SynTree(NodeType.filter_not_factor);
        //ret.add(visit(ctx.action()));
        return visit(ctx.action());
    }
    //ownership_
    public SynTree visitOwnership_(constraintParser.Ownership_Context ctx){
    	//SynTree ret = new SynTree(NodeType.filter_not_factor);
    	//ret.add(visit(ctx.ownership()));
        return visit(ctx.ownership());
    }
    //max_priority_
    public SynTree visitMax_priority_(constraintParser.Max_priority_Context ctx){
    	//SynTree ret = new SynTree(NodeType.filter_not_factor);
    	//ret.add(visit(ctx.max_priority()));
        return visit(ctx.max_priority());
    }
    //flow_table_
    public SynTree visitFlow_table_(constraintParser.Flow_table_Context ctx){
    	//SynTree ret = new SynTree(NodeType.filter_not_factor);
    	//ret.add(visit(ctx.flow_table()));
        return visit(ctx.flow_table());
    }
    //notification_
    public SynTree visitNotification_(constraintParser.Notification_Context ctx){
    	//SynTree ret = new SynTree(NodeType.filter_not_factor);
    	//ret.add(visit(ctx.notification()));
        return visit(ctx.notification());
    }
  //statistics_
    public SynTree visitStatistics_(constraintParser.Statistics_Context ctx){
    	//SynTree ret = new SynTree(NodeType.filter_not_factor);
    	//ret.add(visit(ctx.statistics()));
        return visit(ctx.statistics());
    }
//flow_predicate
    //ip_range_
    public SynTree visitIp_range_(constraintParser.Ip_range_Context ctx){
    	//SynTree ret = new SynTree(NodeType.flow_predicate);
        //ret.add(visit(ctx.ip_range()));
        return visit(ctx.ip_range());
    }
    //field_
    public SynTree visitField_(constraintParser.Field_Context ctx){
    	SynTree ret = new SynTree(NodeType.flow_predicate);
        ret.add(visit(ctx.field()));
        ret.add(visit(ctx.value_list()));
        return ret;
    }
//field
    public SynTree visitField(constraintParser.FieldContext ctx){
    	SynTree ret = new SynTree(NodeType.field);
        ret.add(ctx.getText());
        return ret;
    }
//value_list
    //value_list__s
    public SynTree visitValue_list__s(constraintParser.Value_list__sContext ctx){
    	//SynTree ret = new SynTree(NodeType.value_list);
    	//ret.add(visit(ctx.value_range()));
        return visit(ctx.value_range());
    }
    //value_list__w
    public SynTree visitValue_list__w(constraintParser.Value_list__wContext ctx){
    	SynTree ret = new SynTree(NodeType.value_list);
    	ret.add(visit(ctx.value_range()));
        ret.add(visit(ctx.value_list()));
        return ret;
    }
//value_range
    //value_range__s
    public SynTree visitValue_range__s(constraintParser.Value_range_sContext ctx){
    	SynTree ret = new SynTree(NodeType.value_range);
    	ret.add(Integer.valueOf(ctx.INT().getText()));
        return ret;
    }
    //value_range__w
    public SynTree visitValue_range__w(constraintParser.Value_range_wContext ctx){
    	//Todo:compare filed and value list.
    	SynTree ret = new SynTree(NodeType.value_range);
        ret.add(Integer.valueOf(ctx.INT(0).getText()));
        ret.add(Integer.valueOf(ctx.INT(1).getText()));
        return ret;
    }
//ip_range
    public SynTree visitIp_range(constraintParser.Ip_rangeContext ctx){
    	//Todo:compare filed and value list.
    	SynTree ret = new SynTree(NodeType.value_range);
        ret.add(ctx.ip_format(0).getText());
        ret.add(ctx.ip_format(1).getText());
        return ret;
    }
//ip_format    
//topo
    //physical_topo_
    public SynTree visitPhysical_topo_(constraintParser.Physical_topo_Context ctx){
    	SynTree ret = new SynTree(NodeType.topo);
    	ret.add(visit(ctx.physical_topo()));
        return ret;
    }
    //virtual_topo_
    public SynTree visitVirtual_topo_(constraintParser.Virtual_topo_Context ctx){
    	SynTree ret = new SynTree(NodeType.topo);
    	ret.add(visit(ctx.virtual_topo()));
        return ret;
    }
//physical_topo
    public SynTree visitPhysical_topo(constraintParser.Physical_topoContext ctx){
    	//? is the and an operator
    	SynTree ret = new SynTree(NodeType.physical_topo);
    	ret.add(visit(ctx.switch_set()));
    	ret.add(visit(ctx.link_set()));
        return ret;
    }
//switch_set
    //all_switches_
    public SynTree visitAll_switches_(constraintParser.All_switches_Context ctx){
        //todo:
    	//ret.add(visit(ctx.EVENT_INTERCEPTION());
    	SynTree ret = new SynTree(NodeType.switch_set);
    	ret.add(ctx.ALL_SWITCHES().getText());
        return ret;
    }
    //border_switches_
    public SynTree visitBorder_switches_(constraintParser.Border_switches_Context ctx){
        //todo:
    	//ret.add(visit(ctx.border_switches_());
    	SynTree ret = new SynTree(NodeType.switch_set);
    	ret.add(ctx.BORDER_SWITCHES().getText());
        return ret;
    }
    //sw_idx_list_
    public SynTree visitSw_idx_list_(constraintParser.Sw_idx_list_Context ctx){
    	SynTree ret = new SynTree(NodeType.switch_set);
        ret.add(visit(ctx.sw_idx_list()));
        return ret;
    }
//sw_idx_list
    //sw_idx_list__wo
    public SynTree visitSw_idx_list__wo(constraintParser.Sw_idx_list__woContext ctx){
        //todo:
    	SynTree ret = new SynTree(NodeType.sw_idx_list);
    	ret.add(visit(ctx.sw_idx()));
        return ret;
    }
    //sw_idx_list__w
    public SynTree visitSw_idx_list__w(constraintParser.Sw_idx_list__wContext ctx){
        //todo:
    	SynTree ret = new SynTree(NodeType.sw_idx_list);
    	ret.add(visit(ctx.sw_idx()));
    	ret.add(visit(ctx.sw_idx_list()));
        return ret;
    }
//sw_idx
    public SynTree visitSw_idx(constraintParser.Sw_idxContext ctx){
        //todo:
    	//ret.add(visit(ctx.EVENT_INTERCEPTION());
    	SynTree ret = new SynTree(NodeType.sw_idx);
    	ret.add(Integer.valueOf(ctx.INT().getText()));
        return ret;
    }
//link_set
    //all_driect_links_
    public SynTree visitAll_driect_links_(constraintParser.All_driect_links_Context ctx){
        //todo:
    	SynTree ret = new SynTree(NodeType.link_set);
    	ret.add(ctx.ALL_DIRECT_LINKS().getText());
    	return ret;
    }
    //all_paths_as_links_
    public SynTree visitAll_paths_as_links_(constraintParser.All_paths_as_links_Context ctx){
        //todo:
    	SynTree ret = new SynTree(NodeType.link_set);
    	ret.add(ctx.ALL_PATHS_AS_LINKS().getText());
    	return ret;
    }
    //link_list_
    public SynTree visitLink_list_(constraintParser.Link_list_Context ctx){
    	SynTree ret = new SynTree(NodeType.link_set);
        ret.add(visit(ctx.link_list()));
        return ret;
    }
//link_list
    //link_list__wo
    public SynTree visitLink_list__wo(constraintParser.Link_list__woContext ctx){
    	SynTree ret = new SynTree(NodeType.link_list);
        ret.add(visit(ctx.link()));
        return ret;
    }
    //link_list__w
    public SynTree visitLink_list__w(constraintParser.Link_list__wContext ctx){
    	SynTree ret = new SynTree(NodeType.link_list);
    	ret.add(visit(ctx.link()));
    	ret.add(visit(ctx.link_list()));
        return ret;
    }
//link
    //link__wo
    public SynTree visitLink__wo(constraintParser.Link__woContext ctx){
    	SynTree ret = new SynTree(NodeType.link);
        ret.add(visit(ctx.link_idx()));
        return ret;
    }
    //link__w
    public SynTree visitLink__w(constraintParser.Link__wContext ctx){
    	SynTree ret = new SynTree(NodeType.link);
        ret.add(visit(ctx.path()));
        return ret;
    }
//path
    //path__wo
    public SynTree visitPath__wo(constraintParser.Path__woContext ctx){
    	//todo:
    	//ret.add(visit(ctx.EVENT_INTERCEPTION());
        //return ret;
    	SynTree ret = new SynTree(NodeType.path);
    	ret.add(visit(ctx.link_idx()));
    	return ret;
        
    }
    //path__w
    public SynTree visitPath__w(constraintParser.Path__wContext ctx){
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
    public SynTree visitLink_idx(constraintParser.Link_idxContext ctx){
    	//todo:
    	//ret.add(visit(ctx.EVENT_INTERCEPTION());
        //return ret;
    	SynTree ret = new SynTree(NodeType.link_idx);
    	ret.add(ctx.INT().getText());
    	return ret;
    }
//virtual_topo
    public SynTree visitVirtual_topo(constraintParser.Virtual_topoContext ctx){
    	//todo:
    	//ret.add(visit(ctx.EVENT_INTERCEPTION());
        //return ret;
    	SynTree ret = new SynTree(NodeType.virtual_topo);
    	return ret;
        
    }
//switch_mapping
    //single_big_switch_
    public SynTree visitSingle_big_switch_(constraintParser.Single_big_switch_Context ctx){
    	//todo:
    	//ret.add(visit(ctx.EVENT_INTERCEPTION());
        //return ret;
    	SynTree ret = new SynTree(NodeType.switch_mapping);
    	return ret;
        
    }
    //virtual_switch_set_
    public SynTree visitVirtual_switch_set_(constraintParser.Virtual_switch_set_Context ctx){
    	//todo:
    	//ret.add(visit(ctx.EVENT_INTERCEPTION());
        //return ret;
    	SynTree ret = new SynTree(NodeType.switch_mapping);
    	return ret;
        
    }
//virtual_switch_set
    //virtual_switch_set__wo
    public SynTree visitVirtual_switch_set__wo(constraintParser.Virtual_switch_set__woContext ctx){
    	//todo:
    	//ret.add(visit(ctx.EVENT_INTERCEPTION());
        //return ret;
    	SynTree ret = new SynTree(NodeType.virtual_switch_set);
    	return ret;
        
    }
    //virtual_switch_set__w
    public SynTree visitVirtual_switch_set__w(constraintParser.Virtual_switch_set__wContext ctx){
    	//todo:
    	//ret.add(visit(ctx.EVENT_INTERCEPTION());
        //return ret;
    	SynTree ret = new SynTree(NodeType.virtual_switch_set);
    	return ret;
        
    }
//action
    //drop_
    public SynTree visitDrop_(constraintParser.Drop_Context ctx){
    	SynTree ret = new SynTree(NodeType.action);
    	ret.add(ctx.DROP().getText());
        return ret;
        
    }
    //forward_
    public SynTree visitForward_(constraintParser.Forward_Context ctx){
    	SynTree ret = new SynTree(NodeType.action);
    	ret.add(ctx.FORWARD().getText());
        return ret;   
    }
    //modify_
    public SynTree visitModify_(constraintParser.Modify_Context ctx){
    	SynTree ret = new SynTree(NodeType.action);
    	ret.add(ctx.MODIFY().getText());
        return ret;        
    }
    //modify_field_
    public SynTree visitModify_field_(constraintParser.Modify_field_Context ctx){
    	SynTree ret = new SynTree(NodeType.action);
    	ret.add(visit(ctx.field_list()));
        return ret;
    }
//field_list
    //filed__wo
    public SynTree visitFiled__wo(constraintParser.Filed__woContext ctx){
    	//SynTree ret = new SynTree(NodeType.field_list);
    	//ret.add(visit(ctx.field()));
        return visit(ctx.field());
    }
    //field__w
    public SynTree visitField__w(constraintParser.Field__wContext ctx){
    	SynTree ret = new SynTree(NodeType.field_list);
    	ret.add(visit(ctx.field()));
    	ret.add(visit(ctx.field_list()));
        return ret;
    }
//ownership
    //own_flows_
    public SynTree visitOwn_flows_(constraintParser.Own_flows_Context ctx){
    	SynTree ret = new SynTree(NodeType.ownership);
    	ret.add(ctx.OWN_FLOWS().getText());
        return ret;        
    }
    //others_flows_
    public SynTree visitOthers_flows_(constraintParser.Others_flows_Context ctx){
    	SynTree ret = new SynTree(NodeType.ownership);
    	ret.add(ctx.OTHERS_FLOWS().getText());
        return ret;        
    }
    //all_flows_
    public SynTree visitAll_flows_(constraintParser.All_flows_Context ctx){
    	SynTree ret = new SynTree(NodeType.ownership);
    	ret.add(ctx.ALL_FLOWS().getText());
        return ret;        
    }
//max_priority
    public SynTree visitMax_priority(constraintParser.Max_priorityContext ctx){
    	SynTree ret = new SynTree(NodeType.max_priority);
    	ret.data(Integer.valueOf(ctx.INT().getText()));
        return ret;
    }
//flow_table
    //flow_table__1
    public SynTree visitFlow_table__1(constraintParser.Flow_table__1Context ctx){
    	SynTree ret = new SynTree(NodeType.RULE_COUNT_PER_SWITCH);
    	ret.data(Integer.valueOf(ctx.INT().getText()));
        return ret;
    }
    //flow_table_2
    public SynTree visitFlow_table_2(constraintParser.Flow_table_2Context ctx){
    	SynTree ret = new SynTree(NodeType.SIZE_PERCENTAGE_PER_SWITCH);
    	ret.data(Float.valueOf(ctx.FLOAT().getText()));
        return ret;
    }
//notification
    //event_interception_
    public SynTree visitEvent_interception_(constraintParser.Event_interception_Context ctx){
    	SynTree ret = new SynTree(NodeType.notification);
    	ret.add(ctx.getText());
        return ret;
    }
  //modify_event_order_
    public SynTree visitModify_event_order_(constraintParser.Modify_event_order_Context ctx){
    	SynTree ret = new SynTree(NodeType.notification);
    	ret.add(ctx.getText());
        return ret;
    }
    public SynTree visitNotification(constraintParser.NotificationContext ctx){
    	SynTree ret = new SynTree(NodeType.notification);
    	ret.add(ctx.getText());
        return ret;
    }
//statistics
  //flow_level_
    public SynTree visitFlow_level_(constraintParser.Flow_level_Context ctx){
    	SynTree ret = new SynTree(NodeType.statistics);
    	ret.add(ctx.getText());
        return ret;
    }
    //port_level_
    public SynTree visitPort_level_(constraintParser.Port_level_Context ctx){
    	SynTree ret = new SynTree(NodeType.statistics);
    	ret.add(ctx.getText());
        return ret;
    }
    //switch_level_
    public SynTree visitSwitch_level_(constraintParser.Switch_level_Context ctx){
    	SynTree ret = new SynTree(NodeType.statistics);
    	ret.add(ctx.getText());
        return ret;
    }
}
