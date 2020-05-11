package com.peigong.chapter9_iterator_composite.opzimization.iterator;

import java.util.Iterator;

/**
 * @author: lilei
 * @create: 2020-05-10 11:10
 **/
public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem item = items[position];
        position++;
        return item;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if(items[position -1] != null){
            for(int i = position - 1; i < (items.length -1); i++){
                items[i] = items[i + 1];
            }
            items[items.length - 1] = null;
        }
    }
}
