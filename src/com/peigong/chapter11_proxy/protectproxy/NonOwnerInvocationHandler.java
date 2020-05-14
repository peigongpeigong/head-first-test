package com.peigong.chapter11_proxy.protectproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: lilei
 * @create: 2020-05-14 11:46
 **/
public class NonOwnerInvocationHandler implements InvocationHandler {

    private PersonBean personBean;

    public NonOwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("setHotOrNotRating") || method.getName().startsWith("get")) {
            return method.invoke(personBean, args);
        } else {
            throw new IllegalAccessException();
        }
    }
}
