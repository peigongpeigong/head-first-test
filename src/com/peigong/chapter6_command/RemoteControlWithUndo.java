package com.peigong.chapter6_command;

import com.peigong.chapter6_command.command.Command;
import com.peigong.chapter6_command.command.NoCommand;

/**
 * @author: lilei
 * @create: 2020-05-07 13:35
 **/
public class RemoteControlWithUndo {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommands(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoCommandWasPressed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------ Remote Control ------");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot" + i + "] " + onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName() + "\n");
        }
        stringBuffer.append("undoCommand:" + undoCommand.getClass().getName());
        return stringBuffer.toString();
    }
}
