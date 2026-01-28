package com.kodilla;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double sum = calculator.add(10.5, 5.0);
        double difference = calculator.subtract(10.5, 5.0);

        System.out.println("Addition result: " + sum);
        System.out.println("Subtraction result: " + difference);
    }
}
