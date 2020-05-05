package com.peigong.chapter4_factorypattern.opzimization;

import com.peigong.chapter4_factorypattern.Pizza;

/**
 * @author: lilei
 * @create: 2020-05-04 11:10
 **/
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyps = new NYPizzaStore();
        PizzaStore chicagoPs = new ChicagoPizzaStore();

        Pizza pizza = nyps.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());

        pizza = chicagoPs.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
