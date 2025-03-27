package org.example;
//import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        printThreeWords();
        checkSumSign(5, 5);
        printColor();
        compareNumbers();
        five(5, 16); //System.out.println(five(5, 16));
        six(-5);
        seven(0); //System.out.println(seven(0));
        eight("Hello World! ", 5);
        nine(2000); //System.out.println(nine(2000));
        ten();
        eleven();
        twelve();
        thirteen(5);
        fourteen(5, 4); //System.out.println(Arrays.toString(fourteen(5, 4)));
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign(int a, int b) {
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 6;
        int b = 6;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static boolean five(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void six(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean seven(int a) {
        return a >= 0;
    }

    public static void eight(String str, int count) {
        System.out.println(str.repeat(count));
    }

    public static boolean nine(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void ten() {
        int[] args = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < args.length; i++) {
            if (args[i] == 0) {
                args[i] = 1;
            } else {
                args[i] = 0;
            }
        }
        //System.out.println(Arrays.toString(args));
    }

    public static void eleven() {
        int[] args = new int[100];
        for (int i = 0; i < 100; i++) {
            args[i] = i + 1;
        }
        //System.out.println(Arrays.toString(args));
    }

    public static void twelve() {
        int[] args = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < args.length; i++) {
            if (args[i] < 6) {
                args[i] *= 2;
            }
        }
        //System.out.println(Arrays.toString(args));
    }

    public static void thirteen(int n) {
        int[][] square = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                if (i + j == n - 1) {
                    square[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    square[i][j] = 1;
                }
                //System.out.print(" " + square[i][j] + " ");
            }
            //System.out.println();
        }
    }

    public static int[] fourteen(int len, int initialValue) {
        int[] args = new int[len];
        for (int i = 0; i < len; i++) {
            args[i] = initialValue;
        }
        return args;
    }
}