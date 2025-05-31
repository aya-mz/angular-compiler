import AST.BaseVisitor;
import AST.ErrorLogger;
import AST.PrintAST;
import Classes.*;
import SymbolTable.SymbolTable;
import gen.AngulerLexer;
import gen.AngulerParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {
        String source = "example/errors2.txt";
        SymbolTable symbolTable=new SymbolTable();
        CharStream crs = fromFileName(source);
        AngulerLexer lexer = new AngulerLexer(crs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngulerParser parser = new AngulerParser(token);
        ParseTree tree = parser.app();
        ASTNode doc = (AppNode) new BaseVisitor(symbolTable).visit(tree);
        PrintAST printAST=new PrintAST();
//        System.out.println(doc);
        printAST.printApp((AppNode) doc);
        symbolTable.print();
    }
}