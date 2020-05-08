package com.peigong.chapter6_command;

import com.peigong.chapter6_command.command.*;

/**
 * @author: lilei
 * @create: 2020-05-07 14:24
 **/
public class MarcoRemoteLoader {

    public static void main(String[] args) {
        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        HottubOnCommand hottubOnCommand = new HottubOnCommand(hottub);

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        HottubOffCommand hottubOffCommand = new HottubOffCommand(hottub);

        Command[] partyOn = new Command[]{lightOnCommand, stereoOnWithCDCommand, tvOnCommand, hottubOnCommand};
        Command[] partyOff = new Command[]{lightOffCommand, stereoOffCommand, tvOffCommand, hottubOffCommand};

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommands(0, new MarcoCommand(partyOn), new MarcoCommand(partyOff));


        System.out.println(remoteControl);
        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);

    }

}
