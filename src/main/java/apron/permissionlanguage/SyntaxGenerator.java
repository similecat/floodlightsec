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
    public SyntaxTree visitIpRange(ApronParser.IpRangeContext ctx){
        return visit(ctx.ip_range());
    }
    public SyntaxTree visitFieldList(ApronParser.FieldListContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.flow_predicate);
        ret.add(visit(ctx.field()));
        ret.add(visit(ctx.value_list()));
        return ret;
    }
    public SyntaxTree visitField(ApronParser.FieldContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.field);
        ret.add(ctx.getText());
        return ret;
    }
    public SyntaxTree visitValueListS(ApronParser.ValueListSContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.value_list);
    	ret.add(visit(ctx.value_range()));
        return ret;
    }
    public SyntaxTree visitValueListM(ApronParser.ValueListMContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.value_list);
    	ret.add(visit(ctx.value_range()));
        ret.add(visit(ctx.value_list()));
        return ret;
    }
    public SyntaxTree visitValueRangeS(ApronParser.ValueRangeSContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.value_range);
    	ret.add(Integer.valueOf(ctx.INT().getText()));
        return ret;
    }
    public SyntaxTree visitValueRangeM(ApronParser.ValueRangeMContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.value_range);
        ret.add(Integer.valueOf(ctx.INT(0).getText()));
        ret.add(Integer.valueOf(ctx.INT(1).getText()));
        return ret;
    }
    public SyntaxTree visitIp_range(ApronParser.Ip_rangeContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.ip_range);
        ret.add(ctx.ip_format(0).getText());
        ret.add(ctx.ip_format(1).getText());
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
    	ret.data(ctx.ALL_SWITCHES().getText());
        return ret;
    }
    public SyntaxTree visitBorderSwitches(ApronParser.BorderSwitchesContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.switch_set);
    	ret.data(ctx.BORDER_SWITCHES().getText());
        return ret;
    }
    public SyntaxTree visitSwIdxList(ApronParser.SwIdxListContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.switch_set);
        ret.add(visit(ctx.sw_idx_list()));
        return ret;
    }
    public SyntaxTree visitSwIdxListS(ApronParser.SwIdxListSContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.sw_idx_list);
    	ret.add(visit(ctx.sw_idx()));
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
    	ret.add(Integer.valueOf(ctx.INT().getText()));
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
        ret.add(visit(ctx.link_idx()));
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
    	ret.add(ctx.INT().getText());
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
    public SyntaxTree visitFiledS(ApronParser.FiledSContext ctx){
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
    public SyntaxTree visitMax_priority(ApronParser.Max_priorityContext ctx){
    	SyntaxTree ret = new SyntaxTree(NodeType.max_priority);
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
}
