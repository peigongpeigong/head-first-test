package com.peigong.chapter6_command.command;

import com.peigong.chapter6_command.TV;

/**
 * @author: lilei
 * @create: 2020-05-07 14:22
 **/
public class TVOnCommand implements Command {

    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
