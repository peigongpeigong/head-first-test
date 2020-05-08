package com.peigong.chapter7_adapter_facade.facade;

/**
 * 调音器
 * @author: lilei
 * @create: 2020-05-08 11:30
 **/
public class Tuner {

    private Amplifier amplifier;

    public Amplifier getAmplifier() {
        return amplifier;
    }

    public void setAmplifier(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on(){
        System.out.println("Tuner On");
    }

    public void off(){
        System.out.println("Tuner Off");
    }

    public void setAm(){

    }

    public void setFm(){

    }

    public void setFrequency(){

    }

}
