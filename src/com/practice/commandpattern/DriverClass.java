package com.practice.commandpattern;

public class DriverClass {

	public static void main(String[] args) {
		
		//Framework developer  provided materialized button
		Button saveButton = new Button();
		
		
		//Gave option to supply command as he doesn't know what
		//will be the use of this button (whoever is going to use it)
		saveButton.setCommand(new SaveCommandButton());
		
		saveButton.onClick();

	}

}
