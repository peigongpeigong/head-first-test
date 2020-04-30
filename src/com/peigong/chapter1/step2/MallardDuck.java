package com.peigong.chapter1.step2;

/**
 * @author: lilei
 * @create: 2020-04-30 11:36
 **/
public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("绿头");
    }
}
