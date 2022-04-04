package com.polymorphism;

public class Rectangle extends Shape {
    double length;
    double width;
    public  Rectangle(double length, double width){
    this.length = length;
    this.width = width;
    }

    @Override
    public double caculateArea() {
        return this.length * this.width;
    }

    @Override
    public double caculatePerimeter() {
        return 2*(this.length + this.width);
    }
}
