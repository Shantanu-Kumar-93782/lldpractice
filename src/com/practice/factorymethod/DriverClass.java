package com.practice.factorymethod;

public class DriverClass {

	public static void main(String[] args) {
		Controller controller = new SharpController();
		
		controller.render();

	}

}
