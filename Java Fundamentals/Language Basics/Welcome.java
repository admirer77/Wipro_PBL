/*Write a Program to accept a String as a command line argument and print a Welcome message as given below.
Example1
C:\> java Sample John
O/P Expected
Welcome John*/

import java.util.Scanner;

public class Welcome {
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your name = ");
        String a = scan.next();

        System.out.println("Welcome " + a);
        
        scan.close();
    }
}
