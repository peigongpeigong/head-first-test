package com.peigong.chapter3_decoratorpattern.opzimization;

/**
 * @author: lilei
 * @create: 2020-05-03 11:08
 **/
public abstract class Beverage {

    protected String description = "Unknown";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
