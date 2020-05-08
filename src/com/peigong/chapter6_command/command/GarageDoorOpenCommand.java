package com.peigong.chapter6_command.command;

import com.peigong.chapter6_command.GarageDoor;

/**
 * @author: lilei
 * @create: 2020-05-07 13:34
 **/
public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
