package org.example;
//import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        String[][] array = new String[4][4];
        try {
            check(array);
            System.out.println("Двумерный массив имеет размер 4х4");
        } catch (MyArraySizeException e) {
            System.out.println("Массив имеет другой размер !");
        }
    }

    public static void check(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
    }
}