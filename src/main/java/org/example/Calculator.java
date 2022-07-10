package org.example;

public class Calculator implements org.example.ICalculator {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Error: Division by zero!");
        }
        return a / b;
    }

    @Override
    public double exponentiation(double a, double b) {
        return Math.pow(a,b);
    }

    @Override
    public double squareRoot(double a) throws IllegalArgumentException {
        if (a < 0) {
            throw new IllegalArgumentException("Error: The square root cannot be a negative number!");
        }
        return Math.sqrt(a);
    }

    @Override
    public double percentageOfTheNumber(double a, double b) {
        return a * b / 100;
    }
}