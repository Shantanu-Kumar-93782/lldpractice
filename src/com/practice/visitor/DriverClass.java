package com.practice.visitor;

public class DriverClass {

	public static void main(String[] args) {
		HtmlPage newHtmlPage = new HtmlPage();
		
		newHtmlPage.addTag(new HeadingNode());
		newHtmlPage.addTag(new AnchorNode());
		
		newHtmlPage.performOperation(new HighlightOperation());

	}

}
