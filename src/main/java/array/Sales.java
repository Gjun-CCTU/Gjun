package array;

public class Sales {
    public static void main(String[] args) {
        int A = 0, B = 0, C = 0;
        int [] price = {10, 20, 40, 30, 20};
        int [][] numbers = {{100, 200, 100, 200, 110},
                {200, 100, 100, 200, 100},
                {100, 200, 200, 100, 200}};
        producePrice(price);
        System.out.println("\n");
        sales(numbers);
        A = getA(A, price, numbers, 0);

        //sales B sum
        B = getA(B, price, numbers, 1);
        //sales C sum
        C = getA(C, price, numbers, 2);

        print(A, B, C);
    }

    private static void print(int a, int b, int c) {
        System.out.println();
        System.out.println("1業務員的銷售量:" + a + "\t達標率:" + a /100f + "%");
        System.out.println("2業務員的銷售量:" + b + "\t達標率:" + b /100f + "%");
        System.out.println("3業務員的銷售量:" + c + "\t達標率:" + c /100f + "%");
        System.out.println();
        if(a > b && a > c){
            System.out.println("1的業績最好");
        }else if (b > a && b > c){
            System.out.println("2的業績最好");
        }else{
            System.out.println("3的業績最好");
        }
    }

    private static int getA(int a, int[] price, int[][] numbers, int i2) {
        //sales A sum
        for (int i = 0; i < price.length; i++) {
            a = a + price[i] * numbers[i2][i];
        }
        return a;
    }

    private static void sales(int[][] numbers) {
        for(int i =0; i < numbers.length; i++){
            System.out.print("銷售員" + (i+1) + "的銷售量");
            for(int j = 0; j < numbers[i].length; j++){
                System.out.print("\t" + numbers[i][j]);
            }
            System.out.println();
        }
    }

    private static void producePrice(int[] price) {
        //印出陣列
        System.out.print("產品價格");
        for(int i = 0; i < price.length; i++){
            System.out.print("\t" + price[i]);
        }
    }
}
