package com.practice.visitor;

public class HighlightOperation extends Operation {

	@Override
	protected void apply(AnchorNode anchorNode) {
		System.out.println("Highlighting anchor node");

	}

	@Override
	protected void apply(HeadingNode headingNode) {
		System.out.println("Highlighting heading node");

	}

}
