package com.practice.commandpattern;

public class Button {

	Command command ;
	
	public Command getCommand() {
		return command;
	}


	public void setCommand(Command command) {
		this.command = command;
	}


	public void onClick() {
		command.execute();
	}
}
