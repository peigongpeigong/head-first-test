package com.peigong.chapter6_command.command;

import com.peigong.chapter6_command.TV;

/**
 * @author: lilei
 * @create: 2020-05-07 14:22
 **/
public class TVOffCommand implements Command {

    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
