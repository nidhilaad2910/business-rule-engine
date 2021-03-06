package com.rule.engine;

import com.rule.engine.enums.ACTION;
import com.rule.engine.enums.MODE;
import com.rule.engine.enums.TYPE;
import com.rule.engine.product.IProduct;
import com.rule.engine.product.Product;
import com.rule.engine.rules.Rule;

import java.util.Scanner;

public class RuleMainClass {
    static RuleEngine ruleEngine = new RuleEngine();
    public static void main(String args[]) {

        System.out.println("Rule Engine Started");
        while (true) {
            System.out.println("Choose opration to be performed");
            System.out.println("1. Add payment for new product - enter 1");
            System.out.println("2. Add new rule - enter 2");
            System.out.println("3. To Exit - enter 3");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter product mode (PHYSICAL/DIGITAL)");
                    String mode = scanner.next();
                    System.out.println("Enter product type (BOOK/MEMBERSHIP/VIDEO/OTHER)");
                    String type = scanner.next();
                    System.out.println("Enter product action (ACTIVATE/UPGRADE)");
                    String action = scanner.next();
                    System.out.println("Enter product name ");
                    String name = scanner.next();
                    IProduct product = new Product(ACTION.valueOf(action), MODE.valueOf(mode),
                            TYPE.valueOf(type), name);
                    ruleEngine.checkForProduct(product);

                    break;
                case 2:
                    System.out.println("Enter mode expected(PHYSICAL,DIGITAL,NULL)");
                    String mode1 = scanner.next();
                    System.out.println("Enter type expected (BOOK,MEMBERHIP,VIDEO,OTHER,NULL)");
                    String type1 = scanner.next();
                    System.out.println("Enter action expected (ACTIVATE,UPGRADE,NULL)");
                    String action1 = scanner.next();
                    System.out.println("Enter name expected ");
                    String name1 = scanner.next();
                    System.out.println("Enter ruleAction expected ");
                    String ruleAction = scanner.next();
                    //Add conditions for adding rules
                    ruleEngine.ruleList.add(new Rule(MODE.valueOf(mode1),ACTION.valueOf(action1),
                            TYPE.valueOf(type1),name1,ruleAction));

                    break;
                default:
                    return;
            }
        }
    }

}
