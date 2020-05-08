package com.peigong.chapter6_command.command;

import com.peigong.chapter6_command.GarageDoor;

/**
 * @author: lilei
 * @create: 2020-05-07 13:53
 **/
public class GarageDoorUpCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
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
