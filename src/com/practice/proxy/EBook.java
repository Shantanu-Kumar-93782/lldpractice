package com.practice.proxy;

public class EBook {

	EbookProxy ebookProxy = new EbookProxy();
	
	public void show(String ebookName) {
		ebookProxy.show(ebookName);
	}
}
