package com.playing_with_shapes;

import java.util.ArrayList;
import java.util.Scanner;

public class MyOwnRoom {

    public static void main(String[] args) {
        ArrayList<Shape> shapes=new ArrayList<Shape>();
        String shapeType = "", color ="";


        boolean filled=false;
        double totalCircleArea = 0, totalRectangleArea=0, totalSquareArea = 0;
        String userInput;
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        while(exit)
        {
            userInput = sc.nextLine();
            if(userInput.contains("exit")) {
               break;
           }
            String[] arrayOfShapeInput = userInput.split("\\s+");
            if(arrayOfShapeInput.length>3){
                shapeType = arrayOfShapeInput[0];
                color = arrayOfShapeInput[1];
                filled = Boolean.parseBoolean(arrayOfShapeInput[2]);
                if(shapeType.contains(ShapeTypeEnums.Circle.toString())){
                    Circle newCircle = new Circle(Double.parseDouble(arrayOfShapeInput[3]), color, filled);
                    shapes.add(newCircle);
                }
               else if(shapeType.contains(ShapeTypeEnums.Rectangle.toString()))
                {
                    Rectangle newRectangle = new Rectangle(Double.parseDouble(arrayOfShapeInput[3]),Double.parseDouble(arrayOfShapeInput[4]), color, filled);
                    shapes.add(newRectangle);
                }
               else if(shapeType.contains(ShapeTypeEnums.Square.toString())){
                    Square newSquare = new Square(Double.parseDouble(arrayOfShapeInput[3]));
                    shapes.add(newSquare);
                }
            }

        }
        for(int i=0; i<shapes.size(); i++) {

            if(shapes.get(i).getClass().getSimpleName().contains(ShapeTypeEnums.Circle.toString())){
                totalCircleArea +=shapes.get(i).getArea();
            }
           else if(shapes.get(i).getClass().getSimpleName().contains(ShapeTypeEnums.Rectangle.toString())){
                totalRectangleArea +=shapes.get(i).getArea();
            }
            else if(shapes.get(i).getClass().getSimpleName().contains(ShapeTypeEnums.Square.toString())){
                totalSquareArea +=shapes.get(i).getArea();
            }
        }
        System.out.println(
                "Total Circle area: "+String.format("%.3f", totalCircleArea) +"\n"+
                        "Total Rectangle area: "+String.format("%.3f", totalRectangleArea) +"\n"+
                        "Total Square: "+String.format("%.3f", totalSquareArea)  +"\n"+
                        "Can not add more shapes."+"\n"+
                        "Total area: "+ String.format("%.3f", (totalCircleArea+totalRectangleArea+totalSquareArea))
        );
    }
}
