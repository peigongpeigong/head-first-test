package com.peigong.chapter7_adapter_facade.adapter.duck;

/**
 * @author: lilei
 * @create: 2020-05-08 10:57
 **/
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("duck fly");
    }
}
