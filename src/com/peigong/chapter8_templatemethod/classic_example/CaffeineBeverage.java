package com.peigong.chapter8_templatemethod.classic_example;

/**
 * @author: lilei
 * @create: 2020-05-09 10:38
 **/
public abstract class CaffeineBeverage {

    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater(){
        System.out.println("Boiling Water");
    }

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    /**
     * 钩子方法
     * @return
     */
    public boolean customerWantsCondiments(){
        return true;
    }


}
