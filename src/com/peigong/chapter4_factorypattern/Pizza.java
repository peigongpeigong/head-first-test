package com.peigong.chapter4_factorypattern;

import java.util.ArrayList;

/**
 * @author: lilei
 * @create: 2020-05-04 10:25
 **/
public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList<String> toppings = new ArrayList<>();

    public void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough..");
        System.out.println("Adding sauce..");
        System.out.println("Adding toppings:");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

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
}
