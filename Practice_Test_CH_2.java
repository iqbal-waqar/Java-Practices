

//Question no 1 :Write a java program to encrypt a grade by adding 8 to it.
//Decrypt it to show the actual grade.

//Question no 2 : Use comparison operators to find out wheather
//a given number is greater than user entered number or not?

import java.util.Scanner;
public class Practice_Test_CH_2 {
    public static void main(String[] args) {
//        char grade = 'B';
//        grade = (char)(grade + 8);
//        System.out.println(grade);
//
//        grade = (char)(grade - 8);
//        System.out.println(grade);
        Scanner sc = new Scanner(System.in);
        int a = 15;
        System.out.println(a);
        System.out.println("Enter a number to check");
        int b = sc.nextInt();

        System.out.println(b>a);

    }
}
