package com.peigong.chapter2_observermode.observermode.optimization;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
