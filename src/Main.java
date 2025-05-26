import AST.BaseVisitor;
import AST.PrintAST;
import Classes.*;
import SymbolTable.RepeatStylesProperty_symbolTable;
import SymbolTable.RepeatDefinitionComponent_SymbolTable;
import SymbolTable.Variable_symbolTable;
import gen.AngulerLexer;
import gen.AngulerParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {
        String source = "example/errors.txt";
        Variable_symbolTable v_symbolTable=new Variable_symbolTable();
        RepeatDefinitionComponent_SymbolTable r_symbolTable=new RepeatDefinitionComponent_SymbolTable();
        RepeatStylesProperty_symbolTable rs_symbolTable=new RepeatStylesProperty_symbolTable();
        CharStream crs = fromFileName(source);
        AngulerLexer lexer = new AngulerLexer(crs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngulerParser parser = new AngulerParser(token);
        ParseTree tree = parser.app();
        ASTNode doc = (AppNode) new BaseVisitor(v_symbolTable,r_symbolTable,rs_symbolTable).visit(tree);
        PrintAST printAST=new PrintAST();
//        System.out.println(doc);
        printAST.printApp((AppNode) doc);
        System.out.println(v_symbolTable.toString());
        System.out.println(r_symbolTable.toString());
        System.out.println(rs_symbolTable.toString());
    }
}