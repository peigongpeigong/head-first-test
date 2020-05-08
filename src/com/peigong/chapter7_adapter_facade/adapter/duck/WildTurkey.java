package com.peigong.chapter7_adapter_facade.adapter.duck;

/**
 * @author: lilei
 * @create: 2020-05-08 10:58
 **/
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble");
    }

    @Override
    public void fly() {
        System.out.println("flying a short distance");
    }
}
