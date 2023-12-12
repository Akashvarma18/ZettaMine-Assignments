package com.day4;

public class Rectangle extends Shape {
	
	private double length;
	private double width;
	
	
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*width;
	}
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return -1;
	}

	
	
}
