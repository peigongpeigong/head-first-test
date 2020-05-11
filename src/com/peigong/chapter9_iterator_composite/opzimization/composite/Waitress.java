package com.peigong.chapter9_iterator_composite.opzimization.composite;

/**
 * @author: lilei
 * @create: 2020-05-11 11:27
 **/
public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }
}
