package CH9extends;


public class A9 {
    public static void main(String[] args) {
//        CCircle c1 = new CCircle(2.8);
//        c1.show();
//
//        CCoin c2 = new CCoin();
//        c2.show();
//        c2.setValue(888);
//
//        CCircle c3 = new CCircle(2.9);
//        c3.toString();

        CCircle c4 = new CCoin();
        ((CCoin) c4).setValue(20);
    }
}

class CCircle{
    @Override
    public String toString() {
//        return super.toString();
        return "123物件內容 :  radius =" + radius ;
    }

    protected double pi = 3.14, radius;
    void show(){
        System.out.println("父類別show()， pi = " + pi + "radius" + radius);
    }
    CCircle(double r){
        radius = r;
        System.out.println("父類別建構元radius = " + radius);
    }
}

class CCoin extends CCircle{
    int value;
    void setValue(int value){
        this.value = value;
        System.out.println("子類別show()， pi = " + pi + "radius" + radius + "value = " + value);
    }
    CCoin(){
        super(2.0);
        value = 5;
        System.out.println( "子類別建構元");
    }
    CCoin(double v){
        super(v);
        value = 5;
        System.out.println( "子類別建構元");
    }

}
