package com.peigong.chapter3_decoratorpattern.unopzimized;

/**
 * @author: lilei
 * @create: 2020-05-03 11:04
 **/
public class DarkRoastWithWhipandSoy extends Beverage{

    public DarkRoastWithWhipandSoy() {
        description = "DarkRoastWithWhipandSoy";
    }

    @Override
    public float cost() {
        return 3.4f;
    }
}
