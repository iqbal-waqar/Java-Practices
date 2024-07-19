
class Phone{
    public void greet(){
        System.out.println("Hello Waqar");
    }
    public void on(){
        System.out.println("Turning on the Phone....");
    }
}

class smartPhone extends Phone{
    public void hello(){
        System.out.println("Welcome to the Smartphone");
    }
    public void on(){
        System.out.println("Turning on the smartPhone....");
   }
}

public class dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Phone obj = new smartPhone();

        obj.on();
    }
}
