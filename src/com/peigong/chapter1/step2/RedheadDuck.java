package com.peigong.chapter1.step2;

/**
 * @author: lilei
 * @create: 2020-04-30 11:37
 **/
public class  RedheadDuck extends Duck {

    public RedheadDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("红头");
    }
}
