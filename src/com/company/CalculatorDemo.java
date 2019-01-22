package com.company;

public class CalculatorDemo {

    public static void main(String[] args) {
	Calculator calculator = new Calculator();

	System.out.println("The area of your rectangle is " + calculator.calculateAreaOfShape("rectangle", 5.0, 6.0) + " meters.");

	System.out.println("The area of your triangle is " + calculator.calculateAreaOfShape("triangle", 5.0, 6.0) + " meters.");

    }
}
