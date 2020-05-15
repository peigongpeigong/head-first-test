package com.peigong.chapter12_compound.ducks.factory;

import com.peigong.chapter12_compound.ducks.Quackable;
import com.peigong.chapter12_compound.ducks.duck.DuckCall;
import com.peigong.chapter12_compound.ducks.duck.MallardDuck;
import com.peigong.chapter12_compound.ducks.duck.RedheadDuck;
import com.peigong.chapter12_compound.ducks.duck.RubberDuck;
import com.peigong.chapter12_compound.ducks.goose.Goose;
import com.peigong.chapter12_compound.ducks.goose.GooseAdapter;

/**
 * @author: lilei
 * @create: 2020-05-14 14:21
 **/
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    public Quackable createGooseDuck() {
        return new GooseAdapter(new Goose());
    }
}
