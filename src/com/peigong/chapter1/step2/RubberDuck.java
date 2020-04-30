package com.peigong.chapter1.step2;

/**
 * @author: lilei
 * @create: 2020-04-30 11:38
 **/
public class RubberDuck extends Duck {

    public RubberDuck(){
        quackBehavior = new Squack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("橡皮鸭");
    }
}
