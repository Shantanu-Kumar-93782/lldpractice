package com.practice.chainofresponsibility;

public class Handler1 extends Handler{

	public Handler1(Handler handler) {
		super(handler);
	}

	@Override
	protected boolean doHandle(String request) {
		System.out.println("handling requests thorugh first handler");
		return true;
	}

}
