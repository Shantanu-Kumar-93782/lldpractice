package com.practice.abstractmethod;

public class DriverClass {

	public static void main(String[] args) {
		MediaFactory blueMediaFactory = new BlueThemedMediaFactory();
		blueMediaFactory.createButton();
		blueMediaFactory.createLabelField();
		
		/*
		 * In factory method it was overriding of implemented functions 
		 * to change it for your requirement
		 * 
		 * Here Set of object sharing similar properties are implemented together
		 * Object creation is defined in abstract way and subclasses are responsible
		 * for the the object creation.
		 * */

	}

}
