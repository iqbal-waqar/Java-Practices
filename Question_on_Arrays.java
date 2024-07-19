
import java.util.Scanner;
public class Question_on_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int range;
//        double sum = 0;
//        System.out.println("Enter the range:");
//        range = sc.nextInt();
//
//        float[] arr = new float[range];
//
//        System.out.println("Taking The values of array:");
//        for (int i = 0; i<range; i++){
//            arr[i] = sc.nextFloat();
//            sum = sum + arr[i];
//        }
//        System.out.println("Given Array :");
//        for (int i = 0; i<range; i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println("The total sum is : "+ sum);

//        Q#2
//        int range;
//        System.out.println("Enter the range:");
//        range = sc.nextInt();
//
//        int [] arr = new int[range];
//
//        System.out.println("Taking the values:");
//        for (int i = 0; i<range; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Given Array:");
//        for (int i = 0; i<range; i++){
//            System.out.println(arr[i]);
//        }
//        int key;
//        System.out.println("Enter the element to find");
//        key = sc.nextInt();
//
//        boolean found = false;
//
//        for (int i =0; i<range; i++){
//        if (key==arr[i]) {
//            found = true;
//            break;
//        }
//        }
//        if (found){
//            System.out.println("Given element is present!");
//        }
//        else{
//            System.out.println("Not present!");
//        }

//        Q#3
//        int range;
//        System.out.println("Enter the range:");
//        range = sc.nextInt();
//
//        int [] arr = new int[range];
//
//        System.out.println("Taking the values:");
//        for (int i = 0; i<range; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Given Array:");
//        for (int i = 0; i<range; i++){
//            System.out.println(arr[i]);
//        }
//        int max = arr[0];
//
//        for (int i =  0; i<range;i++){
//            if (max<arr[i]){
//                max = arr[i];
//            }
//        }
//        System.out.println("The maximun value in the array is : "+ max);

//        Q#4

//        int range;
//        System.out.println("Enter the range:");
//        range = sc.nextInt();
//
//        int [] arr = new int[range];
//
//        System.out.println("Taking the values:");
//        for (int i = 0; i<range; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Given Array:");
//        for (int i = 0; i<range; i++){
//            System.out.println(arr[i]);
//        }
//        int min = arr[0];
//
//        for (int i =  0; i<range;i++){
//            if (min>arr[i]){
//                min = arr[i];
//            }
//        }
//        System.out.println("The minimum value in the array is : "+ min);

//        Q#5

        int range;
        float sum = 0;
        System.out.println("Enter the range:");
        range = sc.nextInt();

        float [] marks = new float[range];

        System.out.println("Taking the marks of the students:");
        for (int i = 0; i<range; i++){
            marks[i] = sc.nextFloat();
            sum = sum+marks[i];
        }
        System.out.println("----Given NUmbers of Students in Physics----:");
        for (int i = 0; i<range; i++){
            System.out.println(marks[i]);
        }
        float avg = sum/range;
        System.out.println("THe total sum of numbers is "+sum);
        System.out.println("The average of the numbers of Students is "+avg);

    }
}
