//In java ,Interfaces is a group of related methods
//with empty bodies.

//interface Animal{
//    public void eat();
//
//    default void greet(){
//        System.out.println("Hello");
//    }
//}
//
//interface Pet{
//    public void play();
//}
//
//interface Parrot extends Animal , Pet{
//    public void fly();
//}
//
//class Australian implements Parrot{
//    @Override
//    public void eat() {
//        System.out.println("Eating.....");
//    }
//
//    @Override
//    public void play() {
//        System.out.println("Playing......");
//    }
//
//    @Override
//    public void fly() {
//        System.out.println("Flying......");
//    }
//}
import java.util.Scanner;
interface Sum{
    public void add();
}

interface Subtract{
    public void minus();
}

interface Multiply{
    public void multiple();
}

interface Division{
    public void divide();
}

class Calculator implements Sum , Subtract , Multiply , Division{
    int num1 , num2;

    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();
        System.out.println("The sum is : "+(num1 + num2));
    }

    public void minus(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();
        System.out.println("The Subtraction is : " +(num1 - num2));
    }

    public void multiple(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();
        System.out.println("The MUltiplication is : "+(num1 * num2));
    }

    public void divide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();
        System.out.println("The Division is : "+(num1 / num2));
    }


}
public class Interfaces {
    public static void main(String[] args) {
//        Australian a1 = new Australian();
//
//        a1.eat();
//        a1.play();
//        a1.fly();
//        a1.greet();
        Calculator c1 = new Calculator();
        c1.multiple();
        c1.add();
    }
}
