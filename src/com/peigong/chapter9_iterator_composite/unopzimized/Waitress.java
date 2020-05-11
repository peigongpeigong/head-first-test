package com.peigong.chapter9_iterator_composite.unopzimized;

import java.util.ArrayList;

/**
 * @author: lilei
 * @create: 2020-05-10 11:01
 **/
public class Waitress {

    public void printMenu(){
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] lunchItems = dinerMenu.getMenuItems();

        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = breakfastItems.get(i);
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }

        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem lunchItem = lunchItems[i];
            System.out.print(lunchItem.getName() + " ");
            System.out.println(lunchItem.getPrice() + " ");
            System.out.println(lunchItem.getDescription());
        }
    }

}
