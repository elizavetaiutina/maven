package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        String[][] array = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            try {
                check(array);
                System.out.println("Двумерный массив имеет размер 4х4");
            } catch (MyArraySizeException e) {
                System.out.println("Массив имеет другой размер !");
            }
        } catch (MyArrayDataException e) {
            System.out.println("В ячейке " + "[" + e.i + "]" + "[" + e.j + "]" + " лежат неверные данные");
        }
    }

    public static void check(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("Сумма значений в ячейках = " + sum);
    }
}