package apron.syntaxtree;

public enum NodeType{
	none,program,perm_list,perm,filter_expr,filter_term,filter_factor,
	filter_not_factor,flow_predicate,field,value_list,value_range,
	ip_range,ip_format,topo,physical_topo,switch_set,sw_idx_list,
	sw_idx,link_set,link_list,link,path,link_idx,virtual_topo,
	switch_mapping,virtual_switch_set,action,field_list,ownership,
	max_priority,flow_table,notification,statistics,perm_name,
	RULE_COUNT_PER_SWITCH,SIZE_PERCENTAGE_PER_SWITCH,
	STRING,INT,FLOAT,
	//
	binding,var_perm,app_name,perm_expr,assert_list,assert_stmt,
	assert_expr,boolean_expr,cmp_operator,exclusive,
	//
	error
	;
	public boolean is_top(){
		if(this.equals(NodeType.program)||
				this.equals(NodeType.perm_list)||
				this.equals(NodeType.perm)){
			return true;
		}
		return false;
	}
	public boolean is_expr(){
		if(this.equals(NodeType.filter_expr)||
				this.equals(NodeType.filter_factor)||
				this.equals(NodeType.filter_term)||
				this.equals(NodeType.filter_not_factor)){
			return true;
		}
		return false;
	}
	public boolean is_perm(){
		if(this.equals(NodeType.perm)||
				this.equals(NodeType.perm_list)){
			return true;
		}
		return false;
	}
	public boolean is_assert_expr(){
		if(this.equals(NodeType.assert_expr)||
				this.equals(NodeType.boolean_expr)){
			return true;
		}
		return false;
	}
	public boolean is_exclusive(){
		if(this.equals(NodeType.exclusive)){
			return true;
		}
		return false;
	}
	public boolean is_err(){
		if(this.equals(NodeType.error)){
			return true;
		}
		return false;
	}
}
