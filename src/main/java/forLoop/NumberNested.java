package forLoop;

public class NumberNested {
    public static void main(String[] args) {
//        myLoop();
        for(int i=10; i>=1; i--){
            for(int j=1; j<=10; j++){
               if (j >= i){
                   System.out.print(j);
               }else {
                   System.out.print(" ");
               }
            }
            System.out.println("\ti = " + i);
        }
    }

    private static void myLoop() {
        for(int i=10; i >= 1; i--){
            for(int j=1; j<=10; j++){
                System.out.print("\t");
                if(j >= i){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
