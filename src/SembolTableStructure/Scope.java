package SembolTableStructure;

import SembolTableStructure.FunctionType.*;
import SembolTableStructure.VaraibleType.*;

import java.util.HashMap;

public class Scope {


    HashMap<String , _Variable> variables = new HashMap <String , _Variable>();
    HashMap<String , _Function> functions =new HashMap<>();
    HashMap< String , _Class > classes = new HashMap<>();
    HashMap <String , _NameSpace > nameSpaces = new HashMap<>();






    //---------------<< Variables


    public void DeclareVariable(String name , String type , int line)   // Add Declaration Variable to Symbol Table
    {


        if(type.equals("int") || type.equals("INT") )
        {
            _IntVariable  variable =  new _IntVariable() ;
            variable.setLineOfDeclaration(line);
            this.variables.put(name ,variable);
        } else if(type.equals("float")  || type.equals("FLOAT")  )
        {
            _FloatVariable variable =  new _FloatVariable() ;
            variable.setLineOfDeclaration(line);
            this.variables.put(name ,variable);
        }else if(type.equals("boolean")   || type.equals("BOOLEAN"))
        {
            _BooleanVariable variable =  new _BooleanVariable() ;
            variable.setLineOfDeclaration(line);
            this.variables.put(name ,variable);
        }
        else if(type.equals("DOUBLE")  || type.equals("double") )
        {
            _DoubleVariable  variable =  new _DoubleVariable() ;
            variable.setLineOfDeclaration(line);
            this.variables.put(name ,variable);
        }
    }

    public boolean Exists(String name)
    {
        if(this.variables.get(name)!=null )return true;
        else return false;

    }

    public _Variable VariableInfo(String name){ return this.variables.get(name);  }

    public HashMap <String, _Variable> getAllVariables() {
        return variables;
    }








    //--------------- Functions

    public void DeclareFunction(String name , String type , int line)   // Add Declaration Function to Symbol Table
    {


        if(type.equals("int") || type.equals("INT") )
        {
            IntFunction fun =  new IntFunction() ;
            fun.setLineOfDeclaration(line);
            this.functions.put(name ,fun);
        } else if(type.equals("float")  || type.equals("FLOAT")  )
        {
            FloatFunction fun =  new FloatFunction() ;
            fun.setLineOfDeclaration(line);
            this.functions.put(name ,fun);
        }else if(type.equals("boolean")   || type.equals("BOOLEAN"))
        {
            BooleanFunction variable =  new BooleanFunction() ;
            variable.setLineOfDeclaration(line);
            this.functions.put(name ,variable);
        }
        else if(type.equals("DOUBLE")  || type.equals("double") )
        {
            DoubleFunction variable =  new DoubleFunction() ;
            variable.setLineOfDeclaration(line);
            this.functions.put(name ,variable);
        }
    }



}
