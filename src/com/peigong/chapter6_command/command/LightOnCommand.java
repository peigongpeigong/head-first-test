package com.peigong.chapter6_command.command;

import com.peigong.chapter6_command.Light;

/**
 * @author: lilei
 * @create: 2020-05-07 13:20
 **/
public class LightOnCommand implements Command{

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
