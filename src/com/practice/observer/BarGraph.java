package com.practice.observer;

public class BarGraph extends Observer {

	DataSource dataSource;

	public BarGraph(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void update() {
		System.out.println("nya data in bar graph is " + dataSource.getData());

	}

}
