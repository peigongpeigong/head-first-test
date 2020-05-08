package com.peigong.chapter6_command;

import com.peigong.chapter6_command.command.LightOffCommand;
import com.peigong.chapter6_command.command.LightOnCommand;

/**
 * @author: lilei
 * @create: 2020-05-07 14:06
 **/
public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        Light livingRoomLight = new Light();
        LightOnCommand livingRoomOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomOffCommand = new LightOffCommand(livingRoomLight);

        remoteControl.setCommands(0, livingRoomOnCommand, livingRoomOffCommand);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        System.out.println(remoteControl);
        remoteControl.undoCommandWasPressed();
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(0);
        System.out.println(remoteControl);
        remoteControl.undoCommandWasPressed();
    }

}
