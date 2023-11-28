package com.practice.chainofresponsibility;

public class Handler2 extends Handler {

	public Handler2(Handler handler) {
		super(handler);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean doHandle(String request) {
		System.out.println("Handling requests in Handler2");
		return true;
	}

}
