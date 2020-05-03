package com.peigong.chapter3_decoratorpattern.opzimization;

/**
 * @author: lilei
 * @create: 2020-05-03 11:14
 **/
public class Milk extends CondimentDecorator {

    protected Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + super.getDescription() + "Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.1f;
    }
}
