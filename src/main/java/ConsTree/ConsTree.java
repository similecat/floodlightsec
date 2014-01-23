package ConsTree;

import SyntaxTree.*;

import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;

public class ConsTree {
	Queue<SynTree> list = new LinkedList<SynTree>();
	Map<String,SynTree> var = new HashMap<String,SynTree>();
	public void add(SynTree e){
		list.add(e);
	}
	public void execute(){
		Map<String,SynTree> var = new HashMap<String,SynTree>();
		Queue<SynTree> program = new LinkedList<SynTree>();
		for(Iterator<SynTree> it = list.iterator(); it.hasNext(); ){
			SynTree o = (SynTree)it.next();
			program.add(o.clone_tree());
		}
		int line = 0;
		while(!program.isEmpty()){
			++line;
			System.out.println(line);
			SynTree t = program.poll();
			if(t.Type.equals(NodeType.binding)){
				String var_perm = t.children.elementAt(0)._string;
				var.put(var_perm, t.children.elementAt(1));
			}
			//t.print();
		}
	}
	public void rebuild(){
		for(Iterator<SynTree> it = list.iterator(); it.hasNext(); ){
			SynTree o = (SynTree)it.next();
			o.rebuild();
		}
	}
	private SynTree deal_var_perm(SynTree t){
		if(!var.containsKey(t._string)){
			return new SynTree(NodeType.error);
		}
		SynTree ch = var.get(t._string);
		if(ch.is_perm()){
			return ch.clone_tree();
		}
		else if(ch.Type.equals(NodeType.perm_expr)){
			return this.deal_perm_expr(ch);
		}
		else if(ch.Type.equals(NodeType.app_name)){
			return this.deal_var_perm(ch);
		}
		else{
			return new SynTree(NodeType.error);
		}
	}
	private SynTree deal_perm_expr(SynTree t){
		SynTree ret = new SynTree(NodeType.perm_list);
		if(t.Type.equals(NodeType.var_perm)){
			SynTree e = deal_var_perm(t);
			if(!e.is_err()){
				ret.add(e);
			}
			else{
				return new SynTree(NodeType.error);
			}
		}
		else{
			for(int i = 0; i < t.children.size(); ++i){
				SynTree e = deal_var_perm(t.children.elementAt(i));
				if(!e.is_err()){
					ret.add(e);
				}
				else{
					return new SynTree(NodeType.error);
				}
			}
		}
		ret.rebuild();
		return ret;
	}
	private int deal_assert_expr(SynTree t){
		if(t.Type.equals(NodeType.boolean_expr)){
			SynTree a = this.deal_perm_expr(t.children.elementAt(0));
			SynTree op = this.deal_perm_expr(t.children.elementAt(1));
			SynTree b = this.deal_perm_expr(t.children.elementAt(2));
			if(op._string.equals(">")&&a.is_include(b)){
				return 1;
			}
			else if(op._string.equals("<")&&b.is_include(a)){
				return 1;
			}
			else if(op._string.equals("=")&&a.is_include(b)&&b.is_include(a)){
				return 1;
			}
			return 0;
		}
		else if(t.op.equals(Operation.OR)){
			for(int i = 0; i < t.children.size(); ++i){
				int ret = deal_assert_expr(t.children.elementAt(i));
				if(ret >= 0){
					return ret;
				}
			}
			return 0;
		}
		else if(t.op.equals(Operation.AND)){
			for(int i = 0; i < t.children.size(); ++i){
				int ret = deal_assert_expr(t.children.elementAt(i));
				if(ret <= 0){
					return ret;
				}
			}
			return 1;
		}
		else if(t.op.equals(Operation.NOT)){
			int ret = deal_assert_expr(t.children.elementAt(0));
			if(ret>0){
				return 0;
			}
			else if(ret == 0){
				return 1;
			}
			else{
				return ret;
			}
		}
		return -1;
	}
	private int execute(String s, SynTree th){
		var.clear();
		Queue<SynTree> program = new LinkedList<SynTree>();
		var.put(s, th);
		for(Iterator<SynTree> it = list.iterator(); it.hasNext(); ){
			SynTree o = (SynTree)it.next();
			program.add(o.clone_tree());
		}
		while(!program.isEmpty()){
			SynTree t = program.poll();
			if(t.Type.equals(NodeType.binding)){
				String var_perm = t.children.elementAt(0)._string;
				var.put(var_perm, t.children.elementAt(1));
			}
			else if(t.Type.equals(NodeType.assert_list)){
				for(int i = 0; i < t.children.size(); ++i){
					if(t.children.elementAt(i).is_assert_expr()){
						int ret = this.deal_assert_expr(t.children.elementAt(i));
						if(ret <= 0){
							return ret;
						}
					}
					else if(t.children.elementAt(i).is_exclusive()){
						SynTree e = this.deal_perm_expr(t.children.elementAt(i).children.elementAt(0));
						if(e.is_err()){
							return -1;
						}
						if(!th.is_include(e)){
							continue; 
						}
						else{
							e = this.deal_perm_expr(t.children.elementAt(i).children.elementAt(1));
							if(e.is_err()){
								return -1;
							}
							if(th.is_include(e)){
								return 0;
							}
						}
					}
				}
			}
			else if(t.Type.equals(NodeType.boolean_expr)||
					t.is_assert_expr()){
				int ret = this.deal_assert_expr(t);
				if(ret <= 0){
					return ret;
				}
			}
			else if(t.is_exclusive()){
				SynTree e = this.deal_perm_expr(t);
				if(e.is_err()){
					return -1;
				}
				if(!th.is_include(e)){
					continue;
				}
				else{
					e = this.deal_perm_expr(t);
					if(e.is_err()){
						return -1;
					}
					if(th.is_include(e)){
						return 0;
					}
				}
			}
			//t.print();
		}
		return 1;
	}
	public int execute(SynTree t){
		//return -1:error, 0 fail, 1 success
		int ret = 0;
		if(!t.Type.equals(NodeType.program)){
			return -1;
		}
		for(Iterator<SynTree> it = t.children.iterator(); it.hasNext();){
			SynTree o = (SynTree)it.next();
			SynTree p = new SynTree(NodeType.perm_list);
			p.add(o.clone_tree());
			
			if(o.Type.equals(NodeType.perm)&&
					(ret = execute("this", p))<=0){
				return ret;
			}
		}
		return 1;
	}
}
