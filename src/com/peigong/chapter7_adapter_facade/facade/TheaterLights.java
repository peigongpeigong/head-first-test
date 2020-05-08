package com.peigong.chapter7_adapter_facade.facade;

/**
 * 氛围灯
 * @author: lilei
 * @create: 2020-05-08 11:38
 **/
public class TheaterLights {

    public void on(){
        System.out.println("TheaterLights On");
    }

    public void off(){
        System.out.println("TheaterLights Off");
    }

    /**
     * 调暗
     */
    public void dim(int dim){
        System.out.println("TheaterLights set Dim " + dim);
    }

}
