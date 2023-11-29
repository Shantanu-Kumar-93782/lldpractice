package com.practice.factorymethod;

public class Controller {

	String engineName;
	
	public Controller() {
		createEngine();
	}
	
	public void render() {
		System.out.println("Rendering iamge using engine "+engineName);
	}
	
	public void createEngine() {
		engineName = "default-engine";
		
	}
}
