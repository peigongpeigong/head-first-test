package com.peigong.chapter1.step1;

/**
 * @author: lilei
 * @create: 2020-04-30 10:49
 **/
public abstract class Duck {

    public void quack(){
        System.out.println("呱呱叫");
    }

    public void swim(){
        System.out.println("游泳");
    }

    public abstract void display();

    public void fly(){
        System.out.println("飞");
    }

}
