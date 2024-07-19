
class MyrunnableThread1 implements Runnable{
    public void run(){
        System.out.println("Thread1 is implementing Running");
        System.out.println("I am Happy");
    }
}

class MyrunnableThread2 implements Runnable{
    public void run(){
        System.out.println("Thread2 is implwmenting .........");
        System.out.println("I am sadddddddd");
    }
}

public class runnable {
    public static void main(String[] args) {
        MyrunnableThread1 bullet1 = new MyrunnableThread1();
        MyrunnableThread2 bullet2 = new MyrunnableThread2();

        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
