package com.peigong.chapter4_factorypattern.opzitimization_again.pizza;

import com.peigong.chapter4_factorypattern.opzitimization_again.PizzaIngredientFactory;

/**
 * @author: lilei
 * @create: 2020-05-05 11:29
 **/
public class ClamPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClam();
    }
}
