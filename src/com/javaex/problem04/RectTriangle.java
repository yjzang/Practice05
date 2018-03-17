package com.javaex.problem04;

public class RectTriangle extends Shape {

	
	private double w;
	private double h;
	
	
	public RectTriangle(double w, double h) {
		this.w = w;
		this.h = h;
	}

	
	@Override
	public double getArea() {
		
		return w*h*0.5;
	}

	@Override
	public double getPerimeter() {
		
		return Math.hypot(w, h)+w+h;
		
	}

}
