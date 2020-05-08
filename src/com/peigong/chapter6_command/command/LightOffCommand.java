package com.peigong.chapter6_command.command;

import com.peigong.chapter6_command.Light;

/**
 * @author: lilei
 * @create: 2020-05-07 13:31
 **/
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
