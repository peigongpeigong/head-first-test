package com.peigong.chapter9_iterator_composite.opzimization.iterator;

import java.util.Iterator;

public interface Menu {

    void addItem(String name, String description, boolean vegetarian, double price);

    Iterator createIterator();

}
