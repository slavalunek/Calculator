package org.example;

public interface ICalculator {
    int sum(int a, int b);

    int subtraction(int a, int b);

    int multiplication(int a, int b);

    int division(int a, int b) throws IllegalArgumentException;

    double exponentiation(double a, double b);

    double squareRoot(double a);

    double percentageOfTheNumber(double a,double b);
}
