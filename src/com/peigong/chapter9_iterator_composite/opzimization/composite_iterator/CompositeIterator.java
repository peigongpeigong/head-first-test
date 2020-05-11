package com.peigong.chapter9_iterator_composite.opzimization.composite_iterator;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author: lilei
 * @create: 2020-05-11 13:15
 **/
public class CompositeIterator implements Iterator {

    Stack stack;

    public CompositeIterator(Iterator iterator) {
        stack = new Stack();
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        }
        Iterator iterator = (Iterator) stack.peek();
        if (!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        }
        return true;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        }
        return null;
    }
}
