package com.peigong.chapter7_adapter_facade.facade;

/**
 * @author: lilei
 * @create: 2020-05-08 11:32
 **/
public class DvdPlayer {

    private Amplifier amplifier;

    public Amplifier getAmplifier() {
        return amplifier;
    }

    public void setAmplifier(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on(){
        System.out.println("DvdPlayer On");
    }

    public void off(){
        System.out.println("DvdPlayer Off");
    }

    /**
     * 弹出
     */
    public void eject(){
        System.out.println("DvdPlayer Eject");
    }

    public void pause(){
        System.out.println("DvdPlayer Pause");
    }

    public void play(){
        System.out.println("DvdPlayer Play");
    }

    public void play(String movie) {
        System.out.println("DvdPlayer playing " + movie);
    }

    public void setSurroundAudio(){
        System.out.println("DvdPlayer set SurroundAudio");
    }

    public void setTwoChannelAudio(){
        System.out.println("DvdPlayer set TwoChannelAudio");
    }

    public void stop(){
        System.out.println("DvdPlayer Stop");
    }

}
