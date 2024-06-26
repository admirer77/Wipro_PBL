/*Initialize a character variable with an alphabhet in a program.
If the character value is in lowercase, the output should be displayed in uppercase in the following format.
Example1) i/p:a
o/p:a->A
If the character value is in uppercase, the output should be displayed in lowercase in the following format.
Example2) i/p:A
o/p: A->a*/

import java.util.Scanner;

public class LowerUpper {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a char = ");
        char a = scan.next().charAt(0);

        if (Character.isLowerCase(a)){
            System.out.println(Character.toUpperCase(a));
        } else {
            System.out.println(Character.toLowerCase(a));
        }
        
        scan.close();
    }
}
