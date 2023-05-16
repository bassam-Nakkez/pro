package SembolTableStructure.FunctionType;

import SembolTableStructure.Scope;

import java.lang.reflect.Parameter;

public class _Function extends Scope {

    String type;
    String FunctionName;
    Scope functionScope;
    public int lineOfDeclaration;

    Parameter parameter = null ;



    public String getType(){return "Void";}

    public void setType(String type) {
        this.type = type;
    }

    public String getFunctionName() {
        return FunctionName;
    }

    public void setFunctionName(String functionName) {
        FunctionName = functionName;
    }

    public Scope getFunctionScope() {
        return functionScope;
    }

    public void setFunctionScope(Scope functionScope) {
        this.functionScope = functionScope;
    }

    public int getLineOfDeclaration() {
        return lineOfDeclaration;
    }

    public void setLineOfDeclaration(int lineOfDeclaration) {
        this.lineOfDeclaration = lineOfDeclaration;
    }
}
