
import java.util.Scanner;
public class Methods {
    static int sum(int a , int b){
        int c = a+b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x , y;
        System.out.println("Enter first number:");
        x = sc.nextInt();
        System.out.println("Enter second number:");
        y = sc.nextInt();
        Methods obj = new Methods();


        int result =   obj.sum(x,y);
        System.out.println("The result is: "+result);

    }
}
