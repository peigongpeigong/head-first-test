package com.peigong.chapter7_adapter_facade.facade;

/**
 * @author: lilei
 * @create: 2020-05-08 11:34
 **/
public class CdPlayer {

    private Amplifier amplifier;

    public Amplifier getAmplifier() {
        return amplifier;
    }

    public void setAmplifier(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on(){
        System.out.println("CdPlayer On");
    }

    public void off(){
        System.out.println("CdPlayer Off");
    }

    public void eject(){
        System.out.println("CdPlayer Eject");
    }

    public void pause(){
        System.out.println("CdPlayer Pause");
    }

    public void play(){
        System.out.println("CdPlayer Play");
    }

    public void stop(){
        System.out.println("CdPlayer Stop");
    }


}
