package com.practice.bridge.feature;

import com.practice.bridge.implementation.Device;

public class AdvanceRemoteControl extends RemoteControl{

	public AdvanceRemoteControl(Device device) {
		super(device);
		// TODO Auto-generated constructor stub
	}
	
	public void changeChannel() {
		device.changeChannel();
	}

}
