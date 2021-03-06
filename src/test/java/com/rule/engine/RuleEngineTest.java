package com.rule.engine;

import com.rule.engine.action.*;
import com.rule.engine.enums.ACTION;
import com.rule.engine.enums.MODE;
import com.rule.engine.enums.TYPE;
import com.rule.engine.product.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

@RunWith(JUnit4.class)
public class RuleEngineTest {
    RuleEngine ruleEngine = new RuleEngine();
    @Test
    public void ruleEngine_Rule1_Success(){
        Product product = new Product(ACTION.ACTIVATE, MODE.PHYSICAL, TYPE.OTHER,"Mempership Activate");
        List<IAction> action = ruleEngine.checkForProduct(product);
        Assert.assertEquals(action.size(),1);
        Assert.assertEquals(action.get(0).getClass(), GeneratePackingSlipAction.class);
    }
    @Test
    public void ruleEngine_Rule2_Success(){
        Product product = new Product(ACTION.ACTIVATE, MODE.DIGITAL, TYPE.BOOK,"Life Of Pie");
        List<IAction> action = ruleEngine.checkForProduct(product);
        Assert.assertEquals(action.size(),1);
        Assert.assertEquals(action.get(0).getClass(), DuplicatePackingSlipRoyaltyDept.class);
    }
    @Test
    public void ruleEngine_Rule3_Success(){
        Product product = new Product(ACTION.ACTIVATE, null, TYPE.MEMBERHIP,"Website Membership");
        List<IAction> action = ruleEngine.checkForProduct(product);
        Assert.assertEquals(action.size(),2);
        Assert.assertEquals(action.get(0).getClass(), ActivateMembership.class);
        Assert.assertEquals(action.get(1).getClass(), SendNotification.class);
    }

    @Test
    public void ruleEngine_Rule4_Success(){
        Product product = new Product(ACTION.UPGRADE, null, TYPE.MEMBERHIP,"Website Membership upgrade");
        List<IAction> action = ruleEngine.checkForProduct(product);
        Assert.assertEquals(3,action.size());

        Assert.assertEquals(action.get(0).getClass(),UpgradeMembership.class);
        Assert.assertEquals(action.get(1).getClass(),SendNotification.class);
        Assert.assertEquals(action.get(2).getClass(),SendNotification.class);

    }
    @Test
    public void ruleEngine_Rule5_Success(){
        Product product = new Product(ACTION.UPGRADE, null, TYPE.OTHER,"upgrade action");
        List<IAction> action = ruleEngine.checkForProduct(product);
        Assert.assertEquals(action.size(),1);
        Assert.assertEquals(action.get(0).getClass(), SendNotification.class);
    }
    @Test
    public void ruleEngine_Rule6_Success(){
        Product product = new Product(null, null, TYPE.VIDEO,"Learning to Ski");
        List<IAction> action = ruleEngine.checkForProduct(product);
        Assert.assertEquals(1,action.size());
        Assert.assertEquals(action.get(0).getClass(), AddFreeVideo.class);
    }
    @Test
    public void ruleEngine_Rule7_Success(){
        Product product = new Product(null, MODE.PHYSICAL, null,"product");
        List<IAction> action = ruleEngine.checkForProduct(product);
        Assert.assertEquals(2,action.size());
        Assert.assertEquals(action.get(0).getClass(), GeneratePackingSlipAction.class);
        Assert.assertEquals(action.get(1).getClass(), GenerateCommissionPayment.class);
    }
    @Test
    public void ruleEngine_Rule8_Success(){
        Product product = new Product(null, null, TYPE.BOOK,"product");
        List<IAction> action = ruleEngine.checkForProduct(product);
        Assert.assertEquals(2,action.size());
        Assert.assertEquals(action.get(0).getClass(), DuplicatePackingSlipRoyaltyDept.class);
        Assert.assertEquals(action.get(1).getClass(), GenerateCommissionPayment.class);
    }
}

