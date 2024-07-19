import java.util.Scanner;

class Person{
    private int id;
    private String name;
    private String address;

    public Person(int i , String n , String a) {
        id = i;
        name = n;
        address = a;
    }
        public void get(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter ID: ");
             id = sc.nextInt();
             sc.nextLine();
             System.out.println("Enter Name: ");
             name = sc.nextLine();
             System.out.println("Enter Address: ");
             address = sc.nextLine();
        }

        public void display(){
            System.out.println("Name : "+name);
            System.out.println("ID : "+id);
            System.out.println("Address : "+address);
        }
    }
    class Student extends Person{
    private int rollnumber;
    private int marks;

    public Student(int i , String n , String a , int rn , int m){
        super(i,n,a);
        rollnumber = rn;
        marks = m;
    }
    public void get(){
        super.get();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Number : ");
        rollnumber = sc.nextInt();
        System.out.println("Enter your Marks : ");
        marks = sc.nextInt();
    }
        public void display(){
                super.display();
            System.out.println("Roll Number : "+rollnumber);
            System.out.println("Marks : "+marks);
        }
}
class Scholarship extends Student{
    private String scholarshipname;
    private int amount;

    public Scholarship(int i , String n , String a , int rn , int m , String sn , int amt){
        super(i,n,a,rn,m);
        scholarshipname = sn;
        amount = amt;
    }

    public void get() {
        super.get();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Scholarship Name : ");
        scholarshipname = sc.nextLine();
        System.out.println("Enter the amount : ");
        amount = sc.nextInt();
    }

    public void display() {
        super.display();
        System.out.println("Scholarship Name : "+scholarshipname);
        System.out.println("AMount : "+amount);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Scholarship s1 = new Scholarship(0,"","",0,0,"",0);
        s1.get();
        s1.display();

    }
}
