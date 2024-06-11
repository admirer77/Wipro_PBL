/*Write a program to check if a given number is prime or not.*/

import java.util.Scanner;

public class Prime {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        int a = scan.nextInt();

        int count = 0;

        for (int i = 2; i < a; i++ ){
            if (a % i == 0){
                count++;
            } else {
                continue;
            }
        }

        if (count == 0){
            System.out.println(a + " is a Prime Number");
        } else {
            System.out.println(a + " is a not Prime Number");
        }
    }
}
