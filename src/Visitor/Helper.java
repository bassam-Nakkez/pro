package Visitor;

import AST.Widget.Widget;
import SymbolTableSructure.Data;
import SymbolTableSructure.SymbolTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Helper
{
    public static  SymbolTable symbolTable = new SymbolTable();
    public static HashMap< String , Widget> widgets = new HashMap<String , Widget>();
    public static HashMap< String , Integer > countTypeOfWidget = new HashMap<String , Integer>();

    public HashMap< String , String > screens = new HashMap<>();

    public static void SymbolTable_Add(  List<String> scopes , HashMap <String , Data> symbolTable , String ScopeName , String type, List<String> errorMassages , int line , String name, Data data)
    {


         if (scopes.isEmpty()) {
                    if (symbolTable.containsKey(name)) {
                        if (ScopeName != null){
                            errorMassages.add("Error ("+line+"): " + data.type + " '" + name + "' in "+ type+" " + ScopeName + " is already declared.");
                        }
                        else
                        {
                            errorMassages.add("Error ("+line+"): "+ data.type + " '" + name + "' is already declared.");
                        }
                    }
                    else {
                        symbolTable.put( name , data );
                    }
                return;
          }

        else if (!scopes.isEmpty() )
        {
            String item = null;
                for (String i : scopes ) { item = i;
                    break; }
            scopes.remove(item);
            if (symbolTable.containsKey(item)) {
                SymbolTable_Add(scopes , symbolTable.get(item).getScope(),item , symbolTable.get(item).getType() , errorMassages, line, name, data);

            }
            return;
        }
    }




    public static String SymbolTableGetValue(List<String> scopes, HashMap<String, Data> symbolTable, String ScopeName, String type, List<String> errorMassages, String name)
    {

        if (scopes.isEmpty()) {
            if (symbolTable.containsKey(name)) {
                if (ScopeName != null){
                    if(symbolTable.get(name).type == type)
                    {
                        return symbolTable.get(name).getValue();
                    }

                }
            }
            else {
                return null;

            }
            return null;
        }

        else if (!scopes.isEmpty() )
        {
            String item = null;
            for (String i : scopes ) { item = i;
                break; }
            scopes.remove(item);
            if (symbolTable.containsKey(item)) {
                SymbolTableGetValue(scopes , symbolTable.get(item).getScope(),item , symbolTable.get(item).getType() , errorMassages, name);

            }
            return null;
        }
        return null;

    }


}

