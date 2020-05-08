package com.peigong.chapter6_command;

/**
 * @author: lilei
 * @create: 2020-05-07 14:21
 **/
public class Hottub {

    private String location;

    public Hottub() {
        location = "";
    }

    public Hottub(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location + " Hottub On");
    }

    public void off(){
        System.out.println(location + " Hottub Off");
    }
}
