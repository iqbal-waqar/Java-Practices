import java.util.Scanner;

class Shape1{
    protected double dim1;
    protected double dim2;

    public Shape1(double d1 ,double d2){
        dim1 = d1;
        dim2 = d2;
    }

    public void getdim(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dim1 : ");
        dim1 = sc.nextDouble();
        System.out.println("Enter Dim2 : ");
        dim2 = sc.nextDouble();
    }

    public void setdim(){
        System.out.println("Dim1 : " + dim1);
        System.out.println("Dim2 : " + dim2);
    }

}

class Rectangle extends Shape1{
    public Rectangle(int d1 , int d2){
        super(d1 , d2);
    }
    void area(){
        System.out.println("The area of Rectange is : "+ dim1*dim2);
    }
}
//
//class Square extends Shape1{
//    public Square(int d1 , int d2){
//        super(d1 , d2);
//    }
//
//}
class Circle1 extends Shape1{
    public Circle1(int d1){
        super(d1 , -1);
    }
    void area(){
        System.out.println("Area of Circle : "+Math.PI*dim1*dim1);
    }
}

public class packages {
    public static void main(String[] args) {
//        Circle1 c = new Circle1(0);
//        c.getdim();
//        c.area();
        Rectangle r = new Rectangle(0 , 0);
        r.getdim();
        r.area();
    }
}
