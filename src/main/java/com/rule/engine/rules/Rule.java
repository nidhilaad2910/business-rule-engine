package com.rule.engine.rules;

import com.rule.engine.action.ActionFactory;
import com.rule.engine.action.GeneratePackingSlipAction;
import com.rule.engine.action.IAction;
import com.rule.engine.enums.ACTION;
import com.rule.engine.enums.MODE;
import com.rule.engine.enums.TYPE;
import com.rule.engine.product.IProduct;
import com.rule.engine.product.Product;

public class Rule implements IRule {
    MODE mode;
    ACTION action;
    TYPE type;
    String name;
    String ruleAction;

    public Rule(MODE mode,ACTION action,TYPE type,String name,String ruleAction) {
        this.action = action;
        this.mode = mode;
        this.type=type;
        this.name = name;
        this.ruleAction = ruleAction;
    }
    public IAction verifyRule(IProduct product){
        if(this.action != null && product.getAction() != this.action){
            return null;
        }
        if(this.mode != null && product.getMode() != this.mode){
            return null;
        }
        if(this.name != null && !product.getName().equals(this.name)){
            return null;
        }
        if(this.type != null && product.getType() != this.type){
            return null;
        }
        IAction action = new ActionFactory().getAction(this.ruleAction);
        action.performAction();
        return action;
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
