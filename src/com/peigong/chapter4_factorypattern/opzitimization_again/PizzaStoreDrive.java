package com.peigong.chapter4_factorypattern.opzitimization_again;

import com.peigong.chapter4_factorypattern.opzitimization_again.chicago.ChicagoPizzaStore;
import com.peigong.chapter4_factorypattern.opzitimization_again.newyork.NYPizzaStore;
import com.peigong.chapter4_factorypattern.opzitimization_again.pizza.Pizza;

/**
 * @author: lilei
 * @create: 2020-05-05 13:45
 **/
public class PizzaStoreDrive {
    public static void main(String[] args) {
        PizzaStore nyps = new NYPizzaStore();
        Pizza cp = nyps.orderPizza("cheese");
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        cp = chicagoStore.orderPizza("cheese");

    }

}
