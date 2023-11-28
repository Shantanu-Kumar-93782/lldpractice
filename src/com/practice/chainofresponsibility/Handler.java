package com.practice.chainofresponsibility;

public abstract class Handler {

	private Handler handler;

	public Handler(Handler handler) {
		this.handler = handler;
	}

	public String handle(String request) {
		if (doHandle(request)) {
			if(handler!=null)
				return handler.handle(request);
			else
				return "Completed";
		} else {
			return "Request Failed";
		}

	}

	protected abstract boolean doHandle(String request);

}
