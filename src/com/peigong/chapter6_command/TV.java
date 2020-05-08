package com.peigong.chapter6_command;

/**
 * @author: lilei
 * @create: 2020-05-07 14:20
 **/
public class TV {

    private String location;

    public TV() {
        location = "";
    }

    public TV(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location + " TV on");
    }

    public void off(){
        System.out.println(location + " TV off");
    }
}
