package CH8_lotto;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class LotoExtends extends Loto {
    public LotoExtends(int n) {
        super(n);
    }

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


    @Override
    public int userInput() throws IOException {
//        return super.userInput();
        System.out.print("1. 終極密碼 2. 自選樂透 3.隨機樂透 ");
        String s=br.readLine();
        int usr=Integer.parseInt(s);
        return usr;
    }

    @Override
    public void platForm(int usr) throws IOException {
//        super.platForm(usr);
        switch(usr){
            case 1:
                guessNumber();
                break;
            case 2:
                selfLoto();
                break;
            case 3:
                randomLoto();
                break;
            default:
                System.out.println("很抱歉無此選項...");
        }
    }

    public static void main(String[] args) throws IOException {
        LotoExtends myLotto = new LotoExtends(49);
        int usr=myLotto.userInput();
        myLotto.platForm(usr);

    }
}
