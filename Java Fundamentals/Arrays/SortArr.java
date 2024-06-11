/*Write a program to initialize an array and print them in a sorted order.*/

import java.util.Arrays;

public class SortArr {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5};

        // Sort the array
        Arrays.sort(array);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));

    }
}
