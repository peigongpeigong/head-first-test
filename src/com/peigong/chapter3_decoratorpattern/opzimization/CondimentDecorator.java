package com.peigong.chapter3_decoratorpattern.opzimization;

public abstract class CondimentDecorator extends Beverage {

    @Override
    public String getDescription() {
        return " + ";
    }
}
