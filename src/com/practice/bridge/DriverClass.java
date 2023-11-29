package com.practice.bridge;

import com.practice.bridge.feature.AdvanceRemoteControl;
import com.practice.bridge.implementation.SonyRemote;

public class DriverClass {

	public static void main(String[] args) {
		/* *
		 * For a app like universal remote you have to maintain all versions of remote control
		 * and its implementation supported by different company.
		 * 
		 * 
		 * Instead of this we will create our own hierarchy, any change in new version
		 * we will include in our hierarchy as a "not implemented" in case some company
		 * implements we will just maintain the newer implementation of that company
		 * 
		 * We are using composition for this one.
		 * 
		 * Check out the hierarchy tree in the notes, tree is expanding from one side
		 * 
		 * */
		
		//Used sony remote in universal app
		AdvanceRemoteControl remoteControl = new AdvanceRemoteControl(new SonyRemote());
		remoteControl.turnOn(); //turns on
		remoteControl.changeChannel(); //not available but supported by our hierarchy
		

	}

}
