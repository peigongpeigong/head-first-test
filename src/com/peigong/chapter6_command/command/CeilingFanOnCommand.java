package com.peigong.chapter6_command.command;

import com.peigong.chapter6_command.CeilingFan;

/**
 * @author: lilei
 * @create: 2020-05-07 13:57
 **/
public class CeilingFanOnCommand implements Command {

    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
