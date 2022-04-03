package com.abstraction;

public class ScaleneTriangle extends Triangle {
    public  ScaleneTriangle(String triangleType){
            super(triangleType);
    }
    public  void  calculatesPerimeter(int a, int b, int c){
        System.out.println("Scalene Triangle Perimeter ="+ a+b+c);
    }
}
