package com.peigong.chapter6_command.command;

import com.peigong.chapter6_command.Stereo;

/**
 * @author: lilei
 * @create: 2020-05-07 13:41
 **/
public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
