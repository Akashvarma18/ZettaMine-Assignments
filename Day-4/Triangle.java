package com.day4;

public class Triangle extends Shape {
	
    private double base;
    private double height;
    
    
    
    
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double area() {
		
		return 1/2 * base * height;
	}
	@Override
	public double volume() {
		
		return -1;
	}
    
    
	

	
	
}
