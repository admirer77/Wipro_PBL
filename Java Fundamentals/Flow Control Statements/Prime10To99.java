/*Write a program to print prime numbers between 10 and 99.*/

public class Prime10To99 {
    public static void main(String[] args){

    
        for (int a = 10; a < 100; a++){
            int count = 0;

            for (int i = 2; i < a; i++ ){
                if (a % i == 0){
                    count++;
                } else {
                    continue;
                }
            }

            if (count == 0){
                System.out.println(a);
            }
        }
    }
}
