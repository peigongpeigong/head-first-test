package com.peigong.chapter4_factorypattern.opzitimization_again.chicago;

import com.peigong.chapter4_factorypattern.opzitimization_again.*;
import com.peigong.chapter4_factorypattern.opzitimization_again.veggies.BlackOlives;
import com.peigong.chapter4_factorypattern.opzitimization_again.veggies.Eggplant;
import com.peigong.chapter4_factorypattern.opzitimization_again.veggies.Spinach;

/**
 * @author: lilei
 * @create: 2020-05-05 11:19
 **/
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new BlackOlives(),new Spinach(),new Eggplant()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
