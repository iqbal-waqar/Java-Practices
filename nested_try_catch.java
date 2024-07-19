import  java.util.Scanner;
public class nested_try_catch {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;

        Scanner sc = new Scanner(System.in);
        int index;
        boolean flag = true;
        while(flag){
        System.out.println("Enter the index : ");
        index = sc.nextInt();
        try {
            System.out.println("Welcome to JAVA!.....");
            try {
                System.out.println(arr[index]);
                flag = false;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.println("Exception Level 2");
            }
        }
        catch(Exception e){
            System.out.println("Exception level 1");
        }
        }
        System.out.println("Thanks for using JAVA!.....");

    }
}
