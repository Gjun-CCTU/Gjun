package abstractClass;

public class JPHSBC extends HSBC {
    @Override
    void 房貸業務(int m, double n) {
        System.out.println("JP房貸金額: =" + m + "元，房貸利率 :" + n + "利息:" + m+n);
    }

    @Override
    void 車貸業務(int m, double n) {

    }

    @Override
    void 信貸業務(int m, double n) {

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
    public void 營所稅() {

    }

    @Override
    public void 綜所稅() {

    }
}
