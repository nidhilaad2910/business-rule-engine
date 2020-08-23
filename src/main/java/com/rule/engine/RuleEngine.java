package com.rule.engine;

import com.rule.engine.action.IAction;
import com.rule.engine.enums.ACTION;
import com.rule.engine.enums.MODE;
import com.rule.engine.enums.TYPE;
import com.rule.engine.product.IProduct;
import com.rule.engine.product.Product;
import com.rule.engine.rules.IRule;
import com.rule.engine.rules.Rule;

import java.util.ArrayList;
import java.util.List;

public class RuleEngine {
    List<IRule> ruleList = new ArrayList<IRule>();
    RuleEngine(){
        ruleList.add(createRule(MODE.PHYSICAL,null,null,null,"GeneratePackingSlipAction"));
        ruleList.add(createRule(null,null,TYPE.BOOK,null,"DuplicatePackingSlipRoyaltyDept"));
    }
    IRule createRule(MODE mode, ACTION action, TYPE type,String name,String ruleAction){
        IRule rule = new Rule(mode,action,type,name,ruleAction);
        return rule;
    }

    public List<IAction> checkForProduct(IProduct book) {
        List<IAction> actions = new ArrayList<>();
       for(IRule rule : ruleList){
           IAction temp= rule.verifyRule(book);
           if(temp!=null) actions.add(temp);
       }
       return actions;
    }
}
