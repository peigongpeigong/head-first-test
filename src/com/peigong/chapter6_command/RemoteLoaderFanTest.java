package com.peigong.chapter6_command;

import com.peigong.chapter6_command.command.CeilingFanHighCommand;
import com.peigong.chapter6_command.command.CeilingFanMediumCommand;
import com.peigong.chapter6_command.command.CeilingFanOffCommand;

/**
 * @author: lilei
 * @create: 2020-05-07 14:14
 **/
public class RemoteLoaderFanTest {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommands(0, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommands(1, ceilingFanHighCommand, ceilingFanOffCommand);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        System.out.println(remoteControl);
        remoteControl.undoCommandWasPressed();

        remoteControl.onButtonWasPressed(1);
        System.out.println(remoteControl);
        remoteControl.undoCommandWasPressed();
    }

}
