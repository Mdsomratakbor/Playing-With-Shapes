package com.playing_with_shapes;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	public Rectangle(){
		this.width  = 1.0;
		this.length = 1.0;
	}
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled) {
		this.width = width;
		this.length = length;
		this.setColor(color);
		this.setFilled(filled);
	}
	
	
	 public double getWidth() {  
	        return this.width;  
	    }  
	    public void setWidth(double width) {  
	        this.width = width;  
	    }
	    public double getLength() {  
	        return this.length;  
	    }  
	    public void setLength(double length) {  
	        this.length = length;  
	    }
		@Override
	    public double  getArea() {
	    	return this.width * this.length;
	    }
	    
	    
	    public double getPerimeter() {
	    	return 2 * (this.width+ this.length);
	    }
}
