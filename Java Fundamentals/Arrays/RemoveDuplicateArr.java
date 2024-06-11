/*Write a program to remove the duplicate elements in an array and print the same. Example)
I/P: {12,34,12,45,67,89}
0/P: {12,34,45,67,89}*/


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateArr {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3};

        // Convert the array to a Set to remove duplicates
        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }

        // Convert the Set back to an array
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }

        // Print the array without duplicates
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }
}
