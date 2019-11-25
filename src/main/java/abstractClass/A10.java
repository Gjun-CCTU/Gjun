package abstractClass;

public class A10 {
    public static void main(String[] args) {
        TWHSBC tw = new TWHSBC();
        tw.利率表();
        tw.設定利率(0.01, 0.18);
        tw.房貸業務(1000000, 0.0165);
        System.out.println();
        HSBC T[] = new HSBC[3];
        T[0] = new TWHSBC();
        T[1] = new JPHSBC();
        T[0].房貸業務(50000, 0.21);
        T[1].房貸業務(10000,0.9);
    }
}
