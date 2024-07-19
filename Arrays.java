
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("1-Dimensional Array");
//        int range;
//        System.out.println("Enter the range of array: ");
//        range = sc.nextInt();
//        int[] arr = new int[range];
//        System.out.println("Enter the values in array:");
//        for (int i = 0; i<range; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Given Array:");
//        for (int i = 0; i<range; i++){
//            System.out.print(arr[i]);
//        }
//        int sum = 0;
//        System.out.println("2-Dimensional Array:");
//
//        int rows , cols;
//        System.out.println("Enter the number of Rows:");
//        rows = sc.nextInt();
//        System.out.println("Enter the number of Columns:");
//        cols = sc.nextInt();
//
//        int[][] arr = new int[rows][cols];
//
//        System.out.println("Enter the values");
//        for (int i = 0; i<rows; i++){
//            for (int j = 0; j<cols; j++){
//                arr[i][j] = sc.nextInt();
//                if (i==j){
//                    sum = sum + arr[i][j];
//                }
//            }
//        }
//        System.out.println("Given 2-D Array");
//        for (int i = 0; i<rows; i++){
//            for (int j = 0; j<cols; j++){
//                System.out.print(arr[i][j]+"  ");
//            }
//            System.out.print("\n");
//        }
//        System.out.println("The total sum is: "+sum);
        int range;
        System.out.println("Enter the range:");
        range = sc.nextInt();
        int[] arr = new int[range];
        System.out.println("Enter the values");
        for (int i = 0; i<range; i++){
            arr[i] = sc.nextInt();
        }
//        For-Each Loop
        System.out.println("Given array:");
        for (int element:arr){
            System.out.println(element);
        }

        System.out.println("In reverse order");
        for (int i = range-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
