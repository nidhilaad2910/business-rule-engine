package com.rule.engine.action;

public class ActionFactory {

    public IAction getAction(String action){
        switch (action){
            case "GeneratePackingSlipAction":
                return new GeneratePackingSlipAction();
            case "DuplicatePackingSlipRoyaltyDept":
                return new DuplicatePackingSlipRoyaltyDept();
            case "ActivateMembership":
                return new ActivateMembership();
            case "UpgradeMembership":
                return new UpgradeMembership();
            case "SendNotification":
                return new SendNotification();
            case "AddFreeVideo":
                return new AddFreeVideo();
            case "GenerateCommissionPayment":
                return new GenerateCommissionPayment();
        }
        return null;
    }
}
