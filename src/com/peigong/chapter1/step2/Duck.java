package com.peigong.chapter1.step2;

/**
 * @author: lilei
 * @create: 2020-04-30 11:34
 **/
public abstract class Duck {

    public FlyBehavior flyBehavior;

    public QuackBehavior quackBehavior;

    public abstract void display();

    public void swim(){
        System.out.println("游泳");
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }


}
