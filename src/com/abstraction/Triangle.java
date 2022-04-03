package com.abstraction;

public class Triangle extends  Shape {
    String triangleType ="";
    public  Triangle(String triangleType){
    this.triangleType = triangleType;
    }
    @Override
    public void print_shape() {
    System.out.println(this.triangleType);
    }

    public  void  calculatesPerimeter(int a, int b, int c){
        System.out.println("Triangle Perimeter ="+a+b+c);
    }
}
