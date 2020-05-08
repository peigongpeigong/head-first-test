package com.peigong.chapter6_command;

/**
 * @author: lilei
 * @create: 2020-05-07 13:39
 **/
public class Stereo {

    private String name;

    public Stereo() {
        name = "";
    }

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("Stereo On");
    }


    public void off() {
        System.out.println("Stereo Off");
    }

    public void setCd(){
        System.out.println("Stereo set CD");
    }

    public void setDvd(){
        System.out.println("Stereo set DVD");
    }

    public void setRadio(){
        System.out.println("Stereo set Radio");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo set Volume " + volume);
    }

}
