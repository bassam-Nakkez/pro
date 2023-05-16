package SymbolTableSructure;
import Visitor.Helper;

import  java.util.ArrayList;
import  java.util.HashMap;
import  java.util.List;
import java.util.function.Function;

public class SymbolTable
{


    public List<String> scopes = new ArrayList<>();
    public HashMap < String ,  Data > FirstScope = new HashMap<>() ;


    public boolean parameter = false;

    List<String> errorMassages = new ArrayList<>();

    public List<String> getErrorMassages() {
        return errorMassages;
    }

    public void setErrorMassages(List<String> errorMassages) {
        this.errorMassages = errorMassages;
    }

    public HashMap<String, Data> getFirstScope() {
        return FirstScope;
    }

    public void setFirstScope(HashMap<String, Data> firstScope) {
        FirstScope = firstScope;
    }

    public void openScope(String scopeName)
    {
        this.scopes.add(scopeName);
    }

    public void closeScope(String scopeName)
    {
        this.scopes.remove(scopeName);
    }


    public void add2symbolTable(int line ,  String name , Data data )
    {
        if (!this.parameter )
        {
            List<String> copyList = new ArrayList<>();
            for (String s : this.scopes) {
                copyList.add(s);
            }
            Helper.SymbolTable_Add(copyList, this.FirstScope,null,null, this.errorMassages, line, name, data);
        }
        return;

    }

    public String getValue( String name , String type)
    {
        if (!this.parameter )
        {
            List<String> copyList = new ArrayList<>();
            for (String s : this.scopes) {
                copyList.add(s);
            }
            return Helper.SymbolTableGetValue(copyList, this.FirstScope,null,type, this.errorMassages , name);
        }
        return null;
    }


}
