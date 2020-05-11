package com.peigong.chapter9_iterator_composite.opzimization.iterator;

import java.util.Iterator;

/**
 * @author: lilei
 * @create: 2020-05-10 10:55
 **/
public class DinerMenu implements Menu{

    private static int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog", " A hot dog, with saurkraut, relish, onions, topped with cheese",false,3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("MENU IS FULL");
        }else{
            menuItems[numberOfItems++] = menuItem;
        }
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
