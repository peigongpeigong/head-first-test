package com.peigong.chapter12_compound.ducks.duck;

import com.peigong.chapter12_compound.ducks.Quackable;
import com.peigong.chapter12_compound.ducks.duck.observer.Observable;
import com.peigong.chapter12_compound.ducks.duck.observer.Observer;

/**
 * @author: lilei
 * @create: 2020-05-14 14:08
 **/
public class DuckCall implements Quackable {

    Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
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

    @Override
    public String toString() {
        return "DuckCall";
    }
}
