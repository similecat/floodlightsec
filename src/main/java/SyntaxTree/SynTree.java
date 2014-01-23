package SyntaxTree;

import java.util.Vector;
import java.util.Queue;
import java.util.LinkedList;
public class SynTree {
	public NodeType Type = NodeType.none;
	public Operation op = Operation.none;
	public Vector<SynTree> children = new Vector<SynTree>();
	
	public String _string = new String("");
	public Integer _int = new Integer(0);
	public Float _float = new Float(0);
	
	public SynTree(){
		;
	}
	public SynTree(NodeType t){
		Type = t;
	}
	public SynTree(NodeType t, Operation o){
		Type = t;
		op = o;
	}
	public void add(SynTree e){
		children.add(e);
		return;
	}
	public void data(String e){
		_string = e;
	}
	public void data(Integer e){
		_int = e;
	}
	public void data(Float e){
		_float = e;
	}
	public void add(String e){
		SynTree t = new SynTree(NodeType.STRING);
		t.data(e);
		this.add(t);
	}
	public void add(Integer e){
		SynTree t = new SynTree(NodeType.INT);
		t.data(e);
		this.add(t);
	}
	public void add(Float e){
		SynTree t = new SynTree(NodeType.FLOAT);
		t.data(e);
		this.add(t);
	}
	//type
	public boolean is_top(){
		return this.Type.is_top();
	}
	public boolean is_expr(){
		return this.Type.is_expr();
	}
	public boolean is_perm(){
		return this.Type.is_perm();
	}
	public boolean is_assert_expr(){
		return this.Type.is_assert_expr();
	}
	public boolean is_exclusive(){
		return this.Type.is_exclusive();
	}
	public boolean is_err(){
		return this.Type.is_err();
	}
	
	public void print(){
		Queue<SynTree> q = new LinkedList<SynTree>();
		Queue<Integer> qq = new LinkedList<Integer>();
		Integer fa[] = new Integer[10000];
		int now = 0;
		fa[0] = 0;
		q.add(this);
		qq.add(Integer.valueOf(now));
		while(!q.isEmpty()){
			SynTree tmp = q.remove();
			int ff = qq.remove();
			System.out.println(tmp.Type.toString()+" "+tmp.op.toString()+
					" "+tmp.children.size()+" "+ff+" "+fa[ff]);
			//System.out.println("******************************");
			for(int i = 0; i < tmp.children.size(); ++i){
				q.add(tmp.children.elementAt(i));
				++now;
				fa[now] = ff;
				qq.add(now);
			}
		}
	}
	public void print(SynTree tmp){
		System.out.println(tmp.Type.toString()+" "+tmp.op.toString());
		System.out.println("******************************");
		for(int i = 0; i < tmp.children.size(); ++i){
			print(tmp.children.elementAt(i));
		}
	}
	public void copy(SynTree t){
		this.Type = t.Type;
		this.op = t.op;
		this._float = t._float;
		this._int = t._int;
		this._string = t._string;
	}
	public void rebuild(){
		SynTree t = this;
		if(t.Type.equals(NodeType.STRING)||t.Type.equals(NodeType.INT)||
				t.Type.equals(NodeType.FLOAT)){
			return;
		}
		Vector<SynTree> ret = new Vector<SynTree>();
		for(int i = 0; i < t.children.size(); ++i){
			SynTree tmp = t.children.elementAt(i);
			tmp.rebuild();
			
			//combine
			if(t.Type.equals(NodeType.program)&&
					tmp.Type.equals(NodeType.perm_list)){
				for(int j = 0; j < tmp.children.size(); ++j){
					ret.add(tmp.children.elementAt(j));
				}
			}
			else if(t.Type.equals(NodeType.perm_list)&&
					tmp.Type.equals(NodeType.perm)){
				ret.add(tmp);
			}
			else if(t.Type.equals(NodeType.perm_list)&&
					tmp.Type.equals(NodeType.perm_list)){
				for(int j = 0; j < tmp.children.size(); ++j){
					ret.add(tmp.children.elementAt(j));
				}
			}
			else if(t.Type.equals(NodeType.filter_expr)&&
					tmp.Type.equals(NodeType.filter_expr)){
				for(int j = 0; j < tmp.children.size(); ++j){
					ret.add(tmp.children.elementAt(j));
				}
			}
			else if(t.Type.equals(NodeType.filter_term)&&
					tmp.Type.equals(NodeType.filter_term)){
				for(int j = 0; j < tmp.children.size(); ++j){
					ret.add(tmp.children.elementAt(j));
				}
			}
			else if(t.Type.equals(NodeType.field_list)&&
					tmp.Type.equals(NodeType.field_list)){
				ret.add(tmp);
			}
			else if(t.Type.equals(NodeType.value_list)&&
					tmp.Type.equals(NodeType.value_list)){
				ret.add(tmp);
			}
			else if(t.Type.equals(NodeType.assert_list)&&
					tmp.Type.equals(NodeType.assert_list)){
				ret.add(tmp);
			}
			else if(t.Type.equals(NodeType.perm_expr)&&
					tmp.Type.equals(NodeType.perm_expr)){
				ret.add(tmp);
			}
			else{
				ret.add(tmp);
			}
		}
		t.children = ret;
	}
	public void reducenot(){
		SynTree t = this;
		if(!t.Type.is_expr()&&
				!t.Type.is_top()){
			return;
		}
		Vector<SynTree> ret = new Vector<SynTree>();
		SynTree children = t.children.elementAt(0);
		if(t.op.equals(Operation.NOT)&&
				children.op.equals(Operation.AND)){
			t.op = Operation.OR;
			for(int i = 0; i < children.children.size(); ++i){
				SynTree tmp = new SynTree(NodeType.filter_expr,Operation.NOT);
				tmp.add(children.children.elementAt(i));
				ret.add(tmp);
				tmp.reducenot();
			}
		}
		else if(t.op.equals(Operation.NOT)&&
				children.op.equals(Operation.OR)){
			t.op = Operation.OR;
			for(int i = 0; i < children.children.size(); ++i){
				SynTree tmp = new SynTree(NodeType.filter_expr,Operation.NOT);
				tmp.add(children.children.elementAt(i));
				ret.add(tmp);
				tmp.reducenot();
			}
		}
		else if(t.op.equals(Operation.NOT)&&
				children.op.equals(Operation.NOT)){
			t.op = children.children.elementAt(0).op;
			for(int i = 0; i < children.children.elementAt(0).children.size(); ++i){
				children.children.elementAt(0).children.elementAt(i).reducenot();
				ret.add(children.children.elementAt(0).children.elementAt(i));
			}
		}
		else{
			for(int i = 0; i < t.children.size(); ++i){
				children = t.children.elementAt(i);
				children.reducenot();
				ret.add(children);
			}
		}
		t.children = ret;
	}

	private int check_and(){
		for(int i = 0; i < this.children.size(); ++i){
			if(this.children.elementAt(i).op.equals(Operation.AND)){
				return i;
			}
		}
		return -1;
	}
	private int check_or(){
		for(int i = 0; i < this.children.size(); ++i){
			if(this.children.elementAt(i).op.equals(Operation.OR)){
				return i;
			}
		}
		return -1;
	}
	private int check_op(Operation e){
		for(int i = 0; i < this.children.size(); ++i){
			if(this.children.elementAt(i).op.equals(e)){
				return i;
			}
		}
		return -1;
	}
	public void reduceand(){
		SynTree t = this;
		if(!t.Type.is_expr()&&
				!t.Type.is_top()){
			return;
		}

		//combine the children with operation and to current node.
		int pos = 0;
		if(t.op.equals(Operation.AND)||
				t.op.equals(Operation.OR)){
			while((pos = this.check_op(t.op)) >= 0){
				Vector<SynTree> ret = new Vector<SynTree>();
				SynTree children = t.children.elementAt(pos);
				for(int i = 0; i < pos; ++i){
					ret.add(t.children.elementAt(i));
				}
				for(int i = 0; i < children.children.size(); ++i){
					ret.add(children.children.elementAt(i));
				}
				for(int i = pos+1; i < t.children.size(); ++i){
					ret.add(t.children.elementAt(i));
				}
				t.children = ret;
			}
		}
		
		if(t.op.equals(Operation.AND)){
			
			//determine the end
			if(this.check_or() < 0){
				return;
			}
			
			//Distributive law
			Vector<SynTree> ret = new Vector<SynTree>();
			Integer stat[] = new Integer[1010];
			Integer MAX[] = new Integer[1010];
			for(int i = 0; i < t.children.size(); ++i){
				stat[i] = 0;
			}
			for(int i = 0; i < t.children.size(); ++i){
				if(t.children.elementAt(i).op.equals(Operation.OR)){
					MAX[i] = t.children.elementAt(i).children.size();
				}
				else{
					MAX[i] = 1;
				}
			}
			while(stat[0] < MAX[0]){
				SynTree nTree = new SynTree(NodeType.filter_expr,Operation.AND);
				for(int i = 0; i < t.children.size(); ++i){
					if(t.children.elementAt(i).op.equals(Operation.OR)){
						nTree.add(t.children.elementAt(i).children.elementAt(stat[i]));
					}
					else{
						nTree.add(t.children.elementAt(i));
					}
				}
				ret.add(nTree);
				
				//update stat
				stat[t.children.size()-1] += 1;
				for(int i = t.children.size() - 1; i > 0; --i){
					if(stat[i] >= MAX[i]){
						stat[i] = 0;
						stat[i-1] += 1;
					}
				}
			}
			//replace the root
			t.op = Operation.OR;
			t.children = ret;
			
			//reduce recursively
			for(int i = 0; i < t.children.size(); ++i){
				t.children.elementAt(i).reduceand();
			}
		}
		else{
			for(int i = 0; i < t.children.size(); ++i){
				SynTree children = t.children.elementAt(i);
				children.reduceand();
			}
		}
	}
	public void reduceor(){
		SynTree t = this;
		if(!t.Type.is_expr()&&
				!t.Type.is_top()){
			return;
		}

		//combine the children with operation and to current node.
		int pos = 0;
		if(t.op.equals(Operation.AND)||
				t.op.equals(Operation.OR)){
			while((pos = this.check_op(t.op)) >= 0){
				Vector<SynTree> ret = new Vector<SynTree>();
				SynTree children = t.children.elementAt(pos);
				for(int i = 0; i < pos; ++i){
					ret.add(t.children.elementAt(i));
				}
				for(int i = 0; i < children.children.size(); ++i){
					ret.add(children.children.elementAt(i));
				}
				for(int i = pos+1; i < t.children.size(); ++i){
					ret.add(t.children.elementAt(i));
				}
				t.children = ret;
			}
		}
		if(t.op.equals(Operation.OR)){
			
			//determine the end
			if(this.check_and() < 0){
				return;
			}
			
			//Distributive law
			Vector<SynTree> ret = new Vector<SynTree>();
			Integer stat[] = new Integer[1010];
			Integer MAX[] = new Integer[1010];
			for(int i = 0; i < t.children.size(); ++i){
				stat[i] = 0;
			}
			for(int i = 0; i < t.children.size(); ++i){
				if(t.children.elementAt(i).op.equals(Operation.AND)){
					MAX[i] = t.children.elementAt(i).children.size();
				}
				else{
					MAX[i] = 1;
				}
			}
			while(stat[0] < MAX[0]){
				SynTree nTree = new SynTree(NodeType.filter_expr,Operation.OR);
				for(int i = 0; i < t.children.size(); ++i){
					if(t.children.elementAt(i).op.equals(Operation.AND)){
						nTree.add(t.children.elementAt(i).children.elementAt(stat[i]));
					}
					else{
						nTree.add(t.children.elementAt(i));
					}
				}
				ret.add(nTree);
				
				//update stat
				stat[t.children.size()-1] += 1;
				for(int i = t.children.size() - 1; i > 0; --i){
					if(stat[i] >= MAX[i]){
						stat[i] = 0;
						stat[i-1] += 1;
					}
				}
			}
			//replace the root
			t.op = Operation.AND;
			t.children = ret;
			
			//reduce recursively
			for(int i = 0; i < t.children.size(); ++i){
				t.children.elementAt(i).reduceor();
			}
		}
		else{
			for(int i = 0; i < t.children.size(); ++i){
				SynTree children = t.children.elementAt(i);
				children.reduceor();
			}
		}
	}
	public void reduce2dnf(){
		this.reducenot();
		this.reduceand();
	}
	public void reduce2cnf(){
		this.reducenot();
		this.reduceor();
	}
	public SynTree clone_tree(){
		SynTree t = new SynTree();
		t.copy(this);
		Vector<SynTree> ret = new Vector<SynTree>();
		for(int i = 0; i < this.children.size(); ++i){
			ret.add(this.children.elementAt(i).clone_tree());
		}
		t.children = ret;
		return t;
	}
	public boolean compareTo(SynTree B){
		SynTree A = this;
		if(!A.Type.equals(B.Type)){
			return false;
		}
		if(A.Type.equals(NodeType.flow_predicate)){
			//field
			if(!A.children.elementAt(0).compareTo(B.children.elementAt(0))){
				return false;
			}
			//value_list
			return A.children.elementAt(1).compareTo(B.children.elementAt(1));
		}
		else if(A.Type.equals(NodeType.value_list)){
			for(int i = 0; i < B.children.size(); ++i){
				boolean fg = false;
				for(int j = 0; j < A.children.size(); ++j){
					if(A.children.elementAt(j).compareTo(B.children.elementAt(i))){
						fg = true;
						break;
					}
				}
				if(!fg){
					return false;
				}
			}
			return true;
		}
		else if(A.Type.equals(NodeType.value_range)){
			if(A.children.size()!=B.children.size()){
				return false;
			}
			if(A.children.size() == 1){
				return A.children.elementAt(0).compareTo(B.children.elementAt(0));
			}
			else{
				return A.children.elementAt(0).compareTo(B.children.elementAt(0))&&
						A.children.elementAt(1).compareTo(B.children.elementAt(1));
			}
		}
		else if(A.Type.equals(NodeType.ip_range)){
			return A.children.elementAt(0).compareTo(B.children.elementAt(0))&&
					A.children.elementAt(1).compareTo(B.children.elementAt(1));
		}
		else if(A.Type.equals(NodeType.topo)){
			//Todo: compare topology.
			return true;
		}
		else if(A.Type.equals(NodeType.action)){
			return A.children.elementAt(0).compareTo(B.children.elementAt(0));
		}
		else if(A.Type.equals(NodeType.field_list)){
			//all b's son is in A
			for(int i = 0; i < B.children.size(); ++i){
				boolean fg = false;
				for(int j = 0; j < A.children.size(); ++j){
					if(A.children.elementAt(j).compareTo(B.children.elementAt(i))){
						fg = true;
						break;
					}
				}
				if(!fg){
					return false;
				}
			}
			return true;
		}
		else if(A.Type.equals(NodeType.field)){
			return A.children.elementAt(0).compareTo(B.children.elementAt(0));	
		}
		else if(A.Type.equals(NodeType.ownership)){
			if(A.children.elementAt(0).compareTo(B.children.elementAt(0))){
				return true;
			}
			return false;
		}
		else if(A.Type.equals(NodeType.max_priority)){
			if(A._int == B._int){
				return true;
			}
			return false;
		}
		else if(A.Type.equals(NodeType.RULE_COUNT_PER_SWITCH)){
			if(A._int == B._int){
				return true;
			}
			return false;
		}
		else if(A.Type.equals(NodeType.SIZE_PERCENTAGE_PER_SWITCH)){
			if(A._float == B._float){
				return true;
			}
			return false;
		}
		else if(A.Type.equals(NodeType.notification)){
			if(A.children.elementAt(0).compareTo(B.children.elementAt(0))){
				return true;
			}
			return false;
		}
		else if(A.Type.equals(NodeType.statistics)){
			if(A.children.elementAt(0).compareTo(B.children.elementAt(0))){
				return true;
			}
			return false;
		}
		else if(A.Type.equals(NodeType.STRING)){
			return A._string.equals(B._string);
		}
		else if(A.Type.equals(NodeType.INT)){
			return A._int.equals(B._int);
		}
		else if(A.Type.equals(NodeType.FLOAT)){
			return A._float.equals(B._float);
		}
		return true;
	}
	public boolean is_include_top(SynTree B){
		SynTree A = this;
		if(A.Type.is_top()&&B.Type.is_top()){
			//every b's son is included by one of a's son.
			for(int i = 0; i < B.children.size(); ++i){
				boolean fg = false;
				for(int j = 0; j < A.children.size(); ++j){
					if(A.children.elementAt(j).is_include_top(B.children.elementAt(i))){
						fg = true;
						break;
					}
				}
				if(fg){
					continue;
				}
				else{
					return false;
				}
			}
			return true;
		}
		else if(A.Type.is_top()&&B.Type.is_expr()){
			//B is included by one of a's son.
			for(int j = 0; j < A.children.size(); ++j){
				if(A.children.elementAt(j).is_include_top(B)){
					return true;
				}
			}
			return false;
		}
		else if(B.Type.is_expr()){
			//every b's son is included by A.
			for(int i = 0; i < A.children.size(); ++i){
				if(!A.is_include_top(B.children.elementAt(i))){
					return false;
				}
			}
			return true;
		}
		else{
			if(A.op.equals(Operation.AND)){
				if(B.op.equals(Operation.AND)){
					//b is included by one of a's children.
					for(int j = 0; j < A.children.size(); ++j){
						if(A.children.elementAt(j).is_include_top(B)){
							return true;
						}
					}
					return false;
				}
				else if(B.op.equals(Operation.OR)){
					//every a's son includes every b's son
					for(int i = 0; i < A.children.size(); ++i){
						for(int j = 0; j < B.children.size(); ++j){
							if(!A.children.elementAt(i).is_include_top(B.children.elementAt(j))){
								return false;
							}
						}
					}
					return true;
				}
				else if(B.op.equals(Operation.none)
						||A.op.equals(Operation.NOT)){
					//every a's son includes every b
					for(int i = 0; i < A.children.size(); ++i){
						if(!A.children.elementAt(i).is_include_top(B)){
							return false;
						}
					}
					return true;
				}
			}
			else if(A.op.equals(Operation.OR)){
				if(B.op.equals(Operation.AND)){
					//one of b's son is included by a's son;
					for(int i = 0; i < B.children.size(); ++i){
						for(int j = 0; j < A.children.size(); ++j){
							if(A.children.elementAt(j).is_include_top(B.children.elementAt(i))){
								return true;
							}
						}
					}
					return false;
				}
				else if(B.op.equals(Operation.OR)){
					//a includes every b's son
					for(int i = 0; i < B.children.size(); ++i){
						if(!A.is_include_top(B.children.elementAt(i))){
							return false;
						}
					}
					return true;
				}
				else if(B.op.equals(Operation.none)
						||B.op.equals(Operation.NOT)){
					//b is included by one of a's children.
					for(int j = 0; j < A.children.size(); ++j){
						if(A.children.elementAt(j).is_include_top(B)){
							return true;
						}
					}
					return false;
				}
			}
			else if(A.op.equals(Operation.none)
					||A.op.equals(Operation.NOT)){
				if(B.op.equals(Operation.AND)){
					//a includes one of b's son.
					for(int i = 0; i < B.children.size(); ++i){
						if(A.is_include_top(B.children.elementAt(i))){
							return true;
						}
					}
					return false;
				}
				else if(B.op.equals(Operation.OR)){
					//a includes every b's son.
					for(int i = 0; i < B.children.size(); ++i){
						if(!A.is_include_top(B.children.elementAt(i))){
							return false;
						}
					}
					return true;
				}
				else if(B.op.equals(Operation.none)
						||A.op.equals(Operation.NOT)){
					//a includes b
					return A.compareTo(B);
				}
			}
			return false;
		}
		/*
		else if(A.Type.is_expr()){
			//
			for(int j = 0; j < A.children.size(); ++j){
				if(A.children.elementAt(j).is_include_top(B)){
					return true;
				}
			}
			return false;
		}
		else if(B.Type.is_expr()){
			//
			for(int j = 0; j < B.children.size(); ++j){
				if(!A.is_include_top(B)){
					return false;
				}
			}
			return true;
		}
		else{
			return A.compareTo(B);
		}*/
	}
	public boolean is_include(SynTree b){
		SynTree A = this.clone_tree();
		SynTree B = b.clone_tree();
		A.rebuild();
		A.reduce2cnf();
		//A.print();
		//System.out.println("******************************");
		B.rebuild();
		B.reduce2dnf();
		//B.print();
		return A.is_include_top(B);		
	}
}
