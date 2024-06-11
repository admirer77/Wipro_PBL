/*Write a program to print the sum of the elements of an array following the given below condition.
If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.
Eg1) Array Elements {10,3,6,1,2,7,9}
O/P: 22
[i.e 10+3+9]
Eg2) Array Elements O/P:19 {7,1,2,3,6}
Eg3) Array Elements 0/P:10 {1,6,4,7,9}
*/

import java.util.Arrays;

public class Skip_6_7 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 8, 7};

        int sum = 0;
        boolean skip = false;
        for (int num : array) {
            if (num == 6) {
                skip = true;
            } else if (num == 7) {
                skip = false;
            } else if (!skip) {
                sum += num;
            }
        }

        System.out.println("Sum of elements in the array (skipping elements between 6 and 7): " + sum);
    }
}
