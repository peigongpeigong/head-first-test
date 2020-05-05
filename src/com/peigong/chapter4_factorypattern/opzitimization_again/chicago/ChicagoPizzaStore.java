package com.peigong.chapter4_factorypattern.opzitimization_again.chicago;

import com.peigong.chapter4_factorypattern.opzitimization_again.PizzaIngredientFactory;
import com.peigong.chapter4_factorypattern.opzitimization_again.pizza.*;
import com.peigong.chapter4_factorypattern.opzimization.ChicagoStyleCheesePizza;
import com.peigong.chapter4_factorypattern.opzimization.ChicagoStyleClamPizza;
import com.peigong.chapter4_factorypattern.opzimization.ChicagoStylePepperoniPizza;
import com.peigong.chapter4_factorypattern.opzimization.PizzaStore;

/**
 * @author: lilei
 * @create: 2020-05-04 10:41
 **/
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}
