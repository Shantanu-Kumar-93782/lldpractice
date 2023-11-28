package com.practice.visitor;


//Here the node type are non volatile hence it doesn't change frequently
//Because of which we don't need make changes in Operation class and only 
// add new implementations for the new functionalities.
public abstract class Operation {

	protected abstract void apply(AnchorNode anchorNode);
	
	protected abstract void apply(HeadingNode headingNode);

}
