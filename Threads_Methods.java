
class Mynewthr1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 577) {
            System.out.println("Thank you------------");
            try {
                Thread.sleep(45);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
class Mynewthr2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 2) {
            System.out.println("-------------Thank you------------");
            i++;
        }
    }
}
public class Threads_Methods {
    public static void main(String[] args)  {
        Mynewthr1 t1 = new Mynewthr1();
        Mynewthr2 t2 = new Mynewthr2();

        t1.start();
//        try {
//            t1.join();
//        }
//        catch (Exception e) {
//            System.out.println(e);;
//        }
        t2.start();
    }
}
// when not started then getstate() = new
// when  started then getstate() = runnable
// Reference = Thread.currentThread().getstate()