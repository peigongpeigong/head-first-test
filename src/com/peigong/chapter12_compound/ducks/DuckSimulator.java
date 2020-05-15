package com.peigong.chapter12_compound.ducks;

import com.peigong.chapter12_compound.ducks.duck.*;
import com.peigong.chapter12_compound.ducks.duck.counter.QuackCounter;
import com.peigong.chapter12_compound.ducks.duck.observer.Quackologist;
import com.peigong.chapter12_compound.ducks.factory.AbstractDuckFactory;
import com.peigong.chapter12_compound.ducks.factory.CountingDuckFactory;
import com.peigong.chapter12_compound.ducks.goose.Goose;
import com.peigong.chapter12_compound.ducks.goose.GooseAdapter;

/**
 * @author: lilei
 * @create: 2020-05-14 14:09
 **/
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        //simulator.simulate_3();
        AbstractDuckFactory factory = new CountingDuckFactory();
        simulator.simulate_6(factory);
    }

    void simulate_1(){
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
    }

    /**
     * 加入适配器模式
     */
    void simulate_2(){
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        GooseAdapter gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
    }

    /**
     * 再加入装饰者
     */
    void simulate_3(){
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        GooseAdapter gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    /**
     * 再加入抽象工厂
     */
    void simulate_4(AbstractDuckFactory factory){
        Quackable mallardDuck = factory.createMallardDuck();
        Quackable redheadDuck = factory.createRedheadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable gooseDuck = factory.createGooseDuck();
        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    /**
     * 再加入组合和迭代器
     */
    void simulate_5(AbstractDuckFactory factory){
        Quackable redheadDuck = factory.createRedheadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable gooseDuck = factory.createGooseDuck();
        System.out.println("\nDuck Simulator：With Composite - Flocks");

        Flock flock = new Flock();
        flock.add(redheadDuck);
        flock.add(duckCall);
        flock.add(rubberDuck);
        flock.add(gooseDuck);

        Quackable mallard1 = factory.createMallardDuck();
        Quackable mallard2 = factory.createMallardDuck();
        Quackable mallard3 = factory.createMallardDuck();
        Quackable mallard4 = factory.createMallardDuck();

        Flock mallardFlock = new Flock();
        mallardFlock.add(mallard1);
        mallardFlock.add(mallard2);
        mallardFlock.add(mallard3);
        mallardFlock.add(mallard4);

        flock.add(mallardFlock);

        System.out.println("\nDuck Simulator : Whole Flock simulation");
        simulate(flock);

        System.out.println("\nDuck Simulator : Mallard FLock Simulation");
        simulate(mallardFlock);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    /**
     * 再加入观察者
     */
    void simulate_6(AbstractDuckFactory factory){
        Quackable redheadDuck = factory.createRedheadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable gooseDuck = factory.createGooseDuck();

        Flock flock = new Flock();
        flock.add(redheadDuck);
        flock.add(duckCall);
        flock.add(rubberDuck);
        flock.add(gooseDuck);

        Quackologist quackologist = new Quackologist();
        flock.registerObserver(quackologist);
        System.out.println("\nDuck Simulator：With Observer");
        simulate(flock);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }



    void simulate(Quackable quackable) {
        quackable.quack();
    }

}
