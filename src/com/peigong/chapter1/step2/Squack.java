package com.peigong.chapter1.step2;

/**
 * @author: lilei
 * @create: 2020-04-30 11:32
 **/
public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
