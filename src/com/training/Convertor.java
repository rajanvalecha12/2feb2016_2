package com.training;

public class Convertor {

	public double farenToCelsius(Double faren) throws NullPointerException
	{
		double cel=0;
	
		cel = (5.0/9.0)*(faren-32.0);
		
		return cel;
	}
	
}
