package com.peigong.chapter12_compound.ducks.goose;

import com.peigong.chapter12_compound.ducks.Quackable;
import com.peigong.chapter12_compound.ducks.duck.observer.Observable;
import com.peigong.chapter12_compound.ducks.duck.observer.Observer;
import com.peigong.chapter12_compound.ducks.duck.observer.QuackObservable;

/**
 * @author: lilei
 * @create: 2020-05-14 14:13
 **/
public class GooseAdapter implements Quackable {

    Observable observable;
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
        observable.notifyObservers();
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
        return "Goose pretending to be a Duck";
    }
}
