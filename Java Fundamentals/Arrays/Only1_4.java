/*Given an array of type int, print true if every element is 1 or 4.
only14([1, 4, 1, 4]) → true 
only14([1, 4, 2, 4]) false 
only14([1, 1]) → true*/

import java.util.Arrays;


public class Only1_4 {
    public static void main(String[] args) {
        int[] array = {1, 4, 1, 4};
        boolean containsOnly1Or4 = true;

        for (int num : array) {
            if (num != 1 && num != 4) {
                containsOnly1Or4 = false;
                break;
            }
        }

        System.out.println(containsOnly1Or4);
    }
}
