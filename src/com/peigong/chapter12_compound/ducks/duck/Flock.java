package com.peigong.chapter12_compound.ducks.duck;

import com.peigong.chapter12_compound.ducks.Quackable;
import com.peigong.chapter12_compound.ducks.duck.observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 组合模式和迭代器模式
 * @author: lilei
 * @create: 2020-05-14 14:30
 **/
public class Flock implements Quackable {

    private ArrayList<Quackable> quackers;

    public Flock() {
        quackers = new ArrayList<>();
    }

    public void add(Quackable quackable) {
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable next = iterator.next();
            next.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable quacker : quackers) {
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }
}
