package com.codecool;

import java.util.*;

public class Fact {
    
    private String id;
    private String description;
    private HashMap<String, Boolean> idSet = new HashMap<>();
    private boolean temp;

    public Fact(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public Set<String> getIdSet() {
        Set<String> result = new HashSet<>();
        for (String id : idSet.keySet()) {
            result.add(id);
        }
        return result;
    }

    public boolean getValueById(String id) {
        for (String key : idSet.keySet()) {
            if (key.equals(id)) {
                temp = idSet.get(key);
            }
        }
        return temp;
    }

    public void setFactValueById(String id, boolean value) {
        idSet.put(id, value);
    }

    public String getDescription() {
        return description;
    }
}
