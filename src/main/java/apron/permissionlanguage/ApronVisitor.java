package apron.permissionlanguage;
// Generated from Apron.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ApronVisitor<T> extends ParseTreeVisitor<T> {
	T visitVirtualSwitchSetS(ApronParser.VirtualSwitchSetSContext ctx);

	T visitFieldM(ApronParser.FieldMContext ctx);

	T visitMax_priority(ApronParser.Max_priorityContext ctx);

	T visitValueRangeS(ApronParser.ValueRangeSContext ctx);

	T visitSwitchLevel(ApronParser.SwitchLevelContext ctx);

	T visitValueRangeM(ApronParser.ValueRangeMContext ctx);

	T visitForward(ApronParser.ForwardContext ctx);

	T visitNetworkDeny(ApronParser.NetworkDenyContext ctx);

	T visitLinkM(ApronParser.LinkMContext ctx);

	T visitFinal(ApronParser.FinalContext ctx);

	T visitPhysicalTopo(ApronParser.PhysicalTopoContext ctx);

	T visitVirtualSwitchSetM(ApronParser.VirtualSwitchSetMContext ctx);

	T visitActions(ApronParser.ActionsContext ctx);

	T visitLinkS(ApronParser.LinkSContext ctx);

	T visitStatisticsS(ApronParser.StatisticsSContext ctx);

	T visitVirtual_topo(ApronParser.Virtual_topoContext ctx);

	T visitFlowLevel(ApronParser.FlowLevelContext ctx);

	T visitFlowTableB(ApronParser.FlowTableBContext ctx);

	T visitFilterTermFactor(ApronParser.FilterTermFactorContext ctx);

	T visitFlowTableA(ApronParser.FlowTableAContext ctx);

	T visitFieldList(ApronParser.FieldListContext ctx);

	T visitPermS(ApronParser.PermSContext ctx);

	T visitSystemS(ApronParser.SystemSContext ctx);

	T visitFileAllow(ApronParser.FileAllowContext ctx);

	T visitOwnFlows(ApronParser.OwnFlowsContext ctx);

	T visitFilterExprAndTerm(ApronParser.FilterExprAndTermContext ctx);

	T visitFiledS(ApronParser.FiledSContext ctx);

	T visitSwIdxListS(ApronParser.SwIdxListSContext ctx);

	T visitModifyEventOrder(ApronParser.ModifyEventOrderContext ctx);

	T visitPktOut(ApronParser.PktOutContext ctx);

	T visitFilterTermOrFactor(ApronParser.FilterTermOrFactorContext ctx);

	T visitMaxPriority(ApronParser.MaxPriorityContext ctx);

	T visitPermListM(ApronParser.PermListMContext ctx);

	T visitSwIdxListM(ApronParser.SwIdxListMContext ctx);

	T visitAllPathsAsLinks(ApronParser.AllPathsAsLinksContext ctx);

	T visitPermListS(ApronParser.PermListSContext ctx);

	T visitFileDeny(ApronParser.FileDenyContext ctx);

	T visitPortLevel(ApronParser.PortLevelContext ctx);

	T visitIp_range(ApronParser.Ip_rangeContext ctx);

	T visitNetworkAllow(ApronParser.NetworkAllowContext ctx);

	T visitAllFlows(ApronParser.AllFlowsContext ctx);

	T visitTopology(ApronParser.TopologyContext ctx);

	T visitEventInterception(ApronParser.EventInterceptionContext ctx);

	T visitPktOutAllow(ApronParser.PktOutAllowContext ctx);

	T visitFlowTable(ApronParser.FlowTableContext ctx);

	T visitOwnershipS(ApronParser.OwnershipSContext ctx);

	T visitFilterFactorNotFactor(ApronParser.FilterFactorNotFactorContext ctx);

	T visitVirtualSwitchSet(ApronParser.VirtualSwitchSetContext ctx);

	T visitFilterFactorNot(ApronParser.FilterFactorNotContext ctx);

	T visitAllSwitches(ApronParser.AllSwitchesContext ctx);

	T visitDrop(ApronParser.DropContext ctx);

	T visitFilterExpr(ApronParser.FilterExprContext ctx);

	T visitSingleBigSwitch(ApronParser.SingleBigSwitchContext ctx);

	T visitValueListS(ApronParser.ValueListSContext ctx);

	T visitPathM(ApronParser.PathMContext ctx);

	T visitSwIdxList(ApronParser.SwIdxListContext ctx);

	T visitBorderSwitches(ApronParser.BorderSwitchesContext ctx);

	T visitPathS(ApronParser.PathSContext ctx);

	T visitProcessAllow(ApronParser.ProcessAllowContext ctx);

	T visitModify(ApronParser.ModifyContext ctx);

	T visitPhysical_topo(ApronParser.Physical_topoContext ctx);

	T visitPermM(ApronParser.PermMContext ctx);

	T visitLink_idx(ApronParser.Link_idxContext ctx);

	T visitAllDriectLinks(ApronParser.AllDriectLinksContext ctx);

	T visitValueListM(ApronParser.ValueListMContext ctx);

	T visitPerm_name(ApronParser.Perm_nameContext ctx);

	T visitSw_idx(ApronParser.Sw_idxContext ctx);

	T visitModifyField(ApronParser.ModifyFieldContext ctx);

	T visitIp_format(ApronParser.Ip_formatContext ctx);

	T visitPktOutDeny(ApronParser.PktOutDenyContext ctx);

	T visitProcessDeny(ApronParser.ProcessDenyContext ctx);

	T visitLinkList(ApronParser.LinkListContext ctx);

	T visitOthersFlows(ApronParser.OthersFlowsContext ctx);

	T visitNotificationS(ApronParser.NotificationSContext ctx);

	T visitField(ApronParser.FieldContext ctx);

	T visitLinkListS(ApronParser.LinkListSContext ctx);

	T visitVirtualTopo(ApronParser.VirtualTopoContext ctx);

	T visitFilterExprTerm(ApronParser.FilterExprTermContext ctx);

	T visitFlowPredicate(ApronParser.FlowPredicateContext ctx);

	T visitLinkListM(ApronParser.LinkListMContext ctx);

	T visitIpRange(ApronParser.IpRangeContext ctx);
}