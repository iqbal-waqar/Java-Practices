
class Mytread1 extends Thread{
    public void run(){
        while(true){
            System.out.println("Thread1 is running first");
            System.out.println("I am Happy");
        }
    }
}

class Mytread2 extends Thread{
    public void run(){
       while (true){
           System.out.println("Thread two is running secondly");
           System.out.println("I am sad!");
       }
    }
}
public class threads {
    public static void main(String[] args) {
        Mytread1 t1 = new Mytread1();
        Mytread2 t2 = new Mytread2();

        t1.start();
        t2.start();
    }
}
