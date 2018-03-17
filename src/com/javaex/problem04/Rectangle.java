package com.javaex.problem04;

public class Rectangle extends Shape implements Resizable {
	
	
	private double w;
	private double h;
	
	
	
	public Rectangle(double w, double h) {
		this.w = w;
		this.h = h;
	}

	
	@Override
	public void resize(double res) {
		
			w = w * res ;
			h = h * res ;
		
	}

	@Override
	public double getArea() {
		return w*h;
	}

	@Override
	public double getPerimeter() {
		return (w+h)*2;
	}

}
