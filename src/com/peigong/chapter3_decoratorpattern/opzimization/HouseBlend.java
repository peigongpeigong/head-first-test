package com.peigong.chapter3_decoratorpattern.opzimization;

/**
 * @author: lilei
 * @create: 2020-05-03 11:09
 **/
public class HouseBlend extends Beverage {


    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.5f;
    }
}
