package com.peigong.chapter4_factorypattern.opzitimization_again.pizza;

import com.peigong.chapter4_factorypattern.opzitimization_again.*;

/**
 * @author: lilei
 * @create: 2020-05-05 11:23
 **/
public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25min at 350");
    }

    public void cut(){
        System.out.println("CUtting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
