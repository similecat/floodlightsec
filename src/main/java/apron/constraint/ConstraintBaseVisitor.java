package apron.constraint;
// Generated from Constraint.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class ConstraintBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements ConstraintVisitor<T> {
	@Override public T visitBoolean_expr(ConstraintParser.Boolean_exprContext ctx) { return visitChildren(ctx); }

	@Override public T visitFieldS(ConstraintParser.FieldSContext ctx) { return visitChildren(ctx); }

	@Override public T visitFieldM(ConstraintParser.FieldMContext ctx) { return visitChildren(ctx); }

	@Override public T visitBind(ConstraintParser.BindContext ctx) { return visitChildren(ctx); }

	@Override public T visitSwitchLevel(ConstraintParser.SwitchLevelContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssertExpr(ConstraintParser.AssertExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitPhysicalTopo(ConstraintParser.PhysicalTopoContext ctx) { return visitChildren(ctx); }

	@Override public T visitActions(ConstraintParser.ActionsContext ctx) { return visitChildren(ctx); }

	@Override public T visitStatisticsS(ConstraintParser.StatisticsSContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssertStmtM(ConstraintParser.AssertStmtMContext ctx) { return visitChildren(ctx); }

	@Override public T visitFlowLevel(ConstraintParser.FlowLevelContext ctx) { return visitChildren(ctx); }

	@Override public T visitFilterTermFactor(ConstraintParser.FilterTermFactorContext ctx) { return visitChildren(ctx); }

	@Override public T visitVarPerm(ConstraintParser.VarPermContext ctx) { return visitChildren(ctx); }

	@Override public T visitPermS(ConstraintParser.PermSContext ctx) { return visitChildren(ctx); }

	@Override public T visitOwnFlows(ConstraintParser.OwnFlowsContext ctx) { return visitChildren(ctx); }

	@Override public T visitFilterExprAndTerm(ConstraintParser.FilterExprAndTermContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssertExclusive(ConstraintParser.AssertExclusiveContext ctx) { return visitChildren(ctx); }

	@Override public T visitBindList(ConstraintParser.BindListContext ctx) { return visitChildren(ctx); }

	@Override public T visitModifyEventOrder(ConstraintParser.ModifyEventOrderContext ctx) { return visitChildren(ctx); }

	@Override public T visitMaxPriority(ConstraintParser.MaxPriorityContext ctx) { return visitChildren(ctx); }

	@Override public T visitPermListM(ConstraintParser.PermListMContext ctx) { return visitChildren(ctx); }

	@Override public T visitAllPathsAsLinks(ConstraintParser.AllPathsAsLinksContext ctx) { return visitChildren(ctx); }

	@Override public T visitPermListS(ConstraintParser.PermListSContext ctx) { return visitChildren(ctx); }

	@Override public T visitFileDeny(ConstraintParser.FileDenyContext ctx) { return visitChildren(ctx); }

	@Override public T visitPortLevel(ConstraintParser.PortLevelContext ctx) { return visitChildren(ctx); }

	@Override public T visitExclusive(ConstraintParser.ExclusiveContext ctx) { return visitChildren(ctx); }

	@Override public T visitEventInterception(ConstraintParser.EventInterceptionContext ctx) { return visitChildren(ctx); }

	@Override public T visitAllSwitches(ConstraintParser.AllSwitchesContext ctx) { return visitChildren(ctx); }

	@Override public T visitBooleanExpr(ConstraintParser.BooleanExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitDrop(ConstraintParser.DropContext ctx) { return visitChildren(ctx); }

	@Override public T visitSingleBigSwitch(ConstraintParser.SingleBigSwitchContext ctx) { return visitChildren(ctx); }

	@Override public T visitValueListS(ConstraintParser.ValueListSContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssertNot(ConstraintParser.AssertNotContext ctx) { return visitChildren(ctx); }

	@Override public T visitSwIdxList(ConstraintParser.SwIdxListContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssertStmtS(ConstraintParser.AssertStmtSContext ctx) { return visitChildren(ctx); }

	@Override public T visitBorderSwitches(ConstraintParser.BorderSwitchesContext ctx) { return visitChildren(ctx); }

	@Override public T visitPhysical_topo(ConstraintParser.Physical_topoContext ctx) { return visitChildren(ctx); }

	@Override public T visitPermM(ConstraintParser.PermMContext ctx) { return visitChildren(ctx); }

	@Override public T visitLink_idx(ConstraintParser.Link_idxContext ctx) { return visitChildren(ctx); }

	@Override public T visitValueListM(ConstraintParser.ValueListMContext ctx) { return visitChildren(ctx); }

	@Override public T visitBindApp(ConstraintParser.BindAppContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssertOr(ConstraintParser.AssertOrContext ctx) { return visitChildren(ctx); }

	@Override public T visitPermExprUnion(ConstraintParser.PermExprUnionContext ctx) { return visitChildren(ctx); }

	@Override public T visitOthersFlows(ConstraintParser.OthersFlowsContext ctx) { return visitChildren(ctx); }

	@Override public T visitField(ConstraintParser.FieldContext ctx) { return visitChildren(ctx); }

	@Override public T visitLinkListS(ConstraintParser.LinkListSContext ctx) { return visitChildren(ctx); }

	@Override public T visitVirtualTopo(ConstraintParser.VirtualTopoContext ctx) { return visitChildren(ctx); }

	@Override public T visitFilterExprTerm(ConstraintParser.FilterExprTermContext ctx) { return visitChildren(ctx); }

	@Override public T visitLinkListM(ConstraintParser.LinkListMContext ctx) { return visitChildren(ctx); }

	@Override public T visitVirtualSwitchSetS(ConstraintParser.VirtualSwitchSetSContext ctx) { return visitChildren(ctx); }

	@Override public T visitMax_priority(ConstraintParser.Max_priorityContext ctx) { return visitChildren(ctx); }

	@Override public T visitValueRangeS(ConstraintParser.ValueRangeSContext ctx) { return visitChildren(ctx); }

	@Override public T visitValueRangeM(ConstraintParser.ValueRangeMContext ctx) { return visitChildren(ctx); }

	@Override public T visitBindExpr(ConstraintParser.BindExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitForward(ConstraintParser.ForwardContext ctx) { return visitChildren(ctx); }

	@Override public T visitNetworkDeny(ConstraintParser.NetworkDenyContext ctx) { return visitChildren(ctx); }

	@Override public T visitLinkM(ConstraintParser.LinkMContext ctx) { return visitChildren(ctx); }

	@Override public T visitVirtualSwitchSetM(ConstraintParser.VirtualSwitchSetMContext ctx) { return visitChildren(ctx); }

	@Override public T visitLinkS(ConstraintParser.LinkSContext ctx) { return visitChildren(ctx); }

	@Override public T visitVirtual_topo(ConstraintParser.Virtual_topoContext ctx) { return visitChildren(ctx); }

	@Override public T visitFlowTableB(ConstraintParser.FlowTableBContext ctx) { return visitChildren(ctx); }

	@Override public T visitFieldList(ConstraintParser.FieldListContext ctx) { return visitChildren(ctx); }

	@Override public T visitFlowTableA(ConstraintParser.FlowTableAContext ctx) { return visitChildren(ctx); }

	@Override public T visitSystemS(ConstraintParser.SystemSContext ctx) { return visitChildren(ctx); }

	@Override public T visitFileAllow(ConstraintParser.FileAllowContext ctx) { return visitChildren(ctx); }

	@Override public T visitCmp_operator(ConstraintParser.Cmp_operatorContext ctx) { return visitChildren(ctx); }

	@Override public T visitVar_perm(ConstraintParser.Var_permContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssertAnd(ConstraintParser.AssertAndContext ctx) { return visitChildren(ctx); }

	@Override public T visitProgram(ConstraintParser.ProgramContext ctx) { return visitChildren(ctx); }

	@Override public T visitSwIdxListS(ConstraintParser.SwIdxListSContext ctx) { return visitChildren(ctx); }

	@Override public T visitPktOut(ConstraintParser.PktOutContext ctx) { return visitChildren(ctx); }

	@Override public T visitFilterTermOrFactor(ConstraintParser.FilterTermOrFactorContext ctx) { return visitChildren(ctx); }

	@Override public T visitSwIdxListM(ConstraintParser.SwIdxListMContext ctx) { return visitChildren(ctx); }

	@Override public T visitIp_range(ConstraintParser.Ip_rangeContext ctx) { return visitChildren(ctx); }

	@Override public T visitTopology(ConstraintParser.TopologyContext ctx) { return visitChildren(ctx); }

	@Override public T visitAllFlows(ConstraintParser.AllFlowsContext ctx) { return visitChildren(ctx); }

	@Override public T visitNetworkAllow(ConstraintParser.NetworkAllowContext ctx) { return visitChildren(ctx); }

	@Override public T visitApp_name(ConstraintParser.App_nameContext ctx) { return visitChildren(ctx); }

	@Override public T visitPktOutAllow(ConstraintParser.PktOutAllowContext ctx) { return visitChildren(ctx); }

	@Override public T visitFlowTable(ConstraintParser.FlowTableContext ctx) { return visitChildren(ctx); }

	@Override public T visitOwnershipS(ConstraintParser.OwnershipSContext ctx) { return visitChildren(ctx); }

	@Override public T visitFilterFactorNotFactor(ConstraintParser.FilterFactorNotFactorContext ctx) { return visitChildren(ctx); }

	@Override public T visitFilterFactorNot(ConstraintParser.FilterFactorNotContext ctx) { return visitChildren(ctx); }

	@Override public T visitVirtualSwitchSet(ConstraintParser.VirtualSwitchSetContext ctx) { return visitChildren(ctx); }

	@Override public T visitFilterExpr(ConstraintParser.FilterExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitPathM(ConstraintParser.PathMContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssertList(ConstraintParser.AssertListContext ctx) { return visitChildren(ctx); }

	@Override public T visitPathS(ConstraintParser.PathSContext ctx) { return visitChildren(ctx); }

	@Override public T visitProcessAllow(ConstraintParser.ProcessAllowContext ctx) { return visitChildren(ctx); }

	@Override public T visitModify(ConstraintParser.ModifyContext ctx) { return visitChildren(ctx); }

	@Override public T visitAllDriectLinks(ConstraintParser.AllDriectLinksContext ctx) { return visitChildren(ctx); }

	@Override public T visitPerm_name(ConstraintParser.Perm_nameContext ctx) { return visitChildren(ctx); }

	@Override public T visitSw_idx(ConstraintParser.Sw_idxContext ctx) { return visitChildren(ctx); }

	@Override public T visitIp_format(ConstraintParser.Ip_formatContext ctx) { return visitChildren(ctx); }

	@Override public T visitModifyField(ConstraintParser.ModifyFieldContext ctx) { return visitChildren(ctx); }

	@Override public T visitPktOutDeny(ConstraintParser.PktOutDenyContext ctx) { return visitChildren(ctx); }

	@Override public T visitProcessDeny(ConstraintParser.ProcessDenyContext ctx) { return visitChildren(ctx); }

	@Override public T visitLinkList(ConstraintParser.LinkListContext ctx) { return visitChildren(ctx); }

	@Override public T visitNotificationS(ConstraintParser.NotificationSContext ctx) { return visitChildren(ctx); }

	@Override public T visitFlowPredicate(ConstraintParser.FlowPredicateContext ctx) { return visitChildren(ctx); }

	@Override public T visitIpRange(ConstraintParser.IpRangeContext ctx) { return visitChildren(ctx); }
}