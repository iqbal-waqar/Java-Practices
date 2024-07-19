import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        System.out.println("Enter the first number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        System.out.println("Enter Second Number :");
        int b = sc.nextInt();
        System.out.println(b);

        System.out.println(a>b && b<a);
    }
}
