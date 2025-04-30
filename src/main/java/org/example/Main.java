package org.example;

public class Main {
    public static void main(String args[]) {
    }

    public static int factorial(int a) {
        int b = 1;
        for (int i = 1; i <= a; i++) {
            b *= i;
        }
        return b;
    }

    public static double squareTriangle(int a, int b, int c) {
        double polupreimetr = (double) (a + b + c) / 2;
        return Math.sqrt(polupreimetr * (polupreimetr - a) * (polupreimetr - b) * (polupreimetr - c));
    }

    public static String comparison(int a, int b) {
        if (a > b) {
            return ">";
        } else if (a < b) {
            return "<";
        } else {
            return "=";
        }
    }

}