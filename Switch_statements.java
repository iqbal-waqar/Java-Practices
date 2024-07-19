
import java.util.Scanner;

public class Switch_statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your age:");
        age = sc.nextInt();

//        if (age>18){
//            System.out.println("You are experienced");
//        }
//        else if (age>16){
//            System.out.println("You are on way!");
//        }
//        else{
//            System.out.println("You are not experienced!");
//        }

        switch (age){
            case 18:
                System.out.println("You rae experienced!");
                break;
            case 16:
                System.out.println("You are on way!");
                break;
            case 13:
                System.out.println("Tou are not experienced!");
                break;
            default:
                System.out.println("Enjoy man!");
        }
    }
}
