package com.practice.observer;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
	
	String data = "something";
	
	List<Observer> observers = new ArrayList<>();

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
		notifyobservers();
	}
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		//remove ka code
	}
	
	public void notifyobservers() {
		for(Observer observer: observers) {
			observer.update();
		}
	}

}
