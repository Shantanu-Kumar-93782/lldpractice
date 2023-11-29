package com.practice.bridge.feature;

import com.practice.bridge.implementation.Device;

public class RemoteControl {

	protected Device device;
	
	
	public Device getDevice() {
		return device;
	}


	public void setDevice(Device device) {
		this.device = device;
	}


	public RemoteControl(Device device) {
		super();
		this.device = device;
	}


	public void turnOn() {
		device.turnOn();
	}
}
