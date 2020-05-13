package com.peigong.chapter10_state.opzimization;

/**
 * @author: lilei
 * @create: 2020-05-13 11:58
 **/
public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(5);

        System.out.println(machine);

        machine.insertQuarter();
        machine.turnCrank();

        System.out.println(machine);

        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();

        System.out.println(machine);
    }

}
