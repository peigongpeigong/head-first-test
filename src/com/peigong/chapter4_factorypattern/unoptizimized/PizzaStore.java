package com.peigong.chapter4_factorypattern.unoptizimized;

import com.peigong.chapter4_factorypattern.*;

/**
 * @author: lilei
 * @create: 2020-05-04 10:24
 **/
public class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = null;

        if("cheese".equals(type)){
            pizza = new CheesePizza();
        /*} else if ("greek".equals(type)) {
            pizza = new GreekPizza();*///决定不需要GreekPizza,则需要修改orderPizza方法，注释或删掉这两行代码
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza();
        } else if ("clam".equals(type)) {//以下两种也是新增加的，同样需要修改该方法
            pizza = new ClamPizza();
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza();
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}