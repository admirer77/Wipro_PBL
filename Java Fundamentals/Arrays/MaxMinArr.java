/*Write a program to initialize an integer array and find the maximum and minimum value of the array.*/

import java.lang.reflect.Array;

public class MaxMinArr {
    public static void main(String[] args) {
        int[] array = {10, 5, 7, 3, 15, 20, 8, 1, 30};

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("The maximum element in the array is: " + max);
        System.out.println("The minimum element in the array is: " + min);
    }
}
