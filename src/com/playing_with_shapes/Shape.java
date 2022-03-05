package com.playing_with_shapes;

public class Shape {
	private String color ="";
	private boolean filled = false;
	public Shape() {
		color ="white";
		filled = true;
	}
	public Shape(String color, Boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	 
    public String getColor() {  
        return this.color;  
    }  
    public void setColor(String color) {  
        this.color = color;  
    }
    public String getFilled() {  
        return this.color;  
    }  
    public void setFilled(boolean filled) {  
        this.filled = filled;  
    }
    
    public double getArea() {
    	return 1;
    }
}
