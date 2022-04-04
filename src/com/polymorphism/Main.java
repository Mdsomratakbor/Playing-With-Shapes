package com.polymorphism;

public class Main {
    public static void main(String[] args){

        double area, perimeter;

        Shape square = new Square(4);

        area = square.caculateArea();
        perimeter = square.caculatePerimeter();

        System.out.println("Square Area: "+ area+"\nSquare Perimeter: "+ perimeter+"\n\n\n=================\n");

        Shape  rectangle = new Rectangle(5, 6);
        area = rectangle.caculateArea();
        perimeter = rectangle.caculatePerimeter();
        System.out.println("Rectangle Area: "+ area+"\nRectangle Perimeter: "+ perimeter);

    }
}
