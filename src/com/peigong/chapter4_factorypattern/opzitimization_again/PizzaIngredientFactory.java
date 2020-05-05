package com.peigong.chapter4_factorypattern.opzitimization_again;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();

}
