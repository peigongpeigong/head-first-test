package com.peigong.chapter5_singletonpettern.opzimization;

/**
 * @author: lilei
 * @create: 2020-05-06 11:24
 **/
public class Singleton2 {

    private static Singleton2 instance = new Singleton2();

    private Singleton2(){

    }

    /**
     * 如果确定一定会使用到这个单例，则可以用这种方式，因为在JVM加载的时候，该实例就会创建
     * @return
     */
    public static Singleton2 getInstance() {
        return instance;
    }

}
