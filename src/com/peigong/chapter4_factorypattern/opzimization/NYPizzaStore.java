package com.peigong.chapter4_factorypattern.opzimization;

import com.peigong.chapter4_factorypattern.Pizza;

/**
 * @author: lilei
 * @create: 2020-05-04 10:37
 **/
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new NYStyleCheesePizza();
        } else if ("veggie".equals(type)) {
            pizza = new NYStyleVeggiePizza();
        } else if ("clam".equals(type)) {
            pizza = new NYStyleClamPizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new NYStylePepperoniPizza();
        }
        return pizza;
    }
}
