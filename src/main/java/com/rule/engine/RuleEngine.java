package com.rule.engine;

import com.rule.engine.product.Product;
import com.rule.engine.rules.IRule;
import com.rule.engine.rules.Rule;

public class RuleEngine {
    RuleEngine(){

    }
    IRule createRule(String condition  , String  action){
        IRule rule = new Rule("MODE == PHYSICAL" , "ACTION == ANY");

        return rule;
    }

    public String checkForProduct(Product life_of_pie) {
        return null;
    }
}
