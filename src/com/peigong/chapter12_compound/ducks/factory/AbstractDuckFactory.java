package com.peigong.chapter12_compound.ducks.factory;

import com.peigong.chapter12_compound.ducks.Quackable;

/**
 * @author: lilei
 * @create: 2020-05-14 14:20
 **/
public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();

    public abstract Quackable createRedheadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();

    public abstract Quackable createGooseDuck();
}
