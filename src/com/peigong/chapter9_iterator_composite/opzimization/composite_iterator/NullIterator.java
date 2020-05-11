package com.peigong.chapter9_iterator_composite.opzimization.composite_iterator;

import java.util.Iterator;

/**
 * @author: lilei
 * @create: 2020-05-11 13:26
 **/
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
    throw new UnsupportedOperationException();
    }
}
