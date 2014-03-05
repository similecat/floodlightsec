package apron.test;

import apron.constraint.*;
import apron.permissionlanguage.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test{
	public static Evaluator CreateEvaluator(String inputFile) throws IOException{
		InputStream is = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(is);
		ApronLexer lexer = new ApronLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ApronParser parser = new ApronParser(tokens);
		ParseTree tree = parser.program(); // parse

        SyntaxGenerator syn = new SyntaxGenerator();
        return new Evaluator(syn.visit(tree));
	}
	public static ConstraintGenerator Create_Con_Visitor(String inputFile) throws IOException{
		InputStream is = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(is);
		ConstraintLexer lexer = new ConstraintLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ConstraintParser parser = new ConstraintParser(tokens);
		ParseTree tree = parser.program(); // parse

		ConstraintGenerator con = new ConstraintGenerator();
		con.visit(tree);
        return con;
	}
    public static void main(String[] args) throws Exception {
        System.out.println("Start!");
        /*
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        ApronLexer lexer = new ApronLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ApronParser parser = new ApronParser(tokens);
        ParseTree tree = parser.program(); // parse
        */
        Evaluator eval = CreateEvaluator("sample.perm");
        eval.permReq.app = "pkt_in_event";
        eval.permReq.notification = "EVENT_INTERCEPTION";
        System.out.println(eval.execute()?"True":"False");
        System.out.println("Done!");
        
/*
        EvaluateVisitor eval = new EvaluateVisitor();
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
*/
/*
        SyntaxGenerator syn = new SyntaxGenerator();
        SyntaxTree syntree = syn.visit(tree);
        //syntree.print();
        syntree.rebuild();
        //syntree.reduce2dnf();
        //syntree.print();
        //syntree.reduce2cnf();
        //syntree.print();
        SyntaxTree a = Create_Syn_Tree("sample.a");
        a.rebuild();
        SyntaxTree b = Create_Syn_Tree("sample.b");
        System.out.println(a.is_include(b));
        
        ConsVisitor c = Create_Con_Visitor("sample.con");
        //c.execute();
        System.out.println(c.execute(a));
*/
    }
}
