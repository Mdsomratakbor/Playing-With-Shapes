package com.polymorphism;

public class Square extends Shape {
    double length;
    public  Square(double length){
        this.length = length;
    }

    @Override
    public double caculateArea() {
        return this.length*this.length;
    }

    @Override
    public double caculatePerimeter() {
        return 4*this.length;
    }
}
