import java.util.Scanner;

class InvalidinputException extends Exception{
    @Override
    public String toString() {
        return "Invalid Input Exception!...";
    }
}
class Dividebyzero extends Exception{
    @Override
    public String toString() {
        return "Exception!...Cannot Divide BY 0";
    }
}
class Maxmultiplication extends Exception{
    @Override
    public String toString() {
        return "Exception!...Number cannot exceed 7000";
    }
}
class MaxinputException extends Exception{
    @Override
    public String toString() {
        return "Exception!... Input cannot reach over 10000";
    }
}
class Calculator1{
    public int a;
    public int b;
//    private double c;
    public void sum()throws InvalidinputException , MaxinputException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value : ");
        a = sc.nextInt();
        System.out.println("Enter second value : ");
        b = sc.nextInt();
        if (a == 8 || b == 9) {
            throw new InvalidinputException();
        }
        else if (a>10000 || b>10000){
            throw new MaxinputException();
        }
        else {
            System.out.println("The sum is : " + (a + b));
        }
    }
    public void subtract() throws MaxinputException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value : ");
        a = sc.nextInt();
        System.out.println("Enter second value : ");
        b = sc.nextInt();
         if (a>10000 || b>10000){
            throw new MaxinputException();
        }
        else {
             System.out.println("The sum is : " + (a - b));
         }
    } public void multiplication()throws Maxmultiplication , MaxinputException{

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value : ");
        a = sc.nextInt();
        System.out.println("Enter second value : ");
        b = sc.nextInt();
        if (a>7000 || b>7000){
            throw new Maxmultiplication();
        }
        else if (a>10000 || b>10000){
            throw new MaxinputException();
        }
        else {
            System.out.println("The sum is : " + (a * b));
        }
    } public void division()throws Dividebyzero , MaxinputException{

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value : ");
        a = sc.nextInt();
        System.out.println("Enter second value : ");
        b = sc.nextInt();
        if (b==0){
            throw new Dividebyzero();
        }
        else if (a>10000 || b>10000){
            throw new MaxinputException();
        }
        else {
            System.out.println("The sum is : " + (a / b));
        }
    }

    }


 class custom_calculator {
     public static void main(String[] args) throws InvalidinputException , Maxmultiplication , Dividebyzero , MaxinputException {
         Calculator1 c1 = new Calculator1();
         try {
             c1.division();
         }
         catch(Dividebyzero e){
             System.out.println(e.toString());
         }
         catch(MaxinputException e){
             System.out.println(e.toString());
         }

     }
}
