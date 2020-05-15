package com.peigong.chapter12_compound.ducks.duck.observer;

/**
 * @author: lilei
 * @create: 2020-05-14 14:59
 **/
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable quackObservable) {
        System.out.println("Quackologist:" + quackObservable + " just quacked.");
    }
}
