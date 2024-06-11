/*Write a program to print * in Floyds format (using for and while loop)
Example1)
C:\>java Sample
O/P: Please enter an integer number 3

*
* *
* * *

*/

import java.util.Scanner;

public class FloydsFormat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scan.nextLine();

        if (input.isEmpty()) {
            System.out.println("No values");
        } else {
            try {
                int number = Integer.parseInt(input);
                for (int i = 1; i <= number; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*" + "\t");
                    }
                    System.out.println();
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        scan.close();
    }
}
