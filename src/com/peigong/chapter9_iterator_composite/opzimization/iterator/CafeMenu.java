package com.peigong.chapter9_iterator_composite.opzimization.iterator;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * @author: lilei
 * @create: 2020-05-11 10:56
 **/
public class CafeMenu implements Menu{

    private Hashtable hashtable;

    public CafeMenu() {
        hashtable = new Hashtable();

        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun,lettuce, tomato, and fries", true, 3.99);
        addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);
        addItem("Burrito","A large burrito, with whole pinto beans, salsa,guacamole",true,4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        hashtable.put(menuItem.getName(),menuItem);
    }

    @Override
    public Iterator createIterator() {
        return hashtable.values().iterator();
    }
}
