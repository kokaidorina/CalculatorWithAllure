package org.example;

public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(4,3));
    }

    public int add(int a, int b ) {
        return a+b;
    }
}