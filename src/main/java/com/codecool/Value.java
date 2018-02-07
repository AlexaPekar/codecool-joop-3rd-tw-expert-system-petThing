package com.codecool;

import java.util.List;

public abstract class Value {

    public abstract String getParam();

    public abstract List<String> getInputPattern();

    public abstract boolean getSelectionType();
}
