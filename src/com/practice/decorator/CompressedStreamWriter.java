package com.practice.decorator;

public class CompressedStreamWriter extends CloudStreamWriter {

	CloudStreamWriter cloudStreamWriter;

	public CloudStreamWriter getCloudStreamWriter() {
		return cloudStreamWriter;
	}

	public void setCloudStreamWriter(CloudStreamWriter cloudStreamWriter) {
		this.cloudStreamWriter = cloudStreamWriter;
	}

	public CompressedStreamWriter(CloudStreamWriter cloudStreamWriter) {
		this.cloudStreamWriter = cloudStreamWriter;
	}

	@Override
	public void write(String dataToWrite) {
		System.out.println("performing compression on "+dataToWrite);
		cloudStreamWriter.write(dataToWrite);
	}

}
