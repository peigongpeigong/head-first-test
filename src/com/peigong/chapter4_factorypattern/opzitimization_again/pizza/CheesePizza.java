package com.peigong.chapter4_factorypattern.opzitimization_again.pizza;

import com.peigong.chapter4_factorypattern.opzitimization_again.PizzaIngredientFactory;

/**
 * @author: lilei
 * @create: 2020-05-05 11:27
 **/
public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
