package forLoop;

import java.util.Random;
import java.util.Scanner;

public class UpgradeDowngrade {
    public static void main(String[] args) {

//        easyTest();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("電腦隨機四則運算:答對晉級，答錯三次降級");
        int n1, n2, ans, level =1, error = 0, i=1;
        do {
            n1 = random.nextInt(10) + 1;
            n2 = random.nextInt(10) + 1;
            switch (level){
                case 1 :
                    System.out.print("第一題" + n1 + "+" + n2 + "=:");
                    ans = scanner.nextInt();
                    if (ans == (n1 + n2)){
                        level = level + 1;
                        error = 0;
                        System.out.println("答對了!!晉級[減法運算]");
                    }else{
                        error = error + 1;
                        System.out.println("error number" + error);
                        if (error == 3){
                            level = level - 0;//第一題不能再後退
                        }
                    }
                    break;

                case 2:
                    System.out.print("第二題" + n1 + "-" + n2 + "=:");
                    ans = scanner.nextInt();
                    if (ans == (n1 - n2)){
                        level = level + 1;
                        error = 0;
                        System.out.println("答對了!!晉級[乘法運算]");

                    }else{
                        error = error + 1;
                        System.out.println("error number" + error);
                        if (error == 3){
                            level = level - 1;
                            error = 0;
                            System.out.println("降級\n");
                        }else{
                            System.out.println("答錯三次要回到加法運算，還剩" + (3-error) + "次機會");
                        }
                    }
                    break;

                case 3:
                    System.out.print("第三題" + n1 + "*" + n2 + "=:");
                    ans = scanner.nextInt();
                    if (ans == (n1 * n2)){
                        level = level + 1;
                        error = 0;
                        System.out.println("答對了!!晉級[除法運算]");

                    }else{
                        error = error + 1;
                        System.out.println("error number" + error);
                        if (error == 3){
                            level = level - 1;
                            error = 0;
                            System.out.println("降級\n");

                        }else{
                            System.out.println("答錯三次要回到減法運算，還剩" + (3-error) + "次機會");
                        }
                    }
                    break;

                case 4:
                    System.out.print("第四題" + n1 + "/" + n2 + "=:");
                    ans = scanner.nextInt();
                    if (ans == (n1 / n2)){
                        level = level + 1;
                        error = 0;
                    }else{
                        error = error + 1;
                        System.out.println("error number" + error);
                        if (error == 3){
                            level = level - 1;
                            error = 0;
                            System.out.println("降級\n");

                        }else{
                            System.out.println("答錯三次要回到乘法運算，還剩" + (3-error) + "次機會");
                        }
                    }
                    break;
            }

        }while(level != 5);
        System.out.println("恭喜你全部答對了!!");
        System.out.println("得到一張國小畢業卡片!!!!byebye!!!!!!!");
        System.out.println("The code is ending");




    }

    private static void easyTest() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n1, n2, ans, i=1;
        do{
            n1 = random.nextInt(10) + 1;
            n2 = random.nextInt(10) + 1;
            System.out.print("第" + i + "題:" + n1 + "+" + n2 + "=");
            ans = scanner.nextInt();
            if (ans == (n1+n2)){
                System.out.println("恭喜你答對了");
            }else{
                System.out.println("抱歉答錯了");
            }
        }while(ans != (n1+n2));
        System.out.println("遊戲結束.....");
    }

}
