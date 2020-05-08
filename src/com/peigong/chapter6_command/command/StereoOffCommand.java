package com.peigong.chapter6_command.command;

import com.peigong.chapter6_command.Stereo;

/**
 * @author: lilei
 * @create: 2020-05-07 13:51
 **/
public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
