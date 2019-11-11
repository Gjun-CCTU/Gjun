package CH8_lotto;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lottoObjectOrientation {
    public static void main(String[] args) throws IOException {
        //自選或是電腦選號  以及張數
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("要自選樂透還是電腦選號?");
        System.out.println("1. 自己選號   2. 電腦選號");
        int n = Integer.parseInt(br.readLine());
        System.out.println("幾張呢?");
        int num = Integer.parseInt(br.readLine());

        if(n ==1){
            YourChoose1 yc = new YourChoose1(num);
                yc.inputLotto();
        }else if (n ==2){
            ComputerChoose1 cc = new ComputerChoose1(num);
            cc.lottoPrint();
        }else{
            System.out.println("you have something wrong!!!!");
        }
        System.out.println("the coding is ending!");
    }
}
