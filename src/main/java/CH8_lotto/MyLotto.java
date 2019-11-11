package CH8_lotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class MyLotto extends lottoObjectOrientation {

    public static void guessNumber(){
        int number = 0, max = 100, min = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secret = random.nextInt(100)  + 1;
//        System.out.println("Secret :" + secret);
        while (secret != number){
            System.out.println("Please enter the number :");
            number = scanner.nextInt();
            if (secret > number){
                if(number > min)
                min = number;
                else
                    min = min;
                System.out.println("wrong!" + min + "~" + max);
            }else if (secret < number){
                if (number < max){
                    max = number;
                }else{
                    max = max;
                }
                System.out.println("wrong" + min + "~" + max);
            }else{
                System.out.println("great, the secret is :" + secret);
                break;
            }
        };
        System.out.println(" secret =" + secret);
    }

    public static void main(String[] args) throws IOException {
        System.out.println("你要玩哪種遊戲?");
        System.out.println("1. 終極密碼 2. 自選樂透 3.隨機樂透");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        switch(i) {
                case 1:
                    guessNumber();
                    break;

                case 2:
                    YourChoose1 yc = new YourChoose1(1);
                    yc.inputLotto();
                    break;

                case 3:
                    ComputerChoose1 cc = new ComputerChoose1(1);
                    cc.lottoPrint();
                    break;
                default:
                    System.out.println("you have enter something wrong");
        }
        System.out.println("the coding is ending");
    }


}
