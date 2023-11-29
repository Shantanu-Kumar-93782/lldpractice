package com.practice.fascade;

public class Connection {

	public String connect(String target) {
		System.out.println("Connecting");
		return "authtoken";
		
	}
	
	public void disconnect(String target) {
		System.out.println("Disconnecting");
	}
}
