package com.company;

public class Calculator {

    private double width = 5.0;
    private double height = 6.0;


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

    public double calculateArea(double enteredWidth, double enteredHeight){
        double area = enteredWidth * enteredHeight;
        return area;

    }

}
