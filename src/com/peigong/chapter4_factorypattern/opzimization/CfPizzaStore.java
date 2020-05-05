package com.peigong.chapter4_factorypattern.opzimization;

import com.peigong.chapter4_factorypattern.Pizza;

/**
 * @author: lilei
 * @create: 2020-05-04 10:41
 **/
public class CfPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new CfStyleCheesePizza();
        } else if ("veggie".equals(type)) {
            pizza = new CfStyleCheesePizza();
        } else if ("clam".equals(type)) {
            pizza = new CfStyleClamPizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new CfStylePepperoniPizza();
        }
        return pizza;
    }
}
