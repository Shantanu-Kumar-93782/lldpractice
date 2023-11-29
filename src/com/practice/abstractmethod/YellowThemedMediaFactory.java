package com.practice.abstractmethod;

public class YellowThemedMediaFactory extends MediaFactory{

	@Override
	public void createButton() {
		System.out.println("Creating button in yellow color");
		
	}

	@Override
	public void createLabelField() {
		System.out.println("Creating label in yellow color");
		
	}

}
