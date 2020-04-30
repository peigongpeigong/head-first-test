package com.peigong.chapter1.step2;

/**
 * @author: lilei
 * @create: 2020-04-30 12:11
 **/
public class Enter2 {

    public static void main(String[] args) {
        Duck duck = new ModelDuck();
        duck.performFly();
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();
    }

}
