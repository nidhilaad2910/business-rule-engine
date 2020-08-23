package com.rule.engine.rules;

import com.rule.engine.action.IAction;
import com.rule.engine.product.IProduct;

public interface IRule {
    String getAction();
    String getCondition();
    void setAction(String action);
    void setCondition(String condition);
    public IAction verifyRule(IProduct product);
}
