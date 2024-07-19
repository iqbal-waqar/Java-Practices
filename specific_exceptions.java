import java.util.Scanner;
class Array{
    int size = 20;
    int [] arr = new int[size];

    public void getinfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values in array: ");
        for (int i = 0; i<8; i++){
            arr[i] = sc.nextInt();
        }
    }
    public void display(){
        System.out.println("Your array is : ");
        for (int i = 0; i<8; i++){
            System.out.print(arr[i] + " ");;
        }
        System.out.println();
    }

    public void operation(){
        Scanner sc = new Scanner(System.in);
        int ind;
        int number;

        System.out.println("Enter the index of array : ");
        ind = sc.nextInt();
        System.out.println("Enter the number for multiplying : ");
        number = sc.nextInt();

        try {
            System.out.println("THe array index is : " + arr[ind]);
            System.out.println("After multiplication : " + arr[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception occured!");
            System.out.println(e);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Index Out Of Bounds Exception occured!");
            System.out.println(e);
        }catch (Exception e){
            System.out.println("Some exception occured!");
            System.out.println(e);
        }
    }
}

public class specific_exceptions {
    public static void main(String[] args) {
        Array a1 = new Array();
        a1.getinfo();
        a1.display();
        a1.operation();
    }
}
