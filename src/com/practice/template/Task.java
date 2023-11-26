package com.practice.template;

public abstract class Task {
	
	
	//Main function to be executed
	public void execute() {
		System.out.println("Logging or auditing"); 
		doExecute();
	}

	protected abstract void doExecute();

}
