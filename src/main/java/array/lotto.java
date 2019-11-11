package array;


import java.util.Scanner;

public class lotto {
    public static void main(String[] args) {
        int number ;

        System.out.println("要幾張彩券呢?");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

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

    public static int [] lottonumber() {
        int [] lotto = new int [6];
        int number = 0;
        boolean same = true;

        do {
            int secret = (int)(Math.random()*49 + 1);
//			System.out.println("secret:" + secret);

            for (int i=0; i <lotto.length; i++) {
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
//        System.out.println("lotto:");
//        for(int i=0; i<lotto.length; i++) {
//            System.out.print(lotto[i] + "  " );
//        }

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
}
