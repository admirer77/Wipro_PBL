/*Initialize two character variables in a program and display the characters in alphabetical order. 
Example1) if the first character is 's' and second character is 'e' then the output should be e,s
Example2) if the first character is 'a' and second character is 'e', then the output should be a,e*/

import java.util.Scanner;

public class SortChar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter first char = ");
        char a = scan.next().charAt(0);

        System.out.println("Enter second char = ");
        char b = scan.next().charAt(0);

        if (a > b){
            System.out.println(b + "," + a);
        }
        else{
            System.out.println(a + "," + b);
        }
        
        scan.close();
    }
}
