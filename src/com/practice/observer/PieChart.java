package com.practice.observer;

public class PieChart extends Observer {

	DataSource dataSource;

	public PieChart(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void update() {
		System.out.println("nya data in pie chart is " + dataSource.getData());

	}

}
