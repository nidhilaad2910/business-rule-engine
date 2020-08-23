package com.rule.engine.rules;

public class Rule implements IRule {
    String action;
    String condition;

    public Rule(String action, String condition) {
        this.action = action;
        this.condition = condition;
    }

    public String getAction() {
        return null;
    }

    public String getCondition() {
        return null;
    }

    public void setAction(String action) {

    }

    public void setCondition(String condition) {

    }
}
