import java.util.Scanner;

public class WrapperZeros {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a num between 1 and 255");
        int a=sc.nextInt();
        if ((a>255)||(a<0)){
            System.out.println("rerun the program and enter the input in given range");
        }
        else{
        String bin=Integer.toBinaryString(a);
        String paddedBinaryString = String.format("%8s", bin).replace(' ', '0');

            // Print the binary representation
        System.out.println(paddedBinaryString);
    }}
    
}
