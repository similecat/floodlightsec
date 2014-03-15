package apron.permissionlanguage;

import apron.syntaxtree.*;
public class SyntaxGenerator extends ApronBaseVisitor <SyntaxTree>{
    public SyntaxTree visitFinal(ApronParser.FinalContext ctx){
        SyntaxTree ret = new SyntaxTree(NodeType.program);
        ret.add(visit(ctx.perm_list()));
        return ret;
    }
    public SyntaxTree visitPermListS(ApronParser.PermListSContext ctx){
        SyntaxTree ret = new SyntaxTree(NodeType.perm_list);
        ret.add(visit(ctx.perm()));
        return ret;
    }
    public SyntaxTree visitPermListM(ApronParser.PermListMContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.perm_list);
        ret.add(visit(ctx.perm()));
        ret.add(visit(ctx.perm_list()));
        return ret;
    }
    public SyntaxTree visitPermS(ApronParser.PermSContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.perm);
        ret.add(visit(ctx.perm_name()));
        return ret;
    }
    public SyntaxTree visitPermM(ApronParser.PermMContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.perm);
        ret.add(visit(ctx.perm_name()));
        ret.add(visit(ctx.filter_expr()));
        return ret;
    }
    public SyntaxTree visitPerm_name(ApronParser.Perm_nameContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.perm_name);
        ret.data(ctx.STRING().getText());
        return ret;
    }
    public SyntaxTree visitFilterExprTerm(ApronParser.FilterExprTermContext ctx){
        return visit(ctx.filter_term());
    }
    public SyntaxTree visitFilterExprAndTerm(ApronParser.FilterExprAndTermContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.filter_expr,Operation.AND);
    	ret.add(visit(ctx.filter_expr()));
        ret.add(visit(ctx.filter_term()));
        return ret;
    }
    public SyntaxTree visitFilterTermFactor(ApronParser.FilterTermFactorContext ctx){
        return visit(ctx.filter_factor());
    }
    public SyntaxTree visitFilterTermOrFactor(ApronParser.FilterTermOrFactorContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.filter_term,Operation.OR);
    	ret.add(visit(ctx.filter_term()));
        ret.add(visit(ctx.filter_factor()));
        return ret;
    }
    public SyntaxTree visitFilterFactorNotFactor(ApronParser.FilterFactorNotFactorContext ctx){
        return visit(ctx.filter_not_factor());
    }
    public SyntaxTree visitFilterFactorNot(ApronParser.FilterFactorNotContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.filter_factor,Operation.NOT);
    	ret.add(visit(ctx.filter_factor()));
        return ret;
    }
    public SyntaxTree visitFilterExpr(ApronParser.FilterExprContext ctx){
        return visit(ctx.filter_expr());
    }
    public SyntaxTree visitFlowPredicate(ApronParser.FlowPredicateContext ctx){
        return visit(ctx.flow_predicate());
    }
    public SyntaxTree visitTopology(ApronParser.TopologyContext ctx){
        return visit(ctx.topo());
    }
    public SyntaxTree visitActions(ApronParser.ActionsContext ctx){
        return visit(ctx.action());
    }
    public SyntaxTree visitOwnershipS(ApronParser.OwnershipSContext ctx){
        return visit(ctx.ownership());
    }
    public SyntaxTree visitMaxPriority(ApronParser.MaxPriorityContext ctx){
        return visit(ctx.max_priority());
    }
    public SyntaxTree visitFlowTable(ApronParser.FlowTableContext ctx){
        return visit(ctx.flow_table());
    }
    public SyntaxTree visitNotificationS(ApronParser.NotificationSContext ctx){
        return visit(ctx.notification());
    }
    public SyntaxTree visitStatisticsS(ApronParser.StatisticsSContext ctx){
        return visit(ctx.statistics());
    }
    public SyntaxTree visitPktOut(ApronParser.PktOutContext ctx){
        return visit(ctx.pkt_out());
    }
    public SyntaxTree visitSystemS(ApronParser.SystemSContext ctx){
        return visit(ctx.system());
    }

    public SyntaxTree visitFieldVal(ApronParser.FieldValContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.flow_predicate);
    	ret.data(1);
        ret.add(visit(ctx.field()));
        ret.add(visit(ctx.val()));
        return ret;
    }
    public SyntaxTree visitFieldMask(ApronParser.FieldMaskContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.flow_predicate);
    	ret.data(2);
        ret.add(visit(ctx.field()));
        ret.add(visit(ctx.val(0)));
        ret.add(visit(ctx.val(1)));
        return ret;
    }
    public SyntaxTree visitWildcard(ApronParser.WildcardContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.flow_predicate);
    	ret.data(3);
        ret.add(visit(ctx.field()));
        ret.add(visit(ctx.val()));
        return ret;
    }
    
    public SyntaxTree visitValInt(ApronParser.ValIntContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.flow_predicate);
        ret.data(Integer.valueOf(ctx.INT().getText()));
        return ret;
    }
    public SyntaxTree visitValIp(ApronParser.ValIpContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.flow_predicate);
        ret.data(ctx.IP_FORMAT().getText());
        return ret;
    }
    public SyntaxTree visitField(ApronParser.FieldContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.field);
        ret.data(ctx.getText());
        return ret;
    }
    public SyntaxTree visitPhysicalTopo(ApronParser.PhysicalTopoContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.topo);
    	ret.add(visit(ctx.physical_topo()));
        return ret;
    }
    public SyntaxTree visitVirtualTopo(ApronParser.VirtualTopoContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.topo);
    	ret.add(visit(ctx.virtual_topo()));
        return ret;
    }
    public SyntaxTree visitPhysical_topo(ApronParser.Physical_topoContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.physical_topo);
    	ret.add(visit(ctx.switch_set()));
    	ret.add(visit(ctx.link_set()));
        return ret;
    }
    public SyntaxTree visitAllSwitches(ApronParser.AllSwitchesContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.switch_set);
    	ret.data(1);
    	ret.data(ctx.ALL_SWITCHES().getText());
        return ret;
    }
    public SyntaxTree visitBorderSwitches(ApronParser.BorderSwitchesContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.switch_set);
    	ret.data(2);
    	ret.data(ctx.BORDER_SWITCHES().getText());
        return ret;
    }
    public SyntaxTree visitSwIdxList(ApronParser.SwIdxListContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.switch_set);
    	ret.data(3);
        ret.add(visit(ctx.sw_idx_list()));
        return ret;
    }
    public SyntaxTree visitSwIdxListS(ApronParser.SwIdxListSContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.sw_idx_list);
    	ret.add(visit(ctx.sw_idx()));
    	//ret.data(Long.valueOf(ctx.sw_idx().getText()));
        return ret;
    }
    public SyntaxTree visitSwIdxListM(ApronParser.SwIdxListMContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.sw_idx_list);
    	ret.add(visit(ctx.sw_idx()));
    	ret.add(visit(ctx.sw_idx_list()));
        return ret;
    }
    public SyntaxTree visitSw_idx(ApronParser.Sw_idxContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.sw_idx);
    	ret.data(Long.valueOf(ctx.INT().getText()));
        return ret;
    }
    public SyntaxTree visitAllDriectLinks(ApronParser.AllDriectLinksContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.link_set);
    	ret.add(ctx.ALL_DIRECT_LINKS().getText());
    	return ret;
    }
    public SyntaxTree visitAllPathsAsLinks(ApronParser.AllPathsAsLinksContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.link_set);
    	ret.add(ctx.ALL_PATHS_AS_LINKS().getText());
    	return ret;
    }
    public SyntaxTree visitLinkList(ApronParser.LinkListContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.link_set);
        ret.add(visit(ctx.link_list()));
        return ret;
    }
    public SyntaxTree visitLinkListS(ApronParser.LinkListSContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.link_list);
        ret.add(visit(ctx.link()));
        return ret;
    }
    public SyntaxTree visitLinkListM(ApronParser.LinkListMContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.link_list);
    	ret.add(visit(ctx.link()));
    	ret.add(visit(ctx.link_list()));
        return ret;
    }
    public SyntaxTree visitLinkS(ApronParser.LinkSContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.link);
        ret.add(visit(ctx.link_idx(0)));
        ret.add(visit(ctx.link_idx(1)));
        return ret;
    }
    public SyntaxTree visitLinkM(ApronParser.LinkMContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.link);
        ret.add(visit(ctx.path()));
        return ret;
    }
    public SyntaxTree visitPathS(ApronParser.PathSContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.path);
    	ret.add(visit(ctx.link_idx()));
    	return ret;
        
    }
    public SyntaxTree visitPathM(ApronParser.PathMContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.path);
    	ret.add(visit(ctx.link_idx()));
    	ret.add(visit(ctx.path()));
    	return ret;
        
    }
    public SyntaxTree visitLink_idx(ApronParser.Link_idxContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.link_idx);
    	ret.add(visit(ctx.sw_idx()));
    	ret.data(Integer.valueOf(ctx.INT().getText()));
    	return ret;
    }
    public SyntaxTree visitVirtual_topo(ApronParser.Virtual_topoContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.virtual_topo);
    	return ret;
        
    }
    public SyntaxTree visitSingleBigSwitch(ApronParser.SingleBigSwitchContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.switch_mapping);
    	return ret;
        
    }
    public SyntaxTree visitVirtualSwitchSet(ApronParser.VirtualSwitchSetContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.switch_mapping);
    	return ret;
        
    }
    public SyntaxTree visitVirtualSwitchSetS(ApronParser.VirtualSwitchSetSContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.virtual_switch_set);
    	return ret;
        
    }
    public SyntaxTree visitVirtualSwitchSetM(ApronParser.VirtualSwitchSetMContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.virtual_switch_set);
    	return ret;
        
    }
    public SyntaxTree visitDrop(ApronParser.DropContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.action);
    	ret.data(ctx.DROP().getText());
        return ret;
        
    }
    public SyntaxTree visitForward(ApronParser.ForwardContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.action);
    	ret.data(ctx.FORWARD().getText());
        return ret;   
    }
    public SyntaxTree visitModify(ApronParser.ModifyContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.action);
    	ret.data(ctx.MODIFY().getText());
        return ret;        
    }
    public SyntaxTree visitModifyField(ApronParser.ModifyFieldContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.action);
    	ret.add(visit(ctx.field_list()));
        return ret;
    }
    public SyntaxTree visitFieldS(ApronParser.FieldSContext ctx){
        return visit(ctx.field());
    }
    public SyntaxTree visitFieldM(ApronParser.FieldMContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.field_list);
    	ret.add(visit(ctx.field()));
    	ret.add(visit(ctx.field_list()));
        return ret;
    }
    public SyntaxTree visitOwnFlows(ApronParser.OwnFlowsContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.ownership);
    	ret.data(ctx.OWN_FLOWS().getText());
        return ret;        
    }
    public SyntaxTree visitOthersFlows(ApronParser.OthersFlowsContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.ownership);
    	ret.data(ctx.OTHERS_FLOWS().getText());
        return ret;        
    }
    public SyntaxTree visitAllFlows(ApronParser.AllFlowsContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.ownership);
    	ret.data(ctx.ALL_FLOWS().getText());
        return ret;        
    }
    public SyntaxTree visitPriorityMax(ApronParser.PriorityMaxContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.max_priority);
    	ret.data(Integer.valueOf(ctx.INT().getText()));
        return ret;
    }
    public SyntaxTree visitPriorityMin(ApronParser.PriorityMinContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.min_priority);
    	ret.data(Integer.valueOf(ctx.INT().getText()));
        return ret;
    }
    public SyntaxTree visitFlowTableA(ApronParser.FlowTableAContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.RULE_COUNT_PER_SWITCH);
    	ret.data(Integer.valueOf(ctx.INT().getText()));
        return ret;
    }
    public SyntaxTree visitFlowTableB(ApronParser.FlowTableBContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.SIZE_PERCENTAGE_PER_SWITCH);
    	ret.data(Float.valueOf(ctx.FLOAT().getText()));
        return ret;
    }
    public SyntaxTree visitEventInterception(ApronParser.EventInterceptionContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.notification);
    	ret.data(ctx.getText());
        return ret;
    }
    public SyntaxTree visitModifyEventOrder(ApronParser.ModifyEventOrderContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.notification);
    	ret.data(ctx.getText());
        return ret;
    }
    public SyntaxTree visitNotification(ApronParser.NotificationContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.notification);
    	ret.data(ctx.getText());
        return ret;
    }
    public SyntaxTree visitFlowLevel(ApronParser.FlowLevelContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.statistics);
    	ret.data(ctx.getText());
        return ret;
    }
    public SyntaxTree visitPortLevel(ApronParser.PortLevelContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.statistics);
    	ret.data(ctx.getText());
        return ret;
    }
    public SyntaxTree visitSwitchLevel(ApronParser.SwitchLevelContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.statistics);
    	ret.data(ctx.getText());
        return ret;
    }
    public SyntaxTree visitPktOutAllow(ApronParser.PktOutAllowContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.pktout);
    	ret.data(1);
        return ret;
    }
    public SyntaxTree visitPktOutDeny(ApronParser.PktOutDenyContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.pktout);
    	ret.data(0);
        return ret;
    }
    public SyntaxTree visitNetworkAllow(ApronParser.NetworkAllowContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.network);
    	ret.data(0);
        return ret;
    }
    public SyntaxTree visitNetworkDeny(ApronParser.NetworkDenyContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.network);
    	ret.data(0);
        return ret;
    }
    public SyntaxTree visitFileAllow(ApronParser.FileAllowContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.filesystem);
    	ret.data(0);
        return ret;
    }
    public SyntaxTree visitFileDeny(ApronParser.FileDenyContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.filesystem);
    	ret.data(0);
        return ret;
    }
    public SyntaxTree visitProcessAllow(ApronParser.ProcessAllowContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.processruntime);
    	ret.data(0);
        return ret;
    }
    public SyntaxTree visitProcessDeny(ApronParser.ProcessDenyContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.processruntime);
    	ret.data(0);
        return ret;
    }
}
