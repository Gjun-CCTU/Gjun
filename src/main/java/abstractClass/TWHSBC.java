package abstractClass;

public class TWHSBC extends HSBC implements 金管會, 證交所 {
    @Override
    void 房貸業務(int m, double n) {
        System.out.println("TW房貸金額: =" + m + "元，房貸利率 :" + n + "利息:" + m+n);
    }

    @Override
    void 車貸業務(int m, double n) {

    }

    @Override
    void 信貸業務(int m, double n) {

    }

    void 設定利率(double m, double n){
        存款利率 = m;
        借款利率 = n;
        System.out.println("TWHSBC設定利率，存款利率 = " + 存款利率 + "借款利率 = "+ 存款利率);
    }

    @Override
    public void 負債比() {

    }

    @Override
    public void 呆帳比() {

    }

    @Override
    public void 逾放比() {

    }

    @Override
    public void 資產負債表() {

    }

    @Override
    public void 損益表() {

    }

    @Override
    public void 現金流量表() {

    }

    @Override
    public void 營所稅() {

    }

    @Override
    public void 綜所稅() {

    }
}
