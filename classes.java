import java.util.Scanner;

class Bank {
    Scanner sc = new Scanner(System.in);
    private int accNo;
    private  String name;
    private double balance;

    public Bank(){
        balance = 0.0;
    }

    public void get_info() {
        System.out.println("Enter Your Account Number: ");
        accNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Your Name: ");
        name = sc.nextLine();
        System.out.println("Enter Your Balance: ");
        balance = sc.nextDouble();
    }
    public void deposit(double amt){
        balance = balance + amt;
        System.out.println("After Deposit : "+ balance);
    }
    void withdraw(double amt){
        if (balance>amt){
            balance = balance - amt;
            System.out.println("After Withdraw : "+ balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    public void display(){
        System.out.println("Account No : "+ accNo);
        System.out.println("Name : "+ name);
        System.out.println("Balance : "+ balance);
    }
}
    public class classes {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            Bank b1 = new Bank();
            b1.get_info();
            b1.display();
//            double amt1;
//            System.out.println("Enter amount to deposit");
//            amt1 = sc.nextDouble();
//
//            b1.deposit(amt1);

            double amt1;
            System.out.println("Enter amount to withdraw");
            amt1 = sc.nextDouble();

            b1.withdraw(amt1);

        }
    }

