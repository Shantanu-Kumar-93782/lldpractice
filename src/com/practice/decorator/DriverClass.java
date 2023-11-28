package com.practice.decorator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DriverClass {

	public static void main(String[] args) throws IOException {
		// Just like here, we are creating a file writer which is a functionality
		// decorating with another functionality to write data in buffered format
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("filename"));

		CompressedStreamWriter compressedStreamWriter = new CompressedStreamWriter(
				new EncryptedCloudStreamWriter(new CloudStreamWriter()));
		
		compressedStreamWriter.write("Something");

	}

}
