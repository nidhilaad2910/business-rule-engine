package com.rule.engine;

import com.rule.engine.action.DuplicatePackingSlipRoyaltyDept;
import com.rule.engine.action.GeneratePackingSlipAction;
import com.rule.engine.action.IAction;
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
        Product product = new Product(ACTION.ACTIVATE, MODE.PHYSICAL, TYPE.MEMBERHIP,"Mempership Activate");
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
}

