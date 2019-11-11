package forLoop;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        int sum = 0, sum2 = 0;

        for(int i =1; i <= 10 ; i++){
            sum = sum + i;
        }
        System.out.println("sum = " + sum);


        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int num = s.nextInt();
        for (int j = 1; j <= num; j++){
            sum2 = sum2 + j;
        }
        System.out.println("sum2 = " + sum2);
    }
}
