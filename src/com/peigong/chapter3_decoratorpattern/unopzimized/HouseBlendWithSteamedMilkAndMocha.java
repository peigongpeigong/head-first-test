package com.peigong.chapter3_decoratorpattern.unopzimized;

/**
 * @author: lilei
 * @create: 2020-05-03 11:02
 **/
public class HouseBlendWithSteamedMilkAndMocha extends Beverage {

    public HouseBlendWithSteamedMilkAndMocha() {
        description = "HouseBlendWithSteamedMilkAndMocha";
    }

    @Override
    public float cost() {
        return 10f;
    }
}
