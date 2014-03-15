package apron.constraint;
// Generated from Constraint.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ConstraintVisitor<T> extends ParseTreeVisitor<T> {
	T visitBoolean_expr(ConstraintParser.Boolean_exprContext ctx);

	T visitFieldS(ConstraintParser.FieldSContext ctx);

	T visitPriorityMin(ConstraintParser.PriorityMinContext ctx);

	T visitFieldM(ConstraintParser.FieldMContext ctx);

	T visitBind(ConstraintParser.BindContext ctx);

	T visitSwitchLevel(ConstraintParser.SwitchLevelContext ctx);

	T visitAssertExpr(ConstraintParser.AssertExprContext ctx);

	T visitPhysicalTopo(ConstraintParser.PhysicalTopoContext ctx);

	T visitActions(ConstraintParser.ActionsContext ctx);

	T visitStatisticsS(ConstraintParser.StatisticsSContext ctx);

	T visitAssertStmtM(ConstraintParser.AssertStmtMContext ctx);

	T visitFlowLevel(ConstraintParser.FlowLevelContext ctx);

	T visitFilterTermFactor(ConstraintParser.FilterTermFactorContext ctx);

	T visitVarPerm(ConstraintParser.VarPermContext ctx);

	T visitPermS(ConstraintParser.PermSContext ctx);

	T visitOwnFlows(ConstraintParser.OwnFlowsContext ctx);

	T visitFilterExprAndTerm(ConstraintParser.FilterExprAndTermContext ctx);

	T visitAssertExclusive(ConstraintParser.AssertExclusiveContext ctx);

	T visitBindList(ConstraintParser.BindListContext ctx);

	T visitModifyEventOrder(ConstraintParser.ModifyEventOrderContext ctx);

	T visitMaxPriority(ConstraintParser.MaxPriorityContext ctx);

	T visitPermListM(ConstraintParser.PermListMContext ctx);

	T visitAllPathsAsLinks(ConstraintParser.AllPathsAsLinksContext ctx);

	T visitPermListS(ConstraintParser.PermListSContext ctx);

	T visitFileDeny(ConstraintParser.FileDenyContext ctx);

	T visitPortLevel(ConstraintParser.PortLevelContext ctx);

	T visitExclusive(ConstraintParser.ExclusiveContext ctx);

	T visitEventInterception(ConstraintParser.EventInterceptionContext ctx);

	T visitAllSwitches(ConstraintParser.AllSwitchesContext ctx);

	T visitBooleanExpr(ConstraintParser.BooleanExprContext ctx);

	T visitDrop(ConstraintParser.DropContext ctx);

	T visitValIp(ConstraintParser.ValIpContext ctx);

	T visitSingleBigSwitch(ConstraintParser.SingleBigSwitchContext ctx);

	T visitAssertNot(ConstraintParser.AssertNotContext ctx);

	T visitSwIdxList(ConstraintParser.SwIdxListContext ctx);

	T visitAssertStmtS(ConstraintParser.AssertStmtSContext ctx);

	T visitBorderSwitches(ConstraintParser.BorderSwitchesContext ctx);

	T visitPhysical_topo(ConstraintParser.Physical_topoContext ctx);

	T visitPermM(ConstraintParser.PermMContext ctx);

	T visitLink_idx(ConstraintParser.Link_idxContext ctx);

	T visitBindApp(ConstraintParser.BindAppContext ctx);

	T visitValInt(ConstraintParser.ValIntContext ctx);

	T visitAssertOr(ConstraintParser.AssertOrContext ctx);

	T visitPermExprUnion(ConstraintParser.PermExprUnionContext ctx);

	T visitOthersFlows(ConstraintParser.OthersFlowsContext ctx);

	T visitField(ConstraintParser.FieldContext ctx);

	T visitLinkListS(ConstraintParser.LinkListSContext ctx);

	T visitVirtualTopo(ConstraintParser.VirtualTopoContext ctx);

	T visitFilterExprTerm(ConstraintParser.FilterExprTermContext ctx);

	T visitLinkListM(ConstraintParser.LinkListMContext ctx);

	T visitVirtualSwitchSetS(ConstraintParser.VirtualSwitchSetSContext ctx);

	T visitWildcard(ConstraintParser.WildcardContext ctx);

	T visitBindExpr(ConstraintParser.BindExprContext ctx);

	T visitForward(ConstraintParser.ForwardContext ctx);

	T visitNetworkDeny(ConstraintParser.NetworkDenyContext ctx);

	T visitLinkM(ConstraintParser.LinkMContext ctx);

	T visitVirtualSwitchSetM(ConstraintParser.VirtualSwitchSetMContext ctx);

	T visitLinkS(ConstraintParser.LinkSContext ctx);

	T visitVirtual_topo(ConstraintParser.Virtual_topoContext ctx);

	T visitFieldMask(ConstraintParser.FieldMaskContext ctx);

	T visitFlowTableB(ConstraintParser.FlowTableBContext ctx);

	T visitFlowTableA(ConstraintParser.FlowTableAContext ctx);

	T visitSystemS(ConstraintParser.SystemSContext ctx);

	T visitFileAllow(ConstraintParser.FileAllowContext ctx);

	T visitCmp_operator(ConstraintParser.Cmp_operatorContext ctx);

	T visitVar_perm(ConstraintParser.Var_permContext ctx);

	T visitAssertAnd(ConstraintParser.AssertAndContext ctx);

	T visitProgram(ConstraintParser.ProgramContext ctx);

	T visitSwIdxListS(ConstraintParser.SwIdxListSContext ctx);

	T visitFieldVal(ConstraintParser.FieldValContext ctx);

	T visitPktOut(ConstraintParser.PktOutContext ctx);

	T visitFilterTermOrFactor(ConstraintParser.FilterTermOrFactorContext ctx);

	T visitSwIdxListM(ConstraintParser.SwIdxListMContext ctx);

	T visitTopology(ConstraintParser.TopologyContext ctx);

	T visitAllFlows(ConstraintParser.AllFlowsContext ctx);

	T visitNetworkAllow(ConstraintParser.NetworkAllowContext ctx);

	T visitApp_name(ConstraintParser.App_nameContext ctx);

	T visitPktOutAllow(ConstraintParser.PktOutAllowContext ctx);

	T visitFlowTable(ConstraintParser.FlowTableContext ctx);

	T visitOwnershipS(ConstraintParser.OwnershipSContext ctx);

	T visitFilterFactorNotFactor(ConstraintParser.FilterFactorNotFactorContext ctx);

	T visitFilterFactorNot(ConstraintParser.FilterFactorNotContext ctx);

	T visitVirtualSwitchSet(ConstraintParser.VirtualSwitchSetContext ctx);

	T visitFilterExpr(ConstraintParser.FilterExprContext ctx);

	T visitPathM(ConstraintParser.PathMContext ctx);

	T visitAssertList(ConstraintParser.AssertListContext ctx);

	T visitPathS(ConstraintParser.PathSContext ctx);

	T visitProcessAllow(ConstraintParser.ProcessAllowContext ctx);

	T visitModify(ConstraintParser.ModifyContext ctx);

	T visitAllDriectLinks(ConstraintParser.AllDriectLinksContext ctx);

	T visitPriorityMax(ConstraintParser.PriorityMaxContext ctx);

	T visitPerm_name(ConstraintParser.Perm_nameContext ctx);

	T visitSw_idx(ConstraintParser.Sw_idxContext ctx);

	T visitModifyField(ConstraintParser.ModifyFieldContext ctx);

	T visitPktOutDeny(ConstraintParser.PktOutDenyContext ctx);

	T visitProcessDeny(ConstraintParser.ProcessDenyContext ctx);

	T visitLinkList(ConstraintParser.LinkListContext ctx);

	T visitNotificationS(ConstraintParser.NotificationSContext ctx);

	T visitFlowPredicate(ConstraintParser.FlowPredicateContext ctx);
}