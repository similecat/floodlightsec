package apron.syntaxtree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class ConstraintSyntaxTree {
	Queue<SyntaxTree> list = new LinkedList<SyntaxTree>();
	Map<String,SyntaxTree> var = new HashMap<String,SyntaxTree>();
	public void add(SyntaxTree e){
		list.add(e);
	}
	public void execute(){
		Map<String,SyntaxTree> var = new HashMap<String,SyntaxTree>();
		Queue<SyntaxTree> program = new LinkedList<SyntaxTree>();
		for(Iterator<SyntaxTree> it = list.iterator(); it.hasNext(); ){
			SyntaxTree o = (SyntaxTree)it.next();
			program.add(o.cloneTree());
		}
		int line = 0;
		while(!program.isEmpty()){
			++line;
			System.out.println(line);
			SyntaxTree t = program.poll();
			if(t.Type.equals(NodeType.binding)){
				String var_perm = t.children.elementAt(0)._string;
				var.put(var_perm, t.children.elementAt(1));
			}
			//t.print();
		}
	}
	public void reBuild(){
		for(Iterator<SyntaxTree> it = list.iterator(); it.hasNext(); ){
			SyntaxTree o = (SyntaxTree)it.next();
			o.reBuild();
		}
	}
	private SyntaxTree deal_var_perm(SyntaxTree t){
		if(!var.containsKey(t._string)){
			return new SyntaxTree(NodeType.error);
		}
		SyntaxTree ch = var.get(t._string);
		if(ch.is_perm()){
			return ch.cloneTree();
		}
		else if(ch.Type.equals(NodeType.perm_expr)){
			return this.deal_perm_expr(ch);
		}
		else if(ch.Type.equals(NodeType.app_name)){
			return this.deal_var_perm(ch);
		}
		else{
			return new SyntaxTree(NodeType.error);
		}
	}
	private SyntaxTree deal_perm_expr(SyntaxTree t){
		SyntaxTree ret = new SyntaxTree(NodeType.perm_list);
		if(t.Type.equals(NodeType.var_perm)){
			SyntaxTree e = deal_var_perm(t);
			if(!e.is_err()){
				ret.add(e);
			}
			else{
				return new SyntaxTree(NodeType.error);
			}
		}
		else{
			for(int i = 0; i < t.children.size(); ++i){
				SyntaxTree e = deal_var_perm(t.children.elementAt(i));
				if(!e.is_err()){
					ret.add(e);
				}
				else{
					return new SyntaxTree(NodeType.error);
				}
			}
		}
		ret.reBuild();
		return ret;
	}
	private int deal_assert_expr(SyntaxTree t){
		if(t.Type.equals(NodeType.boolean_expr)){
			SyntaxTree a = this.deal_perm_expr(t.children.elementAt(0));
			SyntaxTree op = this.deal_perm_expr(t.children.elementAt(1));
			SyntaxTree b = this.deal_perm_expr(t.children.elementAt(2));
			if(op._string.equals(">")&&a.isInclude(b)){
				return 1;
			}
			else if(op._string.equals("<")&&b.isInclude(a)){
				return 1;
			}
			else if(op._string.equals("=")&&a.isInclude(b)&&b.isInclude(a)){
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
	private int execute(String s, SyntaxTree th){
		var.clear();
		Queue<SyntaxTree> program = new LinkedList<SyntaxTree>();
		var.put(s, th);
		for(Iterator<SyntaxTree> it = list.iterator(); it.hasNext(); ){
			SyntaxTree o = (SyntaxTree)it.next();
			program.add(o.cloneTree());
		}
		while(!program.isEmpty()){
			SyntaxTree t = program.poll();
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
						SyntaxTree e = this.deal_perm_expr(t.children.elementAt(i).children.elementAt(0));
						if(e.is_err()){
							return -1;
						}
						if(!th.isInclude(e)){
							continue; 
						}
						else{
							e = this.deal_perm_expr(t.children.elementAt(i).children.elementAt(1));
							if(e.is_err()){
								return -1;
							}
							if(th.isInclude(e)){
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
				SyntaxTree e = this.deal_perm_expr(t);
				if(e.is_err()){
					return -1;
				}
				if(!th.isInclude(e)){
					continue;
				}
				else{
					e = this.deal_perm_expr(t);
					if(e.is_err()){
						return -1;
					}
					if(th.isInclude(e)){
						return 0;
					}
				}
			}
			//t.print();
		}
		return 1;
	}
	public int execute(SyntaxTree t){
		//return -1:error, 0 fail, 1 success
		int ret = 0;
		if(!t.Type.equals(NodeType.program)){
			return -1;
		}
		for(Iterator<SyntaxTree> it = t.children.iterator(); it.hasNext();){
			SyntaxTree o = (SyntaxTree)it.next();
			SyntaxTree p = new SyntaxTree(NodeType.perm_list);
			p.add(o.cloneTree());
			
			if(o.Type.equals(NodeType.perm)&&
					(ret = execute("this", p))<=0){
				return ret;
			}
		}
		return 1;
	}
}
