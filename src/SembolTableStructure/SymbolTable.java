package SembolTableStructure;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SymbolTable {


 HashMap <String , _NameSpace > nameSpaces = new HashMap<>();

 public SymbolTable() {
     _NameSpace nameSpace = new _NameSpace("Program");
     nameSpace.scope = new Scope();
 }

    public void  DeclareNameSpace (String name, _NameSpace nameSpace){this.nameSpaces.put( name , nameSpace);}


}
