package com.practice.observer;

public class DriverClass {

	public static void main(String[] args) {
		DataSource dataSource = new DataSource();
		
		dataSource.addObserver(new PieChart(dataSource));
		dataSource.addObserver(new BarGraph(dataSource));

		dataSource.setData("randi");
		dataSource.setData("loda");
	}

}
