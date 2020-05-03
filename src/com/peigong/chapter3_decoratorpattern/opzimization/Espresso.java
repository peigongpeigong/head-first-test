package com.peigong.chapter3_decoratorpattern.opzimization;

/**
 * @author: lilei
 * @create: 2020-05-03 11:11
 **/
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 0.55f;
    }
}
