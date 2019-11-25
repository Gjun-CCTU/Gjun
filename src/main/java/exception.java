public class exception {

    public static void main(String[] args)  {
        int a[] = new int[5];
        try{
            a[6] = 10;
        }catch (Exception e){
            System.out.println("exception" + e.getMessage());
        }
        System.out.println("ending");

        Test t = new Test();
        try {
            t.setNum(0);
        } catch (numNegative numNegative) {
            numNegative.printStackTrace();
        } catch (numIsZero numIsZero) {
            numIsZero.printStackTrace();
        }
    }
}



class numNegative extends Exception{};
class numIsZero extends  Exception{};

class Test{
    int m;
    public void setNum(int n) throws numNegative, numIsZero{
        if (n == 0)
            throw new numIsZero();
        else if (n<0)
            throw new  numNegative();
        else
            m = n;
        System.out.println("m=" + m);

    }
}