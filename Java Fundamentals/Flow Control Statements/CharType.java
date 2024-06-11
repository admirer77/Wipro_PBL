/*Initialize a character variable in a program and
print 'Alphabhet' if the initialized value is an alphabhet,
print 'Digit' if the initialized value is a number, and
print 'Special Character', if the initialized value is anything else.*/

import java.util.Scanner;

public class CharType {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a char = ");
        char a = scan.next().charAt(0);

        if (Character.isAlphabetic(a)){
            System.out.println(a + " is an Alphabet");
        }
        else if (Character.isDigit(a)){
            System.out.println(a + " is an Digit");
        }
        else{
            System.out.println(a + " is an Special Character");

        }
        
        scan.close();
    }
}
