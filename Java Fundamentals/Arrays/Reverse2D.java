/*Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.
Example1)
C:\>java Sample 1 2 3
O/P: Please enter 4 integer numbers
Example2)
C:\>java Sample 1 2 3 4
O/P:
The given array is :
1 2
3 4
The reverse of the array is:
4 3 
2 1*/

import java.util.Arrays;
import java.util.Scanner;

public class Reverse2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];

        // Continuously prompt for input until 4 integers are entered
        while (true) {
            System.out.println("Please enter 4 integer numbers:");

            // Read the input as a single line
            String input = scanner.nextLine();
            String[] inputs = input.split(" ");

            // Check if the number of inputs is 4
            if (inputs.length != 4) {
                System.out.println("Invalid input. Please enter exactly 4 integer numbers.");
                continue;
            }

            try {
                // Parse the input into integers
                for (int i = 0; i < 4; i++) {
                    numbers[i] = Integer.parseInt(inputs[i]);
                }
                break; // Exit the loop if parsing is successful
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid integer numbers.");
            }
        }

        // Create and print the original 2x2 array
        System.out.println("The given array is:");
        System.out.println(numbers[0] + " " + numbers[1]);
        System.out.println(numbers[2] + " " + numbers[3]);

        // Print the reversed 2x2 array
        System.out.println("The reverse of the array is:");
        System.out.println(numbers[3] + " " + numbers[2]);
        System.out.println(numbers[1] + " " + numbers[0]);
    }
}
