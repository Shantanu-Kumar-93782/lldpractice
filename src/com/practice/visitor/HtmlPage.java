package com.practice.visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlPage {

	List<HTMLNode> listOfTags = new ArrayList<>();
	
	public void addTag(HTMLNode htmlNode) {
		listOfTags.add(htmlNode);
	}
	
	public void performOperation(Operation operation) {
		for(HTMLNode node: listOfTags) {
			node.execute(operation);
		}
	}
}
