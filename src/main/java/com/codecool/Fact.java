package com.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Fact {
    
    private String id;
    private String description;
    private Set<String> idSet;
    public boolean livingSpace;
    public boolean freeTime;
    private boolean money;
    private boolean activeness;
    private boolean cleaning;

    public Fact(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public Set<String> getIdSet() {
        return idSet;
    }

    public boolean getValueById(String id) {
        String tempVariable;
        List<String> idList = new ArrayList<>(idSet);
        for (int i = 0; i < idList.size(); i++) {
            tempVariable = idList.get(i);
            if (id.equalsIgnoreCase(tempVariable)) {
                return Boolean.parseBoolean(tempVariable);
            }
        }
        return Boolean.parseBoolean(null);
    }


    public void setFactValueById(String id, boolean value) {
        if (id.equalsIgnoreCase("livingSpace")) {
            livingSpace = value;
        } if (id.equalsIgnoreCase("freeTime")) {
            freeTime = value;
        } if (id.equalsIgnoreCase("money")) {
            money = value;
        } if (id.equalsIgnoreCase("activeness")) {
            activeness = value;
        } if (id.equalsIgnoreCase("cleaning")) {
            cleaning = value;
        }
    }

    public String getDescription() {
        return description;
    }
}
