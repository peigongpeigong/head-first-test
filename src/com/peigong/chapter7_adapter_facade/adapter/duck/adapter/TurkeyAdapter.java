package com.peigong.chapter7_adapter_facade.adapter.duck.adapter;

import com.peigong.chapter7_adapter_facade.adapter.duck.Duck;
import com.peigong.chapter7_adapter_facade.adapter.duck.Turkey;

/**
 * @author: lilei
 * @create: 2020-05-08 10:59
 **/
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
