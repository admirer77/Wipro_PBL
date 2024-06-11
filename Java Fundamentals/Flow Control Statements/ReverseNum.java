/*Write a program to reverse a given number and print
Example1)
I/P: 1234
0/P:4321

Example2) I/P: 1004
O/P: 4001*/

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number: " + reversed);
    }
}
