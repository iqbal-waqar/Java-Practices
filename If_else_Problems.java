
import java.util.Scanner;

public class If_else_Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("------Checking the result------");
//        System.out.println("Enter Marks in OOP");
//        int a1 = sc.nextInt();
//        System.out.println("Enter Marks in Calculus");
//        int a2 = sc.nextInt();
//        System.out.println("Enter Marks in Linear");
//        int a3 = sc.nextInt();
//
//        int total = a1+a2+a3;
//        System.out.println("Total Marks out of 300 : "+ total);
//
//        float avg = total / 3.0f;
//        System.out.println("The average is : "+ avg);
//
//        if (avg>=40 && a1>=33 && a2>=33 && a3>=33){
//            System.out.println("You are Passed!");
//        }
//        else {
//            System.out.println("You are Failed!");
//        }


        System.out.println("Checking The days in week : ");
        System.out.println("Enter the number:");
        int a = sc.nextInt();

        if (a==1){
            System.out.println("Monday");
        }
        else if (a==2){
            System.out.println("Tuesday");
        }
        else if (a==3){
            System.out.println("Wednesday");
        }
        if (a==4){
            System.out.println("Thursday");
        }
        if (a==5){
            System.out.println("Friday");
        }
        if (a==6){
            System.out.println("Saturday");
        }
        if (a==7){
            System.out.println("Sunday");
        }

    }
}
