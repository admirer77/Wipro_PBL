/*1B) Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57.
lastDigit(7, 17) → true lastDigit(6, 17) → false
lastDigit(3, 113) → true*/


import java.util.Scanner;

public class LastDigit {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter first number = ");
        int a = scan.nextInt();

        System.out.println("Enter second number = ");
        int b = scan.nextInt();

        int a1 = a % 10;

        int b1 = b % 10;

        if (a1 == b1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        
        scan.close();
    }
}
