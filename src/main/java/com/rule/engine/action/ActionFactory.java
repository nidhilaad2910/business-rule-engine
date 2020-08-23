package com.rule.engine.action;

public class ActionFactory {

    public IAction getAction(String action){
        switch (action){
            case "GeneratePackingSlipAction":
                return new GeneratePackingSlipAction();
            case "DuplicatePackingSlipRoyaltyDept":
                return new DuplicatePackingSlipRoyaltyDept();
        }
        return null;
    }
}
