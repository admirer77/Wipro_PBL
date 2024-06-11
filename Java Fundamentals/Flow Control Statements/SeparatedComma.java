import java.util.Scanner;

public class SeparatedComma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values separated by spaces (press Enter to finish):");

        String input = scanner.nextLine();

        if (input.trim().isEmpty()) {
            System.out.print("No value");
        }
        else{
            String[] values = input.split("\\s+");
            
            System.out.println(String.join(",", values));
        }

        scanner.close();
    }
}
