/*1A) Write a program to check if a given integer number is Positive, Negative, or Zero.*/

import java.util.Scanner;

public class PosNegZero {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter first number = ");
        int a = scan.nextInt();

        if (a < 0){
            System.out.println(a + " is a Negative number");
        }
        else if (a > 0){
            System.out.println(a + " is a Positive number");
        }
        else{
            System.out.println(a + " is Zero");
        }
        
        scan.close();
    }
}
