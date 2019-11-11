package forLoop;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber2 {
    public static void main(String[] args) {
        int number = 0, max = 100, min = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secret = random.nextInt(100)  + 1;
        System.out.println("Secret :" + secret);
        while (secret != number){
            System.out.println("Please enter the number :");
            number = scanner.nextInt();
            if (secret > number){
                min = number;
                System.out.println("wrong!" + min + "~" + max);
            }else if (secret < number){
                max = number;
                System.out.println("wrong" + min + "~" + max);
            }else{
                System.out.println("great, the secret is :" + secret);
                break;
            }
        };
        System.out.println("The coding is secret :" + secret);
    }
}
