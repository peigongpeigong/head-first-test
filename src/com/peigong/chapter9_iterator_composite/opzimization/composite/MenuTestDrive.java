package com.peigong.chapter9_iterator_composite.opzimization.composite;

/**
 * @author: lilei
 * @create: 2020-05-11 13:00
 **/
public class MenuTestDrive {

    public static void main(String[] args) {
        MenuComponent pancakeMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dessertMenu);

        dinerMenu.add(new MenuItem("Pasta","Spaghetti with Marinara Sauce, and a slice of sourdough bread",true,3.89));
        dinerMenu.add(new MenuItem("dinner 2","xxxxxxxxxxxxxx",true,4.99));

        pancakeMenu.add(new MenuItem("Pancake1","1111111111",true,2.99));
        pancakeMenu.add(new MenuItem("Pancake2","222222222",false,3.99));

        cafeMenu.add(new MenuItem("Cafe1","ccccccccc",true,3.99));
        cafeMenu.add(new MenuItem("Cafe2","c2c2c2c2c2c2",false,4.99));

        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with flakey crust, topped with vanilla ice crean", true, 4.99));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }

}
