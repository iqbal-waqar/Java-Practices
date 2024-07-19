
import java.util.Scanner;
public class Problems_Methods {
//    static void multiple(int n){
//        System.out.println("Table:");
//        for (int i = 1; i<=10; i++){
//            System.out.println(n+ " * " +i+ " = "+ n*i);
//        }
//    }
//    static void pattern(int n){
//        for (int i=0;i<n;i++){
//            for (int j = 0;j<i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
    static int sum(int n){
        if (n==1){
            return 1;
        }
        else{
            return n + sum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num = sc.nextInt();
//        multiple(num);
//        pattern(num);
        System.out.println("Sum "+sum(num));

    }
}
