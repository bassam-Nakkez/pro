package SymbolTableSructure;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Data {

    public String DataType ;
    public String type ;
    public String value;
    public HashMap <String , Data > scope = new HashMap<>();
    public HashMap<String , Data> parameter = new HashMap<>();



    public HashMap <String, Data> getScope() {
        return scope;
    }

    public void setScope(HashMap<String, Data> scope) {
        this.scope = scope;
    }

    public String getDataType() {
        return DataType;
    }

    public void setDataType(String dataType) {
        DataType = dataType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
