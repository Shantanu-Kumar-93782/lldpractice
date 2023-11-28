package com.practice.composite;

public abstract class Inode {
	
	protected String fileName;
	
	

	public String getFileName() {
		return fileName;
	}



	public void setFileName(String fileName) {
		this.fileName = fileName;
	}



	public abstract void printFileName();
}
