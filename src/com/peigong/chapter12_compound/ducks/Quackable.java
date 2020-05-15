package com.peigong.chapter12_compound.ducks;

import com.peigong.chapter12_compound.ducks.duck.observer.QuackObservable;

public interface Quackable extends QuackObservable {

    void quack();

}
