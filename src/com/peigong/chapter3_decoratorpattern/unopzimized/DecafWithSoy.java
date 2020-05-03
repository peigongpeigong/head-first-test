package com.peigong.chapter3_decoratorpattern.unopzimized;

/**
 * @author: lilei
 * @create: 2020-05-03 11:01
 **/
public class DecafWithSoy extends Beverage {

    public DecafWithSoy(){
        description = "DecafWithSoy";
    }

    @Override
    public float cost() {
        return 6.6f;
    }
}
