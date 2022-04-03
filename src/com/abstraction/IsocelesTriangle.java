package com.abstraction;

public class IsocelesTriangle extends  Triangle {


    public IsocelesTriangle(String triangleType) {
        super(triangleType);
    }

    public  void  calculatesPerimeter(int a, int b){
        System.out.println("Isoceles Triangle Perimeter ="+ 2*a+b);
    }
}
