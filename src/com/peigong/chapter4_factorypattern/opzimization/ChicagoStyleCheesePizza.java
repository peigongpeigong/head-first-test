package com.peigong.chapter4_factorypattern.opzimization;

import com.peigong.chapter4_factorypattern.Pizza;

/**
 * @author: lilei
 * @create: 2020-05-04 10:38
 **/
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Curring the pizza into square slices");
    }
}
