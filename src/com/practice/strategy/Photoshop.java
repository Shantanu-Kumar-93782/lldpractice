package com.practice.strategy;

public class Photoshop {

	private Filter filter;
	
	private Handler handler;


	public Photoshop(Filter filter, Handler handler) {
		this.filter = filter;
		this.handler = handler;
	}
	
	public void storePhoto() {
		applyFilter();
		handler();
	}

	public void applyFilter() {
		filter.applyFilter();
	}
	
	public void handler() {
		handler.handle();
	}
}
