package com.peigong.chapter1.step1;

/**
 * @author: lilei
 * @create: 2020-04-30 10:53
 **/
public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("橡皮鸭");
    }

    @Override
    public void fly() {
        System.out.println("不会飞");
    }

    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
