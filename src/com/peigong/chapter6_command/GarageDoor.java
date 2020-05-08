package com.peigong.chapter6_command;

/**
 * @author: lilei
 * @create: 2020-05-07 13:32
 **/
public class GarageDoor {

    private String name;

    public GarageDoor() {
        name = "";
    }

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up(){
        System.out.println("Garage Door up");
    }

    public void down(){
        System.out.println("Garage Door down");
    }

    public void stop(){
        System.out.println("Garage Door stop");
    }

    public void lightOn(){
        System.out.println("Garage Light On");
    }

    public void lightOff(){
        System.out.println("Garage Light Off");
    }

}
