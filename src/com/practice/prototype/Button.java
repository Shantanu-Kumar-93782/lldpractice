package com.practice.prototype;

public class Button extends Component {

	String buttonText;

	public Button(String buttonText) {
		super();
		this.buttonText = buttonText;
	}

	public String getButtonText() {
		return buttonText;
	}

	public void setButtonText(String buttonText) {
		this.buttonText = buttonText;
	}

	@Override
	public void render() {
		System.out.println("Button "+buttonText +" rendered");

	}

	@Override
	public Component clone() {
		return new Button(buttonText);
	}

}
