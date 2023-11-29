package com.practice.flyweight;


/**
 * Here point type is flyweight
 * 
 * that is static for a type.
 * 
 * Icon or "type name" would be static to denote it on a google map
 * 
 * So instead of creating new object everytime, we will create it once
 * 
 * In course he used hash map to store icons, but we used power oc enums
 * **/
public class PointIcon {

	int xAxis;
	
	int yAxis;
	
	PointType pointType;
}
