/*Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.*/

import java.util.Arrays;

public class Large2Small2 {
    public static void main(String[] args) {
    
    
        int[] a = {3, 1, 4, 1, 5, 9, 2, 6, 5};

        //Sort the array
        Arrays.sort(a);
        System.out.println("the Smallest 2 are "+a[0]+" and "+a[1]);
        System.out.println("The Largest 2 are "+a[a.length-2]+" and " +a[a.length-1]);
    }

}
