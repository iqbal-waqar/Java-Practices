import java.util.Scanner;

class Myexception extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMesaage()";
    }
}

public class exception_class {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter the value : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a<50){
            try {
                throw new Myexception();
            }
            catch(Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e);
            }
        }
    }

}
