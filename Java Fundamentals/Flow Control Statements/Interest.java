/*Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.
If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%. If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.
If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%. If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.*/


import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the Gender (Female or Male) = ");
        String g = scan.next().trim();

        System.out.println("Enter the age between 1 to 100 = ");
        int a = scan.nextInt();

        if (g.equalsIgnoreCase("Female")) {
            if (a >= 1 && a <= 58) {
                System.out.println("Percent of Interest is 8.2%");
            } else if (a >= 60 && a <= 100){
                System.out.println("Percent of Interest is 9.2%");
            } else {
                System.out.println("Enter the correct age between 1 to 100");
            }
        } 
        
        else if (g.equalsIgnoreCase("Male")) {
            if (a >= 1 && a <= 58) {
                System.out.println("Percent of Interest is 8.4%");
            } else if (a >= 60 && a <= 100){
                System.out.println("Percent of Interest is 10.5%");
            } else {
                System.out.println("Enter the correct age between 1 to 100");
            }
        } 
        
        else {
            System.out.println("Enter Correct Gender (Female or Male)");
        }

        scan.close();
    }
}
