package com.peigong.chapter11_proxy.protectproxy;

import java.lang.reflect.Proxy;

/**
 * @author: lilei
 * @create: 2020-05-14 11:48
 **/
public class MatchMakingTestDrive {

    public static void main(String[] args) {
        PersonBean joe = new PersonBeanImpl("Joe", "male", "play");
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is : " + ownerProxy.getName());
        ownerProxy.setInterests("eat");
        System.out.println("Interests set from owner proxy");

        try {
            ownerProxy.setHotOrNotRating(111);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("gogogo");
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(10);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    public static PersonBean getOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass().getInterfaces(), new OwnerInvocationHandler(personBean));
    }

    public static PersonBean getNonOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass().getInterfaces(), new NonOwnerInvocationHandler(personBean));
    }

}
