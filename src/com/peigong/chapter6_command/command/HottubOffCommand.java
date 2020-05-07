package com.peigong.chapter6_command.command;

import com.peigong.chapter6_command.Hottub;

/**
 * @author: lilei
 * @create: 2020-05-07 14:23
 **/
public class HottubOnCommand implements Command {

    private Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.on();
    }

    @Override
    public void undo() {
        hottub.off();
    }
}
