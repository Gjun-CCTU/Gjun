package CH9extends;


public class A9 {
    public static void main(String[] args) {
        CCircle c1 = new CCircle(2.8);
        c1.show();

        CCoin c2 = new CCoin();
        c2.show();
        c2.setValue(888);

        CCircle c3 = new CCircle(2.9);
        c3.toString();

        CCircle c4 = new CCoin();
        ((CCoin) c4).setValue(20);
        CCircle biger =  c4.Compare(c2);
        System.out.println(biger);

        CCoin c5[] = new CCoin[5];
        for(int i =1; i < c5.length; i++){
            c5[i] = new CCoin(5 * i);
        }
        System.out.println("max =" + c5[1].maxValue(c5));
    }
}

class CCircle{
    @Override
    public String toString() {
//        return super.toString();
        return "123物件內容 :  radius =" + radius  +"\n";
    }

    protected double pi = 3.14, radius;
    void show(){
        System.out.println("父類別show()， pi = " + pi + "radius" + radius);
    }
    CCircle(double r){
        radius = r;
        System.out.println("父類別建構元radius = " + radius);
    }

    public CCircle Compare(CCircle cc){
        if(this.radius > cc.radius){
            return this;
        }else{
            return cc;
        }
    }

    public double maxValue(CCircle cCircle[]){
        double max = 0;
        for (int i =1; i <cCircle.length; i++){
            if(cCircle[i].radius > max)
                max = cCircle[i].radius;
        }
        return max;
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
