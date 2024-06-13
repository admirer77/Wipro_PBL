/*Create a new class called Calculator with the following methods:

1.A static method called powerInt(int num1, int num2);
2.A static method called powerDouble(double num1, int num2);
This method should return num1 to the power num2.
3. Invoke both the methods and test the functionalities.

Hint: Use Math.pow(double, double) to calculate the power. */

import java.util.*;;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int one = c.powerInt(2, 5);
        System.out.println(one);
        double db = c.powerDouble(2, 5);
        System.out.println(db);
    }
}

class Calculator{

    int powerInt(int num1, int num2) {
        System.out.println("PowerInt : ");
        return(int)(Math.pow(num1, num2));
    }

    double powerDouble(double num1, double num2) {
        System.out.println("PowerDouble : ");
        return Math.pow(num1, num2);
    }

}
