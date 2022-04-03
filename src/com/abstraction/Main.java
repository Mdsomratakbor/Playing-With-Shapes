package com.abstraction;

public class Main {
    public static void main(String[] args){
        Circle c=new Circle();
         c.print_shape();
        c.area(3.00);

        System.out.println();

        EquilateralTriangle equilateralTriangle=new EquilateralTriangle("Equilateral Triangle");
        equilateralTriangle.print_shape();
        equilateralTriangle.calculatesPerimeter(4);

        System.out.println();

        IsocelesTriangle isocelesTriangle=new IsocelesTriangle("Isoceles Triangle");
        isocelesTriangle.print_shape();
        isocelesTriangle.calculatesPerimeter(12, 35);

        System.out.println();

        ScaleneTriangle scaleneTriangle=new ScaleneTriangle("Scalene Triangle");
        scaleneTriangle.print_shape();
        scaleneTriangle.calculatesPerimeter(5, 8, 9);

    }
}
