package com.peigong.chapter6_command.command;

import com.peigong.chapter6_command.GarageDoor;

/**
 * @author: lilei
 * @create: 2020-05-07 13:59
 **/
public class GarageDoorDownCommand implements Command{

    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
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
