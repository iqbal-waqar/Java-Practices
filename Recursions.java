
import java.util.Scanner;
public class Recursions {
    static int factorial(int n){
//        factorial (n) = n * (n-1) *......1
//        factorial (5) = 5 * 4 * 3 * 2 * 1
//        factorial (n) = n * factorial (n-1)
        if (n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number to find the factorial of : ");
        num = sc.nextInt();
        System.out.println("The factorial of given number is : "+ factorial(num));


    }
}
