package ConsLan;
// Generated from constraint.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface constraintVisitor<T> extends ParseTreeVisitor<T> {
	T visitModify_event_order_(constraintParser.Modify_event_order_Context ctx);

	T visitBoolean_expr(constraintParser.Boolean_exprContext ctx);

	T visitValue_list__w(constraintParser.Value_list__wContext ctx);

	T visitField_(constraintParser.Field_Context ctx);

	T visitBind_list(constraintParser.Bind_listContext ctx);

	T visitStatistics_(constraintParser.Statistics_Context ctx);

	T visitAssert_bool(constraintParser.Assert_boolContext ctx);

	T visitAll_paths_as_links_(constraintParser.All_paths_as_links_Context ctx);

	T visitAll_switches_(constraintParser.All_switches_Context ctx);

	T visitFlow_table_(constraintParser.Flow_table_Context ctx);

	T visitFilter_expr_(constraintParser.Filter_expr_Context ctx);

	T visitMax_priority(constraintParser.Max_priorityContext ctx);

	T visitField__w(constraintParser.Field__wContext ctx);

	T visitVirtual_topo_(constraintParser.Virtual_topo_Context ctx);

	T visitNotification_(constraintParser.Notification_Context ctx);

	T visitLink_list__w(constraintParser.Link_list__wContext ctx);

	T visitEvent_interception_(constraintParser.Event_interception_Context ctx);

	T visitValue_list__s(constraintParser.Value_list__sContext ctx);

	T visitPerm_expr_union(constraintParser.Perm_expr_unionContext ctx);

	T visitFilter_expr__term(constraintParser.Filter_expr__termContext ctx);

	T visitPerm_expr__wo(constraintParser.Perm_expr__woContext ctx);

	T visitVirtual_switch_set__w(constraintParser.Virtual_switch_set__wContext ctx);

	T visitFlow_level_(constraintParser.Flow_level_Context ctx);

	T visitVirtual_topo(constraintParser.Virtual_topoContext ctx);

	T visitLink__wo(constraintParser.Link__woContext ctx);

	T visitBind_(constraintParser.Bind_Context ctx);

	T visitLink__w(constraintParser.Link__wContext ctx);

	T visitCmp_operator(constraintParser.Cmp_operatorContext ctx);

	T visitPath__w(constraintParser.Path__wContext ctx);

	T visitAssert_and(constraintParser.Assert_andContext ctx);

	T visitAssert_list_(constraintParser.Assert_list_Context ctx);

	T visitVar_perm(constraintParser.Var_permContext ctx);

	T visitPath__wo(constraintParser.Path__woContext ctx);

	T visitProgram(constraintParser.ProgramContext ctx);

	T visitFlow_predicate_(constraintParser.Flow_predicate_Context ctx);

	T visitBorder_switches_(constraintParser.Border_switches_Context ctx);

	T visitForward_(constraintParser.Forward_Context ctx);

	T visitPerm_list__w(constraintParser.Perm_list__wContext ctx);

	T visitAssert_stmt__w(constraintParser.Assert_stmt__wContext ctx);

	T visitSwitch_level_(constraintParser.Switch_level_Context ctx);

	T visitBind_expr(constraintParser.Bind_exprContext ctx);

	T visitFilter_term__factor(constraintParser.Filter_term__factorContext ctx);

	T visitExclusive(constraintParser.ExclusiveContext ctx);

	T visitIp_range(constraintParser.Ip_rangeContext ctx);

	T visitAssert_st_expr(constraintParser.Assert_st_exprContext ctx);

	T visitAssert_or(constraintParser.Assert_orContext ctx);

	T visitLink_list_(constraintParser.Link_list_Context ctx);

	T visitApp_name(constraintParser.App_nameContext ctx);

	T visitFlow_table__1(constraintParser.Flow_table__1Context ctx);

	T visitDrop_(constraintParser.Drop_Context ctx);

	T visitAssert_stmt__wo(constraintParser.Assert_stmt__woContext ctx);

	T visitSingle_big_switch_(constraintParser.Single_big_switch_Context ctx);

	T visitVirtual_switch_set_(constraintParser.Virtual_switch_set_Context ctx);

	T visitSw_idx_list__wo(constraintParser.Sw_idx_list__woContext ctx);

	T visitAssert_st_exc(constraintParser.Assert_st_excContext ctx);

	T visitFiled__wo(constraintParser.Filed__woContext ctx);

	T visitModify_(constraintParser.Modify_Context ctx);

	T visitSw_idx_list_(constraintParser.Sw_idx_list_Context ctx);

	T visitFlow_table_2(constraintParser.Flow_table_2Context ctx);

	T visitPerm_list__wo(constraintParser.Perm_list__woContext ctx);

	T visitOwnership_(constraintParser.Ownership_Context ctx);

	T visitIp_range_(constraintParser.Ip_range_Context ctx);

	T visitPhysical_topo(constraintParser.Physical_topoContext ctx);

	T visitBind_app(constraintParser.Bind_appContext ctx);

	T visitPerm__wo(constraintParser.Perm__woContext ctx);

	T visitFilter_factor__not_factor(constraintParser.Filter_factor__not_factorContext ctx);

	T visitLink_idx(constraintParser.Link_idxContext ctx);

	T visitValue_range_w(constraintParser.Value_range_wContext ctx);

	T visitPerm_name(constraintParser.Perm_nameContext ctx);

	T visitOwn_flows_(constraintParser.Own_flows_Context ctx);

	T visitAssert_not(constraintParser.Assert_notContext ctx);

	T visitValue_range_s(constraintParser.Value_range_sContext ctx);

	T visitSw_idx(constraintParser.Sw_idxContext ctx);

	T visitIp_format(constraintParser.Ip_formatContext ctx);

	T visitMax_priority_(constraintParser.Max_priority_Context ctx);

	T visitTopo_(constraintParser.Topo_Context ctx);

	T visitAll_flows_(constraintParser.All_flows_Context ctx);

	T visitPhysical_topo_(constraintParser.Physical_topo_Context ctx);

	T visitVirtual_switch_set__wo(constraintParser.Virtual_switch_set__woContext ctx);

	T visitFilter_expr__expr_and_term(constraintParser.Filter_expr__expr_and_termContext ctx);

	T visitFilter_term__term_or_factor(constraintParser.Filter_term__term_or_factorContext ctx);

	T visitAction_(constraintParser.Action_Context ctx);

	T visitSw_idx_list__w(constraintParser.Sw_idx_list__wContext ctx);

	T visitOthers_flows_(constraintParser.Others_flows_Context ctx);

	T visitAll_driect_links_(constraintParser.All_driect_links_Context ctx);

	T visitField(constraintParser.FieldContext ctx);

	T visitLink_list__wo(constraintParser.Link_list__woContext ctx);

	T visitPerm__w(constraintParser.Perm__wContext ctx);

	T visitPort_level_(constraintParser.Port_level_Context ctx);

	T visitModify_field_(constraintParser.Modify_field_Context ctx);

	T visitFilter_factor__NOT(constraintParser.Filter_factor__NOTContext ctx);
}