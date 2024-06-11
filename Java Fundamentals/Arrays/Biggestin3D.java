/*Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.
Example1:
C:\>java Sample 1 2 3
O/P: Please enter 9 integer numbers
Example2:
C:\>java Sample 1 23 45 55 121 222 56 77 89 O/P:
The given array is:
1 23 45
55 121 222
56 77 89
The biggest number in the given array is 222*/


import java.util.Arrays;

import java.util.Scanner;

public class Biggestin3D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[3][3];
        int k = 0;
        
        System.out.println("Please enter exactly 9 integers:");

        // Read 9 integers from the user
        while (k < 9) {
            try {
                array[k / 3][k % 3] = scanner.nextInt();
                k++;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter valid integer numbers.");
                scanner.next(); // Clear the invalid input
            }
        }

        int max = array[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("The maximum number in the given array is " + max);
    }
}
