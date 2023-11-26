package com.practice.mediator;

public abstract class Control {

	public abstract void notify(Control control);
	
	public abstract void changed();
}
