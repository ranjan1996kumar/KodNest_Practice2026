package com.oopl;

public class Main {

	public static void main(String[] args) 
	{
		Car c = new Car();
		c.color = "White";
		c.brand = "BMW";
		c.price = 3000000;
		
		System.out.println("Car color: " + c.color);
		System.out.println("Car color: " + c.price);
		System.out.println("Car color: " + c.brand);
		
		c.start();
		c.accelerate();
		c.stop();

	}

}
