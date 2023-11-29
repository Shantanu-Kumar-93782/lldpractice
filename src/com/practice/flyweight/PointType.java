package com.practice.flyweight;

/* *
 * 
 * */
public enum PointType {

	RESTAURANT("RESTAURANT", "RESTAURANT".getBytes()),
	PETROL_PUMP("PETROL PUMP", "PETROL PUMP".getBytes()),
	HOSPITAL("HOSPITAL", "HOSPITAL".getBytes()), 
	HOTEL("HOTEL", "HOTEL".getBytes());

	private String type;
	private byte[] icon;

	private PointType(String type, byte[] icon) {
		this.icon = icon;
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public byte[] getIcon() {
		return icon;
	}
	
}
