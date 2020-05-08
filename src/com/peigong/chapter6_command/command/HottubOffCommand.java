package com.peigong.chapter6_command.command;

import com.peigong.chapter6_command.Hottub;

/**
 * @author: lilei
 * @create: 2020-05-07 14:23
 **/
public class HottubOffCommand implements Command {

    private Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.off();
    }

    @Override
    public void undo() {
        hottub.on();
    }
}
