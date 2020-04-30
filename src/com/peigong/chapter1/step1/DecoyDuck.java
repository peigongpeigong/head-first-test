package com.peigong.chapter1.step1;

/**
 * @author: lilei
 * @create: 2020-04-30 10:54
 **/
public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("诱饵鸭");
    }

    @Override
    public void quack() {
        System.out.println("不会叫");
    }

    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
