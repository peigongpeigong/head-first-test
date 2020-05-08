package com.peigong.chapter6_command;

/**
 * @author: lilei
 * @create: 2020-05-07 13:20
 **/
public class Light {

    private String name;

    public Light() {
        name = "";
    }

    public Light(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println(name + " Light on");
    }

    public void off(){
        System.out.println(name + " Light off");
    }

}
