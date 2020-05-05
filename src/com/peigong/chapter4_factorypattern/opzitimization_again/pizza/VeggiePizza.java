package com.peigong.chapter4_factorypattern.opzitimization_again.pizza;

import com.peigong.chapter4_factorypattern.opzitimization_again.Dough;
import com.peigong.chapter4_factorypattern.opzitimization_again.PizzaIngredientFactory;

/**
 * @author: lilei
 * @create: 2020-05-05 11:34
 **/
public class VeggiePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        veggies = ingredientFactory.createVeggies();
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();
        dough = ingredientFactory.createDough();
    }
}
