/*Print a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and display the given array or make a new array.
withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
without Ten ([10, 2, 10]) → [2, 0, 0]
withoutTen([1, 99, 10]) → [1, 99, 0]*/.

import java.util.Arrays;

public class Remove10 {
    public static void main(String[] args) {
        int[] array = {1, 10, 3, 10, 5, 10, 7};

        int countTens = 0;
        
        // Count the number of 10s in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 10) {
                countTens++;
            }
        }
        
        // Create a new array to hold the modified values
        int[] newArray = new int[array.length];
        int index = 0;
        
        // Copy non-10 values to the new array
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 10) {
                newArray[index++] = array[i];
            }
        }
        
        // Fill the remaining positions with 0s
        while (index < newArray.length) {
            newArray[index++] = 0;
        }
        
        // Print the modified array
        System.out.println(Arrays.toString(newArray));
    }
}
