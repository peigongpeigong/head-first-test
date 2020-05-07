package com.peigong.charpter4_singletonpattern.unopzimized;

/**
 * @author: lilei
 * @create: 2020-05-06 11:14
 **/
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {

    }

    /**
     * 这种方式的单例在多线程环境下会有问题
     * @return
     */
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
