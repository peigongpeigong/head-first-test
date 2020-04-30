package com.peigong.chapter1.step2;

/**
 * @author: lilei
 * @create: 2020-04-30 11:31
 **/
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
