package com.peigong.chapter3_decoratorpattern.unopzimized;

/**
 * @author: lilei
 * @create: 2020-05-03 11:05
 **/
public class AndMore extends Beverage {

    public AndMore() {
        description = "还有更多类型的";
    }

    @Override
    public float cost() {
        return 0;
    }
}
