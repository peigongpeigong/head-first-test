package com.peigong.chapter7_adapter_facade.facade;

/**
 * 投影仪
 * @author: lilei
 * @create: 2020-05-08 11:35
 **/
public class Projector {

    private DvdPlayer dvdPlayer;

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public DvdPlayer getDvdPlayer() {
        return dvdPlayer;
    }

    public void on(){
        System.out.println("Projector On");
    }

    public void off(){
        System.out.println("Projector Off");
    }

    public void tvMode(){
        System.out.println("Projector TvMode");
    }

    public void wideScreenMode(){
        System.out.println("Projector WideScreenMode");
    }

}
