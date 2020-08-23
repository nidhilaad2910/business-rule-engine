package com.rule.engine.rules;

public interface IRule {
    String getAction();
    String getCondition();
    void setAction(String action);
    void setCondition(String condition);
}
