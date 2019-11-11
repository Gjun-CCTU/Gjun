
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class CH8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("要自選樂透還是電腦選號?");
        System.out.println("1. 自己選號   2. 電腦選號");
        int n = Integer.parseInt(br.readLine());
        System.out.println("幾張呢?");
        int num = Integer.parseInt(br.readLine());

        if(n ==1){
            YourChoose yc = new YourChoose(num);
            yc.inputLotto();
        }else if (n ==2){
            ComputerChoose cc = new ComputerChoose(num);
            cc.lottoPrint();
        }else{
            System.out.println("you have something wrong!!!!");
        }
        System.out.println("the coding is ending!");
    }
}

class ComputerChoose {
    int  number;

    public ComputerChoose(int number) {
        this.number = number;
    }

    public static int[] lottonumber(){
        int [] lotto = new int [6];
        int number = 0;
        boolean same = true;

        do {
            int secret = (int)(Math.random()*49 + 1);
//			System.out.println("secret:" + secret);

            for (int i = 0; i < lotto.length; i++) {
                if (secret == lotto[i]) {
                    same = false;
                }
            }
            if (same == true) {
                lotto[number] = secret;
                number = number + 1;
//				System.out.println("number:" + number);
            }
            same =true;
        }while(number < 6);
        return lotto;
    }

    public static int[] Arrange(int [] lotto){
        //排列大小
        int [] lottoArrange  = new int [6];
        for(int i=0; i <lottoArrange.length; i++){
            lottoArrange[i] = lotto[i];
        }
        int register ;
//        System.out.println(lotto);
//        System.out.println(lottoArrange);

        for(int i=0; i< lottoArrange.length-1; i++) {
            for(int j=0; j < lottoArrange.length-i-1; j++) {
                if (lottoArrange[j] > lottoArrange[j+1]) {
                    register = lottoArrange [j+1];
                    lottoArrange[j+1] = lottoArrange [j];
                    lottoArrange[j] = register;
                }
            }
        }
//        System.out.println("lottoArrange:");
//        for(int i=0; i<lottoArrange.length; i++) {
//            System.out.print(lottoArrange[i] + "  ");
//        }
        return lottoArrange;
    }

    public void lottoPrint(){
        for (int i=1; i <= number; i++){
            int [] lotto = lottonumber();
            int [] lottoArrange = Arrange(lotto);

            System.out.print("lotto" + i + ":\t");
            for(int j=0; j < lotto.length; j++){
                System.out.print(lotto[j] + "  ");
            }

            System.out.println();

            System.out.print("lottoArrange" + i + ":\t");
            for(int j=0; j < lottoArrange.length; j++){
                System.out.print(lottoArrange[j] + "  ");
            }
            System.out.println("\n\n");

        }
    }

}

class YourChoose {
    int number;

    public YourChoose(int number) {
        this.number = number;
    }
    public void inputLotto() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int j=1; j <= number; j++){
            Set<Integer> set = new HashSet<>();
            System.out.println("請輸入六個數字(數字間逗號間格勿空白)");
            String s = new String(br.readLine());
            String[] tokens =s.split(",");
            for(int i=1; i <=tokens.length; i++){
                set.add(Integer.parseInt(tokens[i-1]));
            }
            System.out.println("lotto: " + j);
            if(set.size() == 6){
                System.out.print(set);
            }else{
                System.out.println("可能少輸入或多輸入!!請檢查");
                System.out.println(set);
            }
            System.out.println();

        }
    }


}
