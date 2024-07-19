
import java.util.Scanner;
public class Examples_Recursion_Methods {
//    static int fibonacci(int n){
//        if (n<=1){
//            return n;
//        }
//        else{
//            return fibonacci(n - 1) + fibonacci(n - 2);
//        }
//    }
    static int power(int b, int e){
        if (e==0){
            return 1;
        }
        else if (e>0){
            return b * power(b , e-1);
        }
        else{
            return 1 /  power(b , -e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number upto which you want fibonacci series: ");
//        int num;
//        num = sc.nextInt();
//        System.out.println("Fibonacci Series: ");
//        for (int i = 0; i < num; i++){
//            System.out.print(fibonacci(i)+"  ");
//        }
        int num;
        int pow;
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        System.out.println("Enter the power: ");
        pow = sc.nextInt();
        double result = power(num , pow);
        System.out.println("The number calculated is : "+ result);

    }
}
