package com.training;

public class Application {

	public static void main(String[] args) {
		Convertor obj = new Convertor();
double cel=obj.farenToCelsius(32.00);
System.out.println("celsius value of 45F: " +cel);

Double faren=null;
double cel2=0.00;
try{
 cel2=obj.farenToCelsius(faren);
}catch(NullPointerException e)
{System.out.println("feran is null");
System.out.println(e.getMessage());
}
	
System.out.println("celsius value of 45F: " +cel2);
	}

}
