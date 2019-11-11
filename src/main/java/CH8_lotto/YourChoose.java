package CH8_lotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

 class YourChoose1 {
    int number;

    public YourChoose1(int number) {
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
