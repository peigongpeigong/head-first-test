package com.peigong.chapter4_factorypattern.opzimization;

import com.peigong.chapter4_factorypattern.Pizza;

/**
 * @author: lilei
 * @create: 2020-05-04 10:41
 **/
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza();
        } else if ("veggie".equals(type)) {
            pizza = new ChicagoStyleCheesePizza();
        } else if ("clam".equals(type)) {
            pizza = new ChicagoStyleClamPizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new ChicagoStylePepperoniPizza();
        }
        return pizza;
    }
}
