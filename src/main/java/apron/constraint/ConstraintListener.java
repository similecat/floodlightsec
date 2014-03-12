package apron.constraint;
// Generated from Constraint.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ConstraintListener extends ParseTreeListener {
	void enterBoolean_expr(ConstraintParser.Boolean_exprContext ctx);
	void exitBoolean_expr(ConstraintParser.Boolean_exprContext ctx);

	void enterFieldS(ConstraintParser.FieldSContext ctx);
	void exitFieldS(ConstraintParser.FieldSContext ctx);

	void enterFieldM(ConstraintParser.FieldMContext ctx);
	void exitFieldM(ConstraintParser.FieldMContext ctx);

	void enterBind(ConstraintParser.BindContext ctx);
	void exitBind(ConstraintParser.BindContext ctx);

	void enterSwitchLevel(ConstraintParser.SwitchLevelContext ctx);
	void exitSwitchLevel(ConstraintParser.SwitchLevelContext ctx);

	void enterAssertExpr(ConstraintParser.AssertExprContext ctx);
	void exitAssertExpr(ConstraintParser.AssertExprContext ctx);

	void enterPhysicalTopo(ConstraintParser.PhysicalTopoContext ctx);
	void exitPhysicalTopo(ConstraintParser.PhysicalTopoContext ctx);

	void enterActions(ConstraintParser.ActionsContext ctx);
	void exitActions(ConstraintParser.ActionsContext ctx);

	void enterStatisticsS(ConstraintParser.StatisticsSContext ctx);
	void exitStatisticsS(ConstraintParser.StatisticsSContext ctx);

	void enterAssertStmtM(ConstraintParser.AssertStmtMContext ctx);
	void exitAssertStmtM(ConstraintParser.AssertStmtMContext ctx);

	void enterFlowLevel(ConstraintParser.FlowLevelContext ctx);
	void exitFlowLevel(ConstraintParser.FlowLevelContext ctx);

	void enterFilterTermFactor(ConstraintParser.FilterTermFactorContext ctx);
	void exitFilterTermFactor(ConstraintParser.FilterTermFactorContext ctx);

	void enterVarPerm(ConstraintParser.VarPermContext ctx);
	void exitVarPerm(ConstraintParser.VarPermContext ctx);

	void enterPermS(ConstraintParser.PermSContext ctx);
	void exitPermS(ConstraintParser.PermSContext ctx);

	void enterOwnFlows(ConstraintParser.OwnFlowsContext ctx);
	void exitOwnFlows(ConstraintParser.OwnFlowsContext ctx);

	void enterFilterExprAndTerm(ConstraintParser.FilterExprAndTermContext ctx);
	void exitFilterExprAndTerm(ConstraintParser.FilterExprAndTermContext ctx);

	void enterAssertExclusive(ConstraintParser.AssertExclusiveContext ctx);
	void exitAssertExclusive(ConstraintParser.AssertExclusiveContext ctx);

	void enterBindList(ConstraintParser.BindListContext ctx);
	void exitBindList(ConstraintParser.BindListContext ctx);

	void enterModifyEventOrder(ConstraintParser.ModifyEventOrderContext ctx);
	void exitModifyEventOrder(ConstraintParser.ModifyEventOrderContext ctx);

	void enterMaxPriority(ConstraintParser.MaxPriorityContext ctx);
	void exitMaxPriority(ConstraintParser.MaxPriorityContext ctx);

	void enterPermListM(ConstraintParser.PermListMContext ctx);
	void exitPermListM(ConstraintParser.PermListMContext ctx);

	void enterAllPathsAsLinks(ConstraintParser.AllPathsAsLinksContext ctx);
	void exitAllPathsAsLinks(ConstraintParser.AllPathsAsLinksContext ctx);

	void enterPermListS(ConstraintParser.PermListSContext ctx);
	void exitPermListS(ConstraintParser.PermListSContext ctx);

	void enterFileDeny(ConstraintParser.FileDenyContext ctx);
	void exitFileDeny(ConstraintParser.FileDenyContext ctx);

	void enterPortLevel(ConstraintParser.PortLevelContext ctx);
	void exitPortLevel(ConstraintParser.PortLevelContext ctx);

	void enterExclusive(ConstraintParser.ExclusiveContext ctx);
	void exitExclusive(ConstraintParser.ExclusiveContext ctx);

	void enterEventInterception(ConstraintParser.EventInterceptionContext ctx);
	void exitEventInterception(ConstraintParser.EventInterceptionContext ctx);

	void enterAllSwitches(ConstraintParser.AllSwitchesContext ctx);
	void exitAllSwitches(ConstraintParser.AllSwitchesContext ctx);

	void enterBooleanExpr(ConstraintParser.BooleanExprContext ctx);
	void exitBooleanExpr(ConstraintParser.BooleanExprContext ctx);

	void enterDrop(ConstraintParser.DropContext ctx);
	void exitDrop(ConstraintParser.DropContext ctx);

	void enterSingleBigSwitch(ConstraintParser.SingleBigSwitchContext ctx);
	void exitSingleBigSwitch(ConstraintParser.SingleBigSwitchContext ctx);

	void enterValueListS(ConstraintParser.ValueListSContext ctx);
	void exitValueListS(ConstraintParser.ValueListSContext ctx);

	void enterAssertNot(ConstraintParser.AssertNotContext ctx);
	void exitAssertNot(ConstraintParser.AssertNotContext ctx);

	void enterSwIdxList(ConstraintParser.SwIdxListContext ctx);
	void exitSwIdxList(ConstraintParser.SwIdxListContext ctx);

	void enterAssertStmtS(ConstraintParser.AssertStmtSContext ctx);
	void exitAssertStmtS(ConstraintParser.AssertStmtSContext ctx);

	void enterBorderSwitches(ConstraintParser.BorderSwitchesContext ctx);
	void exitBorderSwitches(ConstraintParser.BorderSwitchesContext ctx);

	void enterPhysical_topo(ConstraintParser.Physical_topoContext ctx);
	void exitPhysical_topo(ConstraintParser.Physical_topoContext ctx);

	void enterPermM(ConstraintParser.PermMContext ctx);
	void exitPermM(ConstraintParser.PermMContext ctx);

	void enterLink_idx(ConstraintParser.Link_idxContext ctx);
	void exitLink_idx(ConstraintParser.Link_idxContext ctx);

	void enterValueListM(ConstraintParser.ValueListMContext ctx);
	void exitValueListM(ConstraintParser.ValueListMContext ctx);

	void enterBindApp(ConstraintParser.BindAppContext ctx);
	void exitBindApp(ConstraintParser.BindAppContext ctx);

	void enterAssertOr(ConstraintParser.AssertOrContext ctx);
	void exitAssertOr(ConstraintParser.AssertOrContext ctx);

	void enterPermExprUnion(ConstraintParser.PermExprUnionContext ctx);
	void exitPermExprUnion(ConstraintParser.PermExprUnionContext ctx);

	void enterOthersFlows(ConstraintParser.OthersFlowsContext ctx);
	void exitOthersFlows(ConstraintParser.OthersFlowsContext ctx);

	void enterField(ConstraintParser.FieldContext ctx);
	void exitField(ConstraintParser.FieldContext ctx);

	void enterLinkListS(ConstraintParser.LinkListSContext ctx);
	void exitLinkListS(ConstraintParser.LinkListSContext ctx);

	void enterVirtualTopo(ConstraintParser.VirtualTopoContext ctx);
	void exitVirtualTopo(ConstraintParser.VirtualTopoContext ctx);

	void enterFilterExprTerm(ConstraintParser.FilterExprTermContext ctx);
	void exitFilterExprTerm(ConstraintParser.FilterExprTermContext ctx);

	void enterLinkListM(ConstraintParser.LinkListMContext ctx);
	void exitLinkListM(ConstraintParser.LinkListMContext ctx);

	void enterVirtualSwitchSetS(ConstraintParser.VirtualSwitchSetSContext ctx);
	void exitVirtualSwitchSetS(ConstraintParser.VirtualSwitchSetSContext ctx);

	void enterMax_priority(ConstraintParser.Max_priorityContext ctx);
	void exitMax_priority(ConstraintParser.Max_priorityContext ctx);

	void enterValueRangeS(ConstraintParser.ValueRangeSContext ctx);
	void exitValueRangeS(ConstraintParser.ValueRangeSContext ctx);

	void enterValueRangeM(ConstraintParser.ValueRangeMContext ctx);
	void exitValueRangeM(ConstraintParser.ValueRangeMContext ctx);

	void enterBindExpr(ConstraintParser.BindExprContext ctx);
	void exitBindExpr(ConstraintParser.BindExprContext ctx);

	void enterForward(ConstraintParser.ForwardContext ctx);
	void exitForward(ConstraintParser.ForwardContext ctx);

	void enterNetworkDeny(ConstraintParser.NetworkDenyContext ctx);
	void exitNetworkDeny(ConstraintParser.NetworkDenyContext ctx);

	void enterLinkM(ConstraintParser.LinkMContext ctx);
	void exitLinkM(ConstraintParser.LinkMContext ctx);

	void enterVirtualSwitchSetM(ConstraintParser.VirtualSwitchSetMContext ctx);
	void exitVirtualSwitchSetM(ConstraintParser.VirtualSwitchSetMContext ctx);

	void enterLinkS(ConstraintParser.LinkSContext ctx);
	void exitLinkS(ConstraintParser.LinkSContext ctx);

	void enterVirtual_topo(ConstraintParser.Virtual_topoContext ctx);
	void exitVirtual_topo(ConstraintParser.Virtual_topoContext ctx);

	void enterFlowTableB(ConstraintParser.FlowTableBContext ctx);
	void exitFlowTableB(ConstraintParser.FlowTableBContext ctx);

	void enterFieldList(ConstraintParser.FieldListContext ctx);
	void exitFieldList(ConstraintParser.FieldListContext ctx);

	void enterFlowTableA(ConstraintParser.FlowTableAContext ctx);
	void exitFlowTableA(ConstraintParser.FlowTableAContext ctx);

	void enterSystemS(ConstraintParser.SystemSContext ctx);
	void exitSystemS(ConstraintParser.SystemSContext ctx);

	void enterFileAllow(ConstraintParser.FileAllowContext ctx);
	void exitFileAllow(ConstraintParser.FileAllowContext ctx);

	void enterCmp_operator(ConstraintParser.Cmp_operatorContext ctx);
	void exitCmp_operator(ConstraintParser.Cmp_operatorContext ctx);

	void enterVar_perm(ConstraintParser.Var_permContext ctx);
	void exitVar_perm(ConstraintParser.Var_permContext ctx);

	void enterAssertAnd(ConstraintParser.AssertAndContext ctx);
	void exitAssertAnd(ConstraintParser.AssertAndContext ctx);

	void enterProgram(ConstraintParser.ProgramContext ctx);
	void exitProgram(ConstraintParser.ProgramContext ctx);

	void enterSwIdxListS(ConstraintParser.SwIdxListSContext ctx);
	void exitSwIdxListS(ConstraintParser.SwIdxListSContext ctx);

	void enterPktOut(ConstraintParser.PktOutContext ctx);
	void exitPktOut(ConstraintParser.PktOutContext ctx);

	void enterFilterTermOrFactor(ConstraintParser.FilterTermOrFactorContext ctx);
	void exitFilterTermOrFactor(ConstraintParser.FilterTermOrFactorContext ctx);

	void enterSwIdxListM(ConstraintParser.SwIdxListMContext ctx);
	void exitSwIdxListM(ConstraintParser.SwIdxListMContext ctx);

	void enterIp_range(ConstraintParser.Ip_rangeContext ctx);
	void exitIp_range(ConstraintParser.Ip_rangeContext ctx);

	void enterTopology(ConstraintParser.TopologyContext ctx);
	void exitTopology(ConstraintParser.TopologyContext ctx);

	void enterAllFlows(ConstraintParser.AllFlowsContext ctx);
	void exitAllFlows(ConstraintParser.AllFlowsContext ctx);

	void enterNetworkAllow(ConstraintParser.NetworkAllowContext ctx);
	void exitNetworkAllow(ConstraintParser.NetworkAllowContext ctx);

	void enterApp_name(ConstraintParser.App_nameContext ctx);
	void exitApp_name(ConstraintParser.App_nameContext ctx);

	void enterPktOutAllow(ConstraintParser.PktOutAllowContext ctx);
	void exitPktOutAllow(ConstraintParser.PktOutAllowContext ctx);

	void enterFlowTable(ConstraintParser.FlowTableContext ctx);
	void exitFlowTable(ConstraintParser.FlowTableContext ctx);

	void enterOwnershipS(ConstraintParser.OwnershipSContext ctx);
	void exitOwnershipS(ConstraintParser.OwnershipSContext ctx);

	void enterFilterFactorNotFactor(ConstraintParser.FilterFactorNotFactorContext ctx);
	void exitFilterFactorNotFactor(ConstraintParser.FilterFactorNotFactorContext ctx);

	void enterFilterFactorNot(ConstraintParser.FilterFactorNotContext ctx);
	void exitFilterFactorNot(ConstraintParser.FilterFactorNotContext ctx);

	void enterVirtualSwitchSet(ConstraintParser.VirtualSwitchSetContext ctx);
	void exitVirtualSwitchSet(ConstraintParser.VirtualSwitchSetContext ctx);

	void enterFilterExpr(ConstraintParser.FilterExprContext ctx);
	void exitFilterExpr(ConstraintParser.FilterExprContext ctx);

	void enterPathM(ConstraintParser.PathMContext ctx);
	void exitPathM(ConstraintParser.PathMContext ctx);

	void enterAssertList(ConstraintParser.AssertListContext ctx);
	void exitAssertList(ConstraintParser.AssertListContext ctx);

	void enterPathS(ConstraintParser.PathSContext ctx);
	void exitPathS(ConstraintParser.PathSContext ctx);

	void enterProcessAllow(ConstraintParser.ProcessAllowContext ctx);
	void exitProcessAllow(ConstraintParser.ProcessAllowContext ctx);

	void enterModify(ConstraintParser.ModifyContext ctx);
	void exitModify(ConstraintParser.ModifyContext ctx);

	void enterAllDriectLinks(ConstraintParser.AllDriectLinksContext ctx);
	void exitAllDriectLinks(ConstraintParser.AllDriectLinksContext ctx);

	void enterPerm_name(ConstraintParser.Perm_nameContext ctx);
	void exitPerm_name(ConstraintParser.Perm_nameContext ctx);

	void enterSw_idx(ConstraintParser.Sw_idxContext ctx);
	void exitSw_idx(ConstraintParser.Sw_idxContext ctx);

	void enterIp_format(ConstraintParser.Ip_formatContext ctx);
	void exitIp_format(ConstraintParser.Ip_formatContext ctx);

	void enterModifyField(ConstraintParser.ModifyFieldContext ctx);
	void exitModifyField(ConstraintParser.ModifyFieldContext ctx);

	void enterPktOutDeny(ConstraintParser.PktOutDenyContext ctx);
	void exitPktOutDeny(ConstraintParser.PktOutDenyContext ctx);

	void enterProcessDeny(ConstraintParser.ProcessDenyContext ctx);
	void exitProcessDeny(ConstraintParser.ProcessDenyContext ctx);

	void enterLinkList(ConstraintParser.LinkListContext ctx);
	void exitLinkList(ConstraintParser.LinkListContext ctx);

	void enterNotificationS(ConstraintParser.NotificationSContext ctx);
	void exitNotificationS(ConstraintParser.NotificationSContext ctx);

	void enterFlowPredicate(ConstraintParser.FlowPredicateContext ctx);
	void exitFlowPredicate(ConstraintParser.FlowPredicateContext ctx);

	void enterIpRange(ConstraintParser.IpRangeContext ctx);
	void exitIpRange(ConstraintParser.IpRangeContext ctx);
}