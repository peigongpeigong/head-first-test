package com.peigong.chapter1.step2;

/**
 * @author: lilei
 * @create: 2020-04-30 12:08
 **/
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("模型鸭");
    }
}
