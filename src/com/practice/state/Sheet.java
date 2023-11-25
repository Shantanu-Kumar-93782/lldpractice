package com.practice.state;


//Meri paint ki sheet
public class Sheet {
	
	private Handler handler;
	
	
	
	public Handler getHandler() {
		return handler;
	}



	public void setHandler(Handler handler) {
		this.handler = handler;
	}



	public void draw() {
		this.handler.handle();
	}

}
