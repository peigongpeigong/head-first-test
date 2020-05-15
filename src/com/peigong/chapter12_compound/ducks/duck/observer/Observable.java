package com.peigong.chapter12_compound.ducks.duck.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lilei
 * @create: 2020-05-14 14:53
 **/
public class Observable implements QuackObservable {

    private List<Observer> observers = new ArrayList<>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(duck);
        }
    }
}
