package com.peigong.chapter12_compound.ducks.duck.observer;

/**
 * @author: lilei
 * @create: 2020-05-14 14:51
 **/
public interface QuackObservable {

    void registerObserver(Observer observer);

    void notifyObservers();

}
