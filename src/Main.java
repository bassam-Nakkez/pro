import AST.DataType.IntNumber;
import AST.Expression.Expression;
import AST.Parse;
import SymbolTableSructure.Data;
import Visitor.FileManagement;
import Visitor.Helper;
import Visitor.MyVisitor;
import alter.DartLexer;
import alter.DartParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.awt.*;
import java.io.IOException;
import java.net.URI;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {
    public static void main(String[] args) throws IOException
    {
        String fileSource = "Files/testWidget.dart";
        CharStream charStream = fromFileName(fileSource);
        DartLexer lex = new DartLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream( lex);
        DartParser parser = new DartParser(tokens);
        ParseTree ast = parser.parse();
        MyVisitor myVisitor = new MyVisitor();
        Parse in = (Parse) myVisitor.visit(ast);
        System.out.println( in);





        for(String s : Helper.symbolTable.scopes)
        {
            System.out.println(s);
        }

        if (Helper.symbolTable.getErrorMassages().isEmpty())
        {
            Desktop.getDesktop().browse(URI.create("http://localhost/projectC//Code.php"));

        }
        else
        {
            for ( String Massage : Helper.symbolTable.getErrorMassages())
            {
                System.out.println(Massage);
            }
        }



    }



}

