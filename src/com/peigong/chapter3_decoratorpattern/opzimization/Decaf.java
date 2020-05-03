package com.peigong.chapter3_decoratorpattern.opzimization;

/**
 * @author: lilei
 * @create: 2020-05-03 11:12
 **/
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 0.7f;
    }
}
