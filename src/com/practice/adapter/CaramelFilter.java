package com.practice.adapter;

//Let's say this is provided as part of framework
public class CaramelFilter {

	public void init() {

	}

	public void render(String image) {
		System.out.println("Rendering in Caramel mode "+image);
	}
}
