package com.practice.visitor;

public class AnchorNode extends HTMLNode {

	@Override
	public void execute(Operation operation) {
		operation.apply(this);
	}

}
