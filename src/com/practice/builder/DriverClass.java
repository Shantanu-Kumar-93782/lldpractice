package com.practice.builder;

public class DriverClass {

	public static void main(String[] args) {
		UriBuilder uriBuilder = new UriBuilderImpl();
		uriBuilder.applyurl("some url");
		
		Uri uri = uriBuilder.build();

		/**
		 * Object creation is separated from representation
		 * what properties object will hold is totally different concern while creating object
		 * */
	}

}
