package com.peigong.chapter4_factorypattern.opzimization;

import com.peigong.chapter4_factorypattern.Pizza;

/**
 * @author: lilei
 * @create: 2020-05-04 10:38
 **/
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";


        toppings.add("Grated Reggiano Cheese");
    }
}
