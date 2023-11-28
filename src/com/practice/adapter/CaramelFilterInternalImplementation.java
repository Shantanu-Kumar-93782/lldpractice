package com.practice.adapter;

//Here we will use composition to convert caramel filter to our filter type
// so that our code can also work along with framework code
public class CaramelFilterInternalImplementation implements Filter {

	private CaramelFilter caramelFilter;
	
	public CaramelFilterInternalImplementation(CaramelFilter caramelFilter) {
		this.caramelFilter = caramelFilter;
	}

	@Override
	public void apply(String image) {
		caramelFilter.render(image);

	}

}
