
import java.util.Scanner;
import java.util.Arrays;
public class Part_2_Array_Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Adding two matrices of size 2x3");
//        int rows , cols;
//        System.out.println("Enter the number of Rows :");
//        rows = sc.nextInt();
//        System.out.println("Enter the number of Columns:");
//        cols = sc.nextInt();

//        int[][] matrix1 = new int[2][3];
//        int[][] matrix2 = new int[2][3];
//        int[][] sum = new int[2][3];
//        System.out.println("Enter the values of Matrix 1");
//        for (int i = 0; i<2; i++){
//            for (int j = 0; j<3; j++){
//                matrix1[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("Enter the values of Matrix 2");
//        for (int i = 0; i<2; i++){
//            for (int j = 0; j<3; j++){
//                matrix2[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Matrix 1");
//        for (int i = 0; i<2; i++){
//            for (int j = 0; j<3; j++){
//                System.out.print(matrix1[i][j]+"  ");
//            }
//            System.out.print("\n");
//        }
//
//        System.out.println("Matrix 2");
//        for (int i = 0; i<2; i++){
//            for (int j = 0; j<3; j++){
//                System.out.print(matrix2[i][j]+"  ");
//            }
//            System.out.print("\n");
//        }
//
//        for (int i = 0; i<2; i++){
//            for (int j = 0; j<3; j++){
//
//                sum[i][j] = matrix1[i][j]+matrix2[i][j];
//            }
//        }
//        System.out.println("Matrices after Addition");
//        for (int i = 0; i<2; i++){
//            for (int j = 0; j<3; j++){
//                System.out.print(sum[i][j]+" ");
//
//            }
//            System.out.print("\n");
//        }

//        System.out.println("Checking array is sorted or not");
//
//        int range;
//        System.out.println("Enter the range:");
//        range = sc.nextInt();
//
//        int[] arr = new int[range];
//        System.out.println("Enter the values in the array:");
//
//        for (int i = 0;i<range;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("The array is:");
//
//        for (int i = 0;i<range;i++){
//            System.out.print(arr[i]+"  ");
//        }
//        boolean is_sort = true;
//        for (int i = 0;i<range-1;i++){
//            if (arr[i]>arr[i+1]){
//                is_sort = false;
//                break;
//            }
//        }
//        System.out.println();
//        if (is_sort){
//            System.out.println("The Array is sorted!");
//        }
//        else{
//            System.out.println("Not Sorted!");
//        }

        System.out.println("Sorting the array");
        int range;
        System.out.println("Enter the range:");
        range = sc.nextInt();

        int[] arr = new int[range];
        System.out.println("Enter the values in the array:");

        for (int i = 0;i<range;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is:");

        for (int i = 0;i<range;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("-------The sorted array is ----------");
        for (int i = 0;i<range;i++){
            System.out.print(arr[i]+"  ");
        }


    }
}
