/*Initialize an integer array with ascii values and print the corresponding character values in a single row.*/

import java.lang.reflect.Array;


public class ASCiiArr {
    public static void main(String[] args) {
        // Initialize an array with ASCII values
        int[] asciiValues = {55, 76, 88, 100, 73, 83};

        // Print the corresponding characters
        System.out.println("Corresponding characters:");
        for (int i = 0; i < asciiValues.length; i++) {
            char character = (char) asciiValues[i];
            System.out.print(character+" ");
        }
    } 
}
