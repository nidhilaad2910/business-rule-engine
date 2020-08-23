package com.rule.engine.product;

import com.rule.engine.enums.ACTION;
import com.rule.engine.enums.MODE;
import com.rule.engine.enums.TYPE;

public class Product implements IProduct {
    ACTION action;
    MODE mode;
    TYPE type;
    String name;

    public Product(ACTION action,MODE mode,TYPE type,String name){
        this.action = action;
        this.mode = mode;
        this.type = type;
        this.name = name;
    }

    public ACTION getAction() {
        return action;
    }

    public void setAction(ACTION action) {
        this.action = action;
    }

    public MODE getMode() {
        return mode;
    }

    public void setMode(MODE mode) {
        this.mode = mode;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
