package com.peigong.chapter3_decoratorpattern.unopzimized;

/**
 * @author: lilei
 * @create: 2020-05-03 10:59
 **/
public abstract class Beverage {

    protected String description = "Beverage";

    public String getDescription() {
        return description;
    }

    public abstract float cost();

}
