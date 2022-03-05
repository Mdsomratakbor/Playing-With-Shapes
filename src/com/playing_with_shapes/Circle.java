package com.playing_with_shapes;

public class Circle extends Shape {
	private double radius;
	public Circle() {
		this.radius= 1.0;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius,String color, boolean filled) {
		this.radius = radius;
		this.setColor(color);
		this.setFilled(filled);
	}
	  public double getRadius() {  
	        return this.radius;  
	    }  
	    public void setRadius(double radius) {  
	        this.radius = radius;  
	    }
	    @Override
	    public double  getArea() {
	    	return Math.PI* radius * radius;
	    }
	    
	    
	    public double getPerimeter() {
	    	return 2 * Math.PI * radius;
	    }
	    
}
