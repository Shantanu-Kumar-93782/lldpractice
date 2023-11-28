package com.practice.mediator;

public class MeditorKiImplementation extends Mediator{

	private Control control1 = new ControllerType1(this);
	
	private Control control2 = new ControllerType2(this);
	
	
	
	public Control getControl1() {
		return control1;
	}



	public void setControl1(Control control1) {
		this.control1 = control1;
	}



	public Control getControl2() {
		return control2;
	}



	public void setControl2(Control control2) {
		this.control2 = control2;
	}



	@Override
	public void changed(Control control) {
		// This part can contain your logic to handle changes
		if(control1 == control) {
			control2.notify(control2);
		} else if (control2 == control) {
			control1.notify(control2);
		}
	}

}
