package com.codecool;

import java.util.List;

public class SingleValue extends Value{

    String param;
    boolean selectionType;

   public SingleValue(String param,boolean selectionType) {
        this.param = param;
        this.selectionType=selectionType;
    }

    public boolean getSelectionType(){
       return selectionType;
    }

    public List<String> getInputPattern() {
        return null;
    }

    public String getParam() {
       return param;
    }
}
