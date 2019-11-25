package abstractClass;

public abstract class HSBC implements 金管會 {
    double 存款利率 = 0.002;
    double 借款利率 = 0.1;

    void 利率表(){
        System.out.println("HSBC利率表 ， 存款利率 = " + 存款利率 + "借款利率" + 借款利率);
    }

    abstract void 房貸業務(int m, double n);
    abstract void 車貸業務(int m, double n);
    abstract  void 信貸業務(int m, double n);
}
