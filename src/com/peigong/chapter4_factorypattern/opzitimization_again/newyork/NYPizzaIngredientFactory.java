package com.peigong.chapter4_factorypattern.opzitimization_again.newyork;

import com.peigong.chapter4_factorypattern.opzitimization_again.*;
import com.peigong.chapter4_factorypattern.opzitimization_again.veggies.Garlic;
import com.peigong.chapter4_factorypattern.opzitimization_again.veggies.Mushroom;
import com.peigong.chapter4_factorypattern.opzitimization_again.veggies.Onion;
import com.peigong.chapter4_factorypattern.opzitimization_again.veggies.RedPepper;

/**
 * @author: lilei
 * @create: 2020-05-05 11:12
 **/
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(),new Mushroom(),new Onion(),new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
