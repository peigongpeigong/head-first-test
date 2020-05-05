package com.peigong.chapter4_factorypattern.opzitimization_again.pizza;

import com.peigong.chapter4_factorypattern.opzitimization_again.PizzaIngredientFactory;

/**
 * @author: lilei
 * @create: 2020-05-05 11:37
 **/
public class PepperoniPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
