package com.practice.singleton;

public class DriveClass {

	public static void main(String[] args) {
		//ConfigManager configManager = new ConfigManager(); //it will throw compile error and now we can't make any new objects for singleton class
		ConfigManager configManager2 = ConfigManager.getInstance();
	}

}
