package com.company;

public class Calculator {

    private double width = 5.0;
    private double height = 6.0;
    private String shapeUsedToCalculateArea;

    public void setWidth(double userEnteredWidth){
        width = userEnteredWidth;
    }

    public double getWidth(){
        return width;
    }


    public void setHeight(double userEnteredHeight){
        height = userEnteredHeight;
    }

    public double getHeight(){
        return height;
    }

    public double calculateAreaOfShape(String shape, double enteredWidth, double enteredHeight){

        shapeUsedToCalculateArea = shape;
        double area;


        if(shapeUsedToCalculateArea == "rectangle"){
            area = enteredWidth * enteredHeight;
            return area;

        } else if (shapeUsedToCalculateArea == "triangle") {
            area = (enteredWidth * enteredHeight)/2;
            return area;
        } else {
            return 0.0;
        }


    }

}
