package com.practice.factorymethod;

public class SharpController extends Controller {

	public SharpController() {
		this.createEngine();
	}
	
	/**
	 * Overriding the existing strategy while creating objects for the class
	 * 
	 * Deferring the creation of object to subclasses
	 * 
	 * Overriding existing templates
	 * */
	@Override
	public void createEngine() {
		this.engineName = "sharp-engine";
	}

}
