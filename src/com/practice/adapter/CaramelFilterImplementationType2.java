package com.practice.adapter;

//Here also we have wrapped and converted 3rd party filter 
//into our filter type using inheritance
public class CaramelFilterImplementationType2 extends CaramelFilter implements Filter{

	@Override
	public void apply(String image) {
		render(image);
		
	}

}
