/* Write a Program that accepts two Strings as command line arguments and generate the output in the required format.
Example1
If the two command line arguments are Wipro and Bangalore then the output generated should be Wipro Technologies Bangalore.
Example2
If the command line arguments are ABC and Mumbai then the output generated should be ABC Technologies Mumbai
[Note: It is mandatory to pass two arguments in command line] */

import java.util.Scanner;

class RequiredFormat{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter first Word = ");
        String a = scan.next();

        System.out.println("Enter second Word = ");
        String b = scan.next();

        System.out.println(a + " Technologies " + b);
        
        scan.close();
    }
}