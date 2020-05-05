package com.peigong.chapter4_factorypattern.opzitimization_again.newyork;

import com.peigong.chapter4_factorypattern.opzitimization_again.pizza.*;
import com.peigong.chapter4_factorypattern.opzimization.*;
import com.peigong.chapter4_factorypattern.opzitimization_again.PizzaIngredientFactory;

/**
 * @author: lilei
 * @create: 2020-05-04 10:37
 **/
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
