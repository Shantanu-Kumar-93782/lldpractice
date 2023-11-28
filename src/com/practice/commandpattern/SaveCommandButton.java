package com.practice.commandpattern;

public class SaveCommandButton extends Command{

	CustomerSaveServiceImpl service = new CustomerSaveServiceImpl();
	
	@Override
	public void execute() {
		service.save();
	}

}
