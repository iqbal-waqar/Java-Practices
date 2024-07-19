
import java.util.Scanner;
public class Loops_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you have to find sum upto :");
        int a = sc.nextInt();
//        int sum = 0;

//        for (int i = 0; i<a; i++){
//            for (int j = i; j<a; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }


//        for (int i = 1; i<=a; i++){
//            System.out.println(i);
//            sum = sum + i;
//        }
//        System.out.println("The total sum is: "+ sum);


//        for (int i = 10; i>=1; i--){
//            System.out.println(a +" * "+ i +" = "+ a*i);
//        }

        int fact = 1;

//        for (int i = 1; i<=a; i++){
//            fact = fact*i;
//        }
//        System.out.println("The factorial of number is: "+fact);
//        int i = 1;
//        while (i<=a){
//            fact = fact * i;
//            i++;
//        }
//        System.out.println("The factorial of number is: "+fact);

        int sum = 0;
        for (int i = 1; i<=10; i++){
            System.out.println(a+ " * "+i+ " = " +a*i);
            sum = sum + (a*i);
        }
        System.out.println("The sum of Answers is : "+sum);
   }

}
