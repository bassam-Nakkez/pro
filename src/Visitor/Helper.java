package Visitor;

import AST.Widget.Widget;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Helper
{
    public static String currentHtmlName="";
    public static HashMap< String , Widget> widgets = new HashMap<String , Widget>();
    public static HashMap< String , Integer > countTypeOfWidget = new HashMap<String , Integer>();


    public  static Set<String> navigatorClass = new HashSet<>();

    public  static Set<String> widgetClass = new HashSet<>();

    public static  HashMap<String,FileManagement>files = new HashMap<>();


}
