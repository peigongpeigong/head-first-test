package com.peigong.chapter9_iterator_composite.opzimization.iterator;

/**
 * @author: lilei
 * @create: 2020-05-10 11:21
 **/
public class MenuTestDrive {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu,cafeMenu);
        waitress.printMenu();
    }

}
