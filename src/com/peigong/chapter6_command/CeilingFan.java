package com.peigong.chapter6_command;

/**
 * @author: lilei
 * @create: 2020-05-07 13:48
 **/
public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high(){
        speed = HIGH;
        System.out.println(location + " Ceiling Fan On HIGH");
    }

    public void medium(){
        speed = MEDIUM;
        System.out.println(location + " Ceiling Fan On MEDIUM");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + " Ceiling Fan On LOW");
    }

    public void off(){
        speed = OFF;
        System.out.println(location + " Ceiling Fan OFF");
    }

    public int getSpeed(){
        return speed;
    }
}
