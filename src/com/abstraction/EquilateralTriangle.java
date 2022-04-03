package com.abstraction;

public class EquilateralTriangle extends  Triangle {


    public EquilateralTriangle(String triangleType) {
        super(triangleType);
    }

    public  void  calculatesPerimeter(int a){
        System.out.println("Equilateral Triangle Perimeter ="+ 3*a);
    }
}
