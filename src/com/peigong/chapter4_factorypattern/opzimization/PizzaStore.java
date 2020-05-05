package com.peigong.chapter4_factorypattern.opzimization;

import com.peigong.chapter4_factorypattern.opzitimization_again.pizza.Pizza;

/**
 * @author: lilei
 * @create: 2020-05-04 10:34
 **/
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);

}
