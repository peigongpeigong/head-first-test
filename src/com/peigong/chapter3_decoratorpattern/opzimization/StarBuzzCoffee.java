package com.peigong.chapter3_decoratorpattern.opzimization;

/**
 * @author: lilei
 * @create: 2020-05-03 11:26
 **/
public class StarBuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " ,$" + beverage.cost());

        Beverage b2 = new Mocha(beverage);
        System.out.println(b2.getDescription() + " ,$" + b2.cost());

        Beverage b3 = new Milk(b2);
        System.out.println(b3.getDescription() + " ,$" + b3.cost());

        Beverage b4 = new Soy(b3);
        System.out.println(b4.getDescription() + " ,$" + b4.cost());

        Beverage b5 = new Whip(b4);
        System.out.println(b5.getDescription() + " ,$" + b5.cost());
    }
}
