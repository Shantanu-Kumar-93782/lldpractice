package com.practice.prototype;

public class DriverClass {

	/*
	 * Delegating cloning work to the actual class
	 * */
	public static void main(String[] args) {
		Component component = new Button("Submit");
		component.render();
		
		Component secondSubmitButton = component.clone();
		secondSubmitButton.render();

	}

}
