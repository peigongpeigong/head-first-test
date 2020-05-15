package com.peigong.chapter12_compound.ducks.duck;

import com.peigong.chapter12_compound.ducks.Quackable;
import com.peigong.chapter12_compound.ducks.duck.observer.Observable;
import com.peigong.chapter12_compound.ducks.duck.observer.Observer;

/**
 * @author: lilei
 * @create: 2020-05-14 14:07
 **/
public class MallardDuck implements Quackable {

    Observable observable;

    public MallardDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    public String toString(){
        return "Mallard Duck";
    }
}
