package com.peigong.chapter3_decoratorpattern.opzimization;

/**
 * @author: lilei
 * @create: 2020-05-03 11:17
 **/
public class Mocha extends CondimentDecorator {

    protected Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + super.getDescription() + "Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2f;
    }
}
