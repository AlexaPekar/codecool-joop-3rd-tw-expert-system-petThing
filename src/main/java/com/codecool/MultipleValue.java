package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class MultipleValue extends Value{

    public String getParam() {
        return null;
    }

    private List<String> params = new ArrayList<>();
    boolean selectionType;

    public MultipleValue(List<String> params, boolean selectionType) {
        this.params = params;
        this.selectionType=selectionType;
    }

    public List<String> getInputPattern(){
        return params;
    }


    public boolean getSelectionType() {
        return selectionType;
    }
}
