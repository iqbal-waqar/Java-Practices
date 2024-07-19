import java.util.Scanner;
interface introduction{
    void intro();
}

interface marks {
    int[] marks_in_subs();
}
interface average extends introduction , marks{
    void avg();
}

class Myself implements average{
    int sum;
    Scanner sc = new Scanner(System.in);
    public void intro(){
        System.out.println("Enter your name : ");
        String n = sc.nextLine();
        System.out.println("Enter your Age : ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your study : ");
        String s = sc.nextLine();
    }

    public int[] marks_in_subs(){
        int [] key = new int[5];
        System.out.println("Enter your Marks : ");
        for (int i = 0; i<5; i++){
            key[i] = sc.nextInt();
            sum = sum + key[i];
        }
        return key;
    }

    public void avg(){
        System.out.println("The total marks out of 500 : " + sum);
        float averg = sum / 5.0f;
        System.out.println("The average is : "+averg);
    };
}
public class inheritance_in_interfaces {
    public static void main(String[] args) {
        Myself a1 = new Myself();
        a1.intro();
        a1.marks_in_subs();
        a1.avg();
    }
}
