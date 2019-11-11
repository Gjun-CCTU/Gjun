package CH8_lotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Loto {
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    int A[]=new int[6];
    int num;

    public Loto(int n){
        num=n;
    }

    public int userInput() throws IOException{
        System.out.print("[樂透遊戲]\n1.自選、2隨機: ");
        String s=br.readLine();
        int usr=Integer.parseInt(s);
        return usr;
    }
    public void platForm(int usr) throws IOException{
        switch(usr){
            case 1:
                selfLoto();
                break;
            case 2:
                randomLoto();
                break;
            default:
                System.out.println("很抱歉無此選項...");
        }
    }
    public void selfLoto() throws IOException{
        for(int i=0;i<A.length;i++){
            System.out.print("請輸入第"+(i+1)+"個數字: ");
            String s=br.readLine();
            A[i]=Integer.parseInt(s);
        }
        Arrays.sort(A);
        System.out.print("排序後: ");
        for(int j=0;j<A.length;j++){
            System.out.print(A[j]+" ");
        }
        System.out.println();
    }
    public void randomLoto() throws IOException{
        System.out.print("1.請輸入隨機組數: ");
        String s=br.readLine();
        int n=Integer.parseInt(s);
        int A[]=new int[6];
        for(int i=1;i<=n;i++){
            A[0]=(int)(Math.random()*num+1);
            do{
                A[1]=(int)(Math.random()*num+1);
            }while(A[1]==A[0]);
            do{
                A[2]=(int)(Math.random()*num+1);
            }while(A[2]==A[1] || A[2]==A[0]);
            do{
                A[3]=(int)(Math.random()*num+1);
            }while(A[3]==A[2] || A[3]==A[1] || A[3]==A[0]);
            do{
                A[4]=(int)(Math.random()*num+1);
            }while(A[4]==A[3] || A[4]==A[2] || A[4]==A[1] || A[4]==A[0]);
            do{
                A[5]=(int)(Math.random()*num+1);
            }while(A[5]==A[4] || A[5]==A[3] || A[5]==A[2] || A[5]==A[1] || A[5]==A[0]);
            System.out.print("第"+i+"組: ");
            for(int j=0;j<A.length;j++){
                System.out.print(A[j]+" ");
            }
            System.out.println();
            Arrays.sort(A);
            System.out.print("排序後: ");
            for(int j=0;j<A.length;j++){
                System.out.print(A[j]+" ");
            }
            System.out.println();
        }
    }
}
