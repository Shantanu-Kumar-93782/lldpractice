package com.practice.abstractmethod;

public class BlueThemedMediaFactory extends MediaFactory{

	@Override
	public void createButton() {
		System.out.println("Creating button in blue color");
		
	}

	@Override
	public void createLabelField() {
		System.out.println("Creating label in blue color");
		
	}

}
