package com.rule.engine;

import com.rule.engine.enums.ACTION;
import com.rule.engine.enums.MODE;
import com.rule.engine.enums.TYPE;
import com.rule.engine.product.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class RuleEngineTest {
    RuleEngine ruleEngine = new RuleEngine();
    @Test
    public void ruleEngine_Rule1_Success(){
        String appliedRules = ruleEngine.checkForProduct(new Product(ACTION.ACTIVATE, MODE.PHYSICAL,TYPE.BOOK,"Life Of Pie"));
        Assert.assertEquals(appliedRules,"1");
    }
}

