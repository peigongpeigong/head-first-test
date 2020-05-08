package com.peigong.chapter5_singletonpettern.opzimization;

/**
 * @author: lilei
 * @create: 2020-05-06 11:18
 **/
public class Singleton {

    private static Singleton instance;

    private Singleton(){

    }

    /**
     * 这种方式可以确保多线程环境下的单例对象正确创建，但是会有性能问题
     * 实际上只有在实例为null需要创建的时候才需要同步，如果单例在程序中频繁被访问，则不适用这种方式
     * @return
     */
    public static synchronized Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
