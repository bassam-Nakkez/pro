package SembolTableStructure;

import java.util.ArrayList;
import java.util.List;

public class _Class extends Scope {

    int declarationLine;
    boolean isAbstract;
    List<String> interfaces = new ArrayList<>();
    Scope ClassScope;
    String SuperClassName;


    public int getDeclarationLine() {
        return declarationLine;
    }

    public void setDeclarationLine(int declarationLine) {
        this.declarationLine = declarationLine;
    }

    public boolean isAbstract() {
        return isAbstract;
    }

    public void setAbstract(boolean anAbstract) {
        isAbstract = anAbstract;
    }

    public List<String> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(List<String> interfaces) {
        this.interfaces = interfaces;
    }

    public Scope getClassScope() {
        return ClassScope;
    }

    public void setClassScope(Scope classScope) {
        ClassScope = classScope;
    }

    public String getSuperClassName() {
        return SuperClassName;
    }

    public void setSuperClassName(String superClassName) {
        SuperClassName = superClassName;
    }
}
