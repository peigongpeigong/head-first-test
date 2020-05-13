package com.peigong.chapter10_state.opzimization.state;

import com.peigong.chapter10_state.opzimization.GumballMachine;

/**
 * @author: lilei
 * @create: 2020-05-13 11:52
 **/
public class WinnerState implements State {

    private GumballMachine machine;

    public WinnerState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball");
    }

    @Override
    public void dispense() {
        System.out.println("YOUR'RE A WINNER! You get two gumballs for your quarter");
        machine.releaseBall();
        if (machine.getCount() <= 0) {
            machine.setState(machine.getSoldOutState());
        }else{
            machine.releaseBall();
            if (machine.getCount() > 0) {
                machine.setState(machine.getNoQuarterState());
            }else{
                machine.setState(machine.getSoldOutState());
            }
        }
    }

    public String toString(){
        return "WINNER";
    }
}
