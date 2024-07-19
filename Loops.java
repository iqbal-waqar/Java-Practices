
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Making Table ");
//        int a;
//        System.out.println("Enter the number you want table of :");
//        a = sc.nextInt();
//        int i = 1;
//        while(i<=10){
//            System.out.println(a + " * " + i  + " = "+ a*i);
//            i++;
//        }
//        do {
//            System.out.println(a + " * " + i  + " = "+ a*i);
//            i++;
//        }while(i<=10);

//        for (int i = 1; i<=10; i++){
//            System.out.println(a + " * " + i  + " = "+ a*i);
//        }
// Break Statements
//        for (int i = 0; i<=10; i++){
//            System.out.println(i);
//            if (i==5){
//                System.out.println("Ending the loop");
//                break;
//            }
//        }

        for (int i = 0; i<=5; i++){
            if (i==2){
                System.out.println("Ending");
                continue;
            }
            System.out.println("Hello Bro");
        }
    }
}
