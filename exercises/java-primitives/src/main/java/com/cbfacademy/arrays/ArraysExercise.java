package com.cbfacademy.arrays;

import java.util.Arrays;

public class ArraysExercise {

    public static void main(String[] args) {
        // Write a program that creates:
        // an array of 8 Integer elements
        Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(intArray[4]);

        // // an array of 12 Float elements
        Float[] floatObjectArray = { 3.14f, 2.718f, -1.618f, 0.618f, 1.414f, 1.732f, -2.303f, 4.2f, -5.67f, 8.91f,
                -10.23f, 11.45f };
        System.out.println(floatObjectArray[4]);

        // an array of 6 Double elements
        Double[] doubleArray = { 0.2, 0.2, 0.1, 0.8, 3.8, 0.4, };
        System.out.println(doubleArray[4]);

        // an array of 6 Boolean elements
        Boolean[] boolArray = { true, false, false, true, false, true };
        System.out.println(boolArray[4]);

        // Stretch Exercise
        // Write code that initialises a matrix with the 4 arrays created above.
        Object[][] matrixArray = { intArray, doubleArray, boolArray, floatObjectArray };

        System.out.println(Arrays.toString(matrixArray[3]));

    }

}
