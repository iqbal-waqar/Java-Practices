
class Mythr1 extends Thread{
    public Mythr1(String name){
        super(name);
    }

    public void run(){
        System.out.println("My name is : "+ this.getName());
    }
}

public class Threads_Priorities {
    public static void main(String[] args) {
        Mythr1 m1 = new Mythr1("WAQAR 1");
        Mythr1 m2 = new Mythr1("WAQAR 2");
        Mythr1 m3 = new Mythr1("WAQAR 3");
        Mythr1 m4 = new Mythr1("WAQAR 4");
        Mythr1 m5 = new Mythr1("WAQAR 5");

        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MIN_PRIORITY);
        m3.setPriority(Thread.MIN_PRIORITY);
        m4.setPriority(Thread.MIN_PRIORITY);
        m5.setPriority(Thread.MAX_PRIORITY);

        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
    }
}
