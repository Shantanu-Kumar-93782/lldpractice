package com.practice.chainofresponsibility;

public class DriverClass {

	public static void main(String[] args) {
		Handler mainHander = new Handler1(new Handler2(null));
		mainHander.handle("Handle request");
	}
}
