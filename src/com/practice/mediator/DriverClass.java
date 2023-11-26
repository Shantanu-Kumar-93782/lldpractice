package com.practice.mediator;

public class DriverClass {

	public static void main(String[] args) {
		Mediator mediator= new MeditorKiImplementation();
		Control type1 = new ControllerType1(mediator);
		Control type2 = new ControllerType2(mediator);
		
		type1.changed();


	}

}
