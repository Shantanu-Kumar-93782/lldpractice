package com.practice.iterator;

import java.util.Iterator;

public class DriverClass {

	public static void main(String[] args) {
		BrowserHistory<String> browserHistory = new BrowserHistory<>();
		browserHistory.add("Something");
		browserHistory.add("anything");
		
		Iterator<String> iterator = browserHistory.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
//		for(int i=0; i<browserHistory.history.length; i++) {
//			System.out.println(browserHistory.history.get(i));
//		}
	}

}
