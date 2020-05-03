package com.peigong.chapter3_decoratorpattern.opzimization;

/**
 * @author: lilei
 * @create: 2020-05-03 11:19
 **/
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + super.getDescription() + "Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.3f;
    }
}
