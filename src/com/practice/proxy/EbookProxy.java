package com.practice.proxy;

import java.util.HashMap;
import java.util.Map;


/* *
 * Here instead of loading all the ebooks initially
 * 
 * only loading when required. Same thing is used in our entity class
 * 
 * when we mark dependent column with lazy loading
 * 
 * **/
public class EbookProxy {

	private Map<String, RealEBook> map = new HashMap<>();

	public void show(String ebookName) {
		if (map.containsKey(ebookName)) {
			map.get(ebookName).show();
		} else {
			System.out.println("Loading Ebook " + ebookName);
			RealEBook ebook = new RealEBook(ebookName);
			map.put(ebookName, ebook);
			ebook.show();
		}
	}
}
