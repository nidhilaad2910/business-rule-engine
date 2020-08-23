package com.rule.engine.action;

public class SendNotification implements IAction {
    @Override
    public void performAction() {
        System.out.println("--------Email Owner for upgrade-----------------");
    }
}
