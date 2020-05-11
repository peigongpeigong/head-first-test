package com.peigong.chapter9_iterator_composite.opzimization.composite_iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author: lilei
 * @create: 2020-05-11 11:28
 **/
public class Menu extends MenuComponent {

    private String name;
    private String description;
    private ArrayList<MenuComponent> menuComponents;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
        menuComponents = new ArrayList<>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println("," + getDescription());
        System.out.println("---------------");

        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent next = iterator.next();
            next.print();
        }
    }

    public Iterator createIterator(){
        return new CompositeIterator(menuComponents.iterator());
    }
}
