package com.javaex.problem04;

public abstract class Shape {

	private double w;
	private double h;
	
	
	public Shape() {
	}

	public Shape(double w, double h) {
		this.w = w;
		this.h = h;
	}


	public abstract double getArea() ;
		
	
	
	public abstract double getPerimeter();	
	

}
