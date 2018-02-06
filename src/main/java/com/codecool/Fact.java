package com.codecool;

import java.util.Set;

public class Fact {
    
    private String id;
    private String description;
    private Set<String> idSet;
    private boolean livingSpace;
    private boolean freeTime;
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
        if (id.equalsIgnoreCase("livingSpace")) {
            return livingSpace;
        } if (id.equalsIgnoreCase("freeTime")) {
            return freeTime;
        } if (id.equalsIgnoreCase("money")) {
            return money;
        } if (id.equalsIgnoreCase("activeness")) {
            return activeness;
        } if (id.equalsIgnoreCase("cleaning")) {
            return cleaning;
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
