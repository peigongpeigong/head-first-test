package com.peigong.chapter7_adapter_facade.facade;

/**
 * 扬声器
 * @author: lilei
 * @create: 2020-05-08 11:39
 **/
public class Amplifier {

    private DvdPlayer dvdPlayer;

    private CdPlayer cdPlayer;

    private Tuner tuner;

    public void on(){
        System.out.println("Amplifier On");
    }

    public void off(){
        System.out.println("Amplifier Off");
    }

    public void setCd(){
        System.out.println("Amplifier set CD");
    }

    public void setDvd(){
        System.out.println("Amplifier set DVD");
    }

    public void setStereoSound(){
        System.out.println("Amplifier set StereoSound");
    }

    public void setSurroundSound(){
        System.out.println("Amplifier set SurroundSound");
    }

    public void setTuner(){
        System.out.println("Amplifier set Tuner");
    }

    public void setVolume(int volume){
        System.out.println("Amplifier set Volume " + volume);
    }

    public DvdPlayer getDvdPlayer() {
        return dvdPlayer;
    }

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public CdPlayer getCdPlayer() {
        return cdPlayer;
    }

    public void setCdPlayer(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    public Tuner getTuner() {
        return tuner;
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }
}
