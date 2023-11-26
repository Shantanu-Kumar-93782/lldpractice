package com.practice.mediator;

public class ControllerType2 extends Control {

	Mediator mediator;

	public ControllerType2(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void notify(Control control) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changed() {
		mediator.changed(this);
		
	}

}
