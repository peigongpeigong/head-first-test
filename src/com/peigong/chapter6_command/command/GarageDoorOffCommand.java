package com.peigong.chapter6_command.command;

import com.peigong.chapter6_command.GarageDoor;

/**
 * @author: lilei
 * @create: 2020-05-07 13:52
 **/
public class GarageDoorOffCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOffCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
