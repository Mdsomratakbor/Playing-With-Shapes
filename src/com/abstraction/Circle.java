package com.abstraction;

public class Circle extends Shape {
 final  double PI=3.1416;
    @Override
    public void print_shape() {
        System.out.println("Circle");
    }

    public  void  area(double r){
        System.out.println("Circle area: "+(PI*Math.pow(r, 2)));
    }
}
