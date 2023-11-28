package com.practice.visitor;

public class HeadingNode extends HTMLNode{

	@Override
	public void execute(Operation operation) {
		operation.apply(this);
		
	}

}
