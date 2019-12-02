package thread;

//class CTest extends Thread{
//    String id;
//    public CTest(String id){
//        this.id = id;
//    }
//
//    public void run(){
//        for(int i=1; i<=4;i++){
//            for(int j=1; j<=99999999;j++);
//            System.out.println(id + "   is running............... ");
//        }
//    }
//}

public class MyThread{

    public static void main(String[] args) {
//        CTest dog = new CTest("dog");
//        CTest cat = new CTest("cat");
//        dog.start();
//        cat.start();
        CTest dog = new CTest("dog");
        CTest cat = new CTest("cat");
        Thread t1 = new Thread(dog,"狗執行緒");
        Thread t2 = new Thread(cat, "貓執行緒");
        t1.start();
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        t2.start();
//        try {
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        int a=155, b=9;
        System.out.println(a + "/" + b + "=" + (a/b));
        System.out.println("主程式結束.......");
    }
}

class CTest implements Runnable{
    String id;

    public CTest(String id) {
        this.id = id;
    }

    @Override
    public void run() {
        for(int i=1; i<=4; i++){
            int Timer = (int)(Math.random()*1000);
            try {
                Thread.sleep(Timer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(id + "   is running..............");
        }
    }
}
