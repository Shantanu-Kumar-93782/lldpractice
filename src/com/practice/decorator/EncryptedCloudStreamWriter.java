package com.practice.decorator;

public class EncryptedCloudStreamWriter extends CloudStreamWriter {

	private CloudStreamWriter cloudStreamWriter;

	public CloudStreamWriter getCloudStreamWriter() {
		return cloudStreamWriter;
	}

	public void setCloudStreamWriter(CloudStreamWriter cloudStreamWriter) {
		this.cloudStreamWriter = cloudStreamWriter;
	}

	public EncryptedCloudStreamWriter(CloudStreamWriter cloudStreamWriter) {
		this.cloudStreamWriter = cloudStreamWriter;
	}

	@Override
	public void write(String dataToWrite) {
		System.out.println("performing encryption " + dataToWrite);
		cloudStreamWriter.write(dataToWrite);
	}

}
