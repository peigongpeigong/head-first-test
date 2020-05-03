package com.peigong.chapter3_decoratorpattern.unopzimized;

/**
 * @author: lilei
 * @create: 2020-05-03 11:03
 **/
public class EspressoWithWhipandSoy extends Beverage {

    public EspressoWithWhipandSoy() {
        description = "EspressoWithWhipandSoy";
    }

    @Override
    public float cost() {
        return 2.2f;
    }
}
