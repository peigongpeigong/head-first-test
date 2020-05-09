package com.peigong.chapter8_templatemethod.classic_example;

/**
 * @author: lilei
 * @create: 2020-05-09 11:09
 **/
public class BeverageTestDrive {

    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("Making tea");
        tea.prepareRecipe();

        System.out.println("Making coffee");
        coffee.prepareRecipe();
    }

}
