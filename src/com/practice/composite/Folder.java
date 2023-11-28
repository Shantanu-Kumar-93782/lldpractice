package com.practice.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Inode{

	private List<File> filesUnderCurrentFolder = new ArrayList<>();
	
	public void addFile(File file) {
		filesUnderCurrentFolder.add(file);
	}
	
	@Override
	public void printFileName() {
		System.out.println(this.fileName);
		for(File file: filesUnderCurrentFolder) {
			file.printFileName();
		}
	}

}
