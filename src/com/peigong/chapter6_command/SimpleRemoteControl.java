package com.peigong.chapter6_command;

import com.peigong.chapter6_command.command.Command;

/**
 * @author: lilei
 * @create: 2020-05-07 13:22
 **/
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl(){

    }

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }

}
