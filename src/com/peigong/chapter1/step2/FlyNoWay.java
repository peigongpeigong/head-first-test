package com.peigong.chapter1.step2;

/**
 * @author: lilei
 * @create: 2020-04-30 11:10
 **/
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
