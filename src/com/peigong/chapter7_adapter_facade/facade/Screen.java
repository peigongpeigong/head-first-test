package com.peigong.chapter7_adapter_facade.facade;

/**
 * @author: lilei
 * @create: 2020-05-08 11:27
 **/
public class Screen {

    public void up(){
        System.out.println("Screen up");
    }

    public void down(){
        System.out.println("Screen down");
    }

    @Override
    public String toString() {
        return "Screen{}";
    }
}
