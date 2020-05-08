package com.peigong.chapter7_adapter_facade.adapter.duck;

import com.peigong.chapter7_adapter_facade.adapter.duck.adapter.TurkeyAdapter;

/**
 * @author: lilei
 * @create: 2020-05-08 11:00
 **/
public class DuckRunner {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        System.out.println("turkey");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("Duck");
        testDuck(duck);

        System.out.println("turkey adapter");
        testDuck(turkeyAdapter);
    }

    public static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }

}
