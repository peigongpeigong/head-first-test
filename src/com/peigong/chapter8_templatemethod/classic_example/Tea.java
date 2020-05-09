package com.peigong.chapter8_templatemethod.classic_example;

/**
 * @author: lilei
 * @create: 2020-05-09 10:40
 **/
public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
