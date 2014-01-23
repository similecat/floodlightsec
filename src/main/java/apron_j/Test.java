package apron_j;

import ConsLan.*;
import PermLan.*;
import SyntaxTree.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test{
	public static SynTree Create_Syn_Tree(String inputFile) throws IOException{
		InputStream is = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(is);
		apronLexer lexer = new apronLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		apronParser parser = new apronParser(tokens);
		ParseTree tree = parser.program(); // parse

        SyntaxVisitor syn = new SyntaxVisitor();
        return syn.visit(tree);
	}
	public static ConsVisitor Create_Con_Visitor(String inputFile) throws IOException{
		InputStream is = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(is);
		constraintLexer lexer = new constraintLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		constraintParser parser = new constraintParser(tokens);
		ParseTree tree = parser.program(); // parse

		ConsVisitor con = new ConsVisitor();
		con.visit(tree);
        return con;
	}
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        apronLexer lexer = new apronLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        apronParser parser = new apronParser(tokens);
        ParseTree tree = parser.program(); // parse

        EvalVisitor eval = new EvalVisitor();
        eval.perm_req.app = "pkt_in_event";
        eval.perm_req.notification = "EVENT_INTERCEPTION";
        //eval.visit(tree);
        Boolean ret = false;
        ret = eval.visit(tree);
        if(ret == true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
        SyntaxVisitor syn = new SyntaxVisitor();
        SynTree syntree = syn.visit(tree);
        //syntree.print();
        syntree.rebuild();
        //syntree.reduce2dnf();
        //syntree.print();
        //syntree.reduce2cnf();
        //syntree.print();
        SynTree a = Create_Syn_Tree("sample.a");
        a.rebuild();
        SynTree b = Create_Syn_Tree("sample.b");
        System.out.println(a.is_include(b));
        
        ConsVisitor c = Create_Con_Visitor("sample.con");
        //c.execute();
        System.out.println(c.execute(a));
    }
}
