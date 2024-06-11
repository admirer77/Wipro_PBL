/*Write a program to print the sum of all the digits of a given number.
Example1) I/P:1234
0/P:10 */

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        int sum = 0;


        String numStr = String.valueOf(number);

        int r;

        for (int i = 0; i < numStr.length(); i++) {
            r = number % 10;
            sum += r;
            number = number / 10;
        }

        System.out.println("Sum of digits: " + sum);

        scan.close();
    }
}
