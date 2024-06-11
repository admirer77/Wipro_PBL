/*Write a program to initialize an integer array with values and check if a given number is present in the array or not.
If the number is not found, it will print -1 else it will print the index value of the given number in the array.
Example 1) If the Array elements are {1,4,34,56,7} and the search element is 90, then the output expected is -1.
Example 2) If the Array elements are {1,4,34,56,7} and the search element is 56, then the output expected is 3.*/

import java.util.*;
import java.lang.reflect.Array;

public class SearchArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the search element");
        int[] array = {10, 5, 7, 3, 15, 20, 8, 54 , 13, 35, 45, 0};
        int target =sc.nextInt() ;

        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }

    }
}
