package com.practice.proxy;

public class RealEBook {

	private String ebookName;

	public String getEbookName() {
		return ebookName;
	}

	public void setEbookName(String ebookName) {
		this.ebookName = ebookName;
	}

	public RealEBook(String ebookName) {
		super();
		this.ebookName = ebookName;
	}

	public void show() {
		System.out.println("Showing ebook " + ebookName);
	}
}
