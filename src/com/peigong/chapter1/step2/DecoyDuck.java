package com.peigong.chapter1.step2;

/**
 * @author: lilei
 * @create: 2020-04-30 12:04
 **/
public class DecoyDuck extends Duck {

    public DecoyDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("诱饵鸭");
    }
}
