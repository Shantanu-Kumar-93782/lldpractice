package com.practice.state;

public class DriverClass {

	public static void main(String[] args) {
		Sheet nayiSheet  = new Sheet();
		//2 states
		Handler handlerBlack = new HandlerType2();
		Handler handlerBlue = new HandlerType1();
		
		//state changed
		nayiSheet.setHandler(handlerBlue);
		
		nayiSheet.draw();
		nayiSheet.draw();
		
		//state changed
		nayiSheet.setHandler(handlerBlack);
		
		nayiSheet.draw();
		nayiSheet.draw();
	}

}
