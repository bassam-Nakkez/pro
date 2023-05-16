import AST.DataType.IntNumber;
import AST.Expression.Expression;
import AST.Parse;
import SembolTableStructure.SymbolTable;
import Visitor.FileManagement;
import Visitor.Helper;
import Visitor.MyVisitor;
import alter.DartLexer;
import alter.DartParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {

    public static void main(String[] args) throws IOException
    {

        File folder = new File("Files");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            String fileSource = listOfFiles[i].getPath();
            Helper.files.put(listOfFiles[i].getName(),new FileManagement());
            Helper.currentHtmlName=listOfFiles[i].getName();
            System.out.println(fileSource);
            CharStream charStream = fromFileName(fileSource);
            DartLexer lex = new DartLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lex);
            DartParser parser = new DartParser(tokens);
            ParseTree ast = parser.parse();
            MyVisitor myVisitor = new MyVisitor();
            Parse in = (Parse) myVisitor.visit(ast);
            System.out.println(in);
        }

//        String fileSource="Files/testWidget.dart";
//        System.out.println(fileSource);
//        CharStream charStream = fromFileName(fileSource);
//        DartLexer lex = new DartLexer(charStream);
//        CommonTokenStream tokens = new CommonTokenStream(lex);
//        DartParser parser = new DartParser(tokens);
//        ParseTree ast = parser.parse();
//        MyVisitor myVisitor = new MyVisitor();
//        Parse in = (Parse) myVisitor.visit(ast);
//        System.out.println(in);

            //if nav ture
//
//
//        String str = null ;
//
//        System.out.println(str);
//

//        SymbolTable st = new SymbolTable();

      //  FileManagement.writeToTheFile("NewFile.html" , " <you are welcome 22>" );
       // FileManagement.Overwrite("NewFile.html");

        //FileManagement.openFile("NewFile.html");
        try {
            FileManagement.openFile(Helper.currentHtmlName+".php");
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


    }





}