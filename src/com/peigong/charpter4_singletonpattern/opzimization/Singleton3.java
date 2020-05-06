package com.peigong.charpter4_singletonpattern.opzimization;

/**
 * @author: lilei
 * @create: 2020-05-06 11:27
 **/
public class Singleton3 {

    private static volatile Singleton3 instance;

    private Singleton3(){

    }

    /**
     * 双重检查加锁
     * @return
     */
    public static Singleton3 getInstance(){
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

}
