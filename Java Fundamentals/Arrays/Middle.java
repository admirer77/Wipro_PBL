/*Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle elements.
middleway([1, 2, 3], [4, 5,6])  -- [2,5] 
middleWay([7, 7, 7], [3, 8, 0]) -- [7, 8] 
middleWay([5, 2, 9], [1, 4, 5]) -- [2, 4]*/


import java.util.Arrays;

public class Middle {
    public static void main(String[] args) {
        // Predefined 2D array
        int[][] array = {
            {2, 3, 4},
            {4, 5, 6}
        };

        int rows = array.length;
        int cols = array[0].length;

        // Check if array has even dimensions
        if (rows % 2 == 0 || cols % 2 == 0) {
            // Find and print all the central elements
            if (rows % 2 == 0 && cols % 2 != 0) {
                // If rows are even and columns are odd
                int middleCol = cols / 2;
                for (int i = rows / 2 - 1; i <= rows / 2; i++) {
                    System.out.println("One of the middle elements is: " + array[i][middleCol]);
                }
            } else if (rows % 2 != 0 && cols % 2 == 0) {
                // If rows are odd and columns are even
                int middleRow = rows / 2;
                for (int j = cols / 2 - 1; j <= cols / 2; j++) {
                    System.out.println("One of the middle elements is: " + array[middleRow][j]);
                }
            } else if (rows % 2 == 0 && cols % 2 == 0) {
                // If both rows and columns are even
                for (int i = rows / 2 - 1; i <= rows / 2; i++) {
                    for (int j = cols / 2 - 1; j <= cols / 2; j++) {
                        System.out.println("One of the middle elements is: " + array[i][j]);
                    }
                }
            }
        } else {
            int middleRow = rows / 2;
            int middleCol = cols / 2;

            System.out.println("The middle element is: " + array[middleRow][middleCol]);
        }
    }
}
