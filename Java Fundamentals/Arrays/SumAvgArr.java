/*Write a program to initialize an integer array and print the sum and average of the array.*/


import java.lang.reflect.Array;

public class SumAvgArr {
    public static void main(String[] args) {
        int s =0;
        int a[]={10,12,13,14,15,16,17,18};

        for (int i=0;i<a.length;i++){
            s+=a[i];
        }
        System.out.println("the sum of the elements in the array is "+s);
        int avg=s/a.length;
        System.out.println("the abergae of the elements in the array is "+avg);
    }
}
