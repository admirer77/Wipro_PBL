/* Write a Program to accept two integers as command line arguments and print the sum of the two numbers
Example1)
C:\>java Sample 10 20
O/P Expected: The sum of 10 and 20 is 30 */

import java.util.Scanner;

public class Sum {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter first number = ");
        int a = scan.nextInt();

        System.out.println("Enter second number = ");
        int b = scan.nextInt();

        int c = a + b;

        System.out.println("The sum of " + a + " and " + b + " is " + c);
        
        scan.close();
    }
}
