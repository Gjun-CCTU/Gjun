package forLoop;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) throws IOException {
        int number;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secret = random.nextInt(10) + 1;
        System.out.println("Secret :" + secret);

        do {

            if (secret > 5)
                System.out.println("[提示] : 電腦出的數字大於5");
            else
                System.out.println("[提示] : 電腦出的數字小於等於5");
            System.out.println("請輸入一個數 : ");
//             number = scanner.nextInt();
            number = Integer.parseInt(bufferedReader.readLine());
            if (number != secret)
                System.out.println("沒猜到唷! 猜到才可以閃人");
            else {
                System.out.println("恭喜你猜對啦!");
                break;
            }
        }while(secret != number);

        System.out.println("The coding is ending");
    }
}
