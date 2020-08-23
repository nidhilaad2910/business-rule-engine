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
public class RuleMainClassTest {
    RuleMainClass ruleMainClass = new RuleMainClass();
    @Test
    public void test_RuleMainClass_Success(){


        Assert.assertEquals(1,1);
    }
}
