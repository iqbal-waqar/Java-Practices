
import java.util.Scanner;
class Distance{
    private int feet;
    private double inches;

    public Distance(int ft , float in){
        feet = ft;
        inches = in;
    }

    public void get(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter feet : ");
        feet = sc.nextInt();
        System.out.println("Enter inches : ");
        inches = sc.nextInt();
    }

    public void display(){
        System.out.println("Feets : "+feet);
        System.out.println("Inches : "+inches);
    }

   public Distance sum(Distance other){
        Distance temp = new Distance(0,0);
        temp.feet = feet + other.feet;
        temp.inches = inches + other.inches;

        if (temp.inches>=12){
            temp.inches = temp.inches - 12.0;
            temp.feet++;
        }
        if (temp.inches<0){
            temp.inches = temp.inches + 12.0;
            temp.feet--;
        }
        return temp;
   }

}
public class summing {
    public static void main(String[] args) {
            Distance d1 = new Distance(0,0);
            System.out.println("-------Distance 1---------");
            d1.get();
            d1.display();
            Distance d2 = new Distance(0,0);
            System.out.println("-------Distance 2---------");
            d2.get();
            d2.display();
            Distance d3 = new Distance(0,0);

            d3 = d1.sum(d2);
        System.out.println("--------Summing---------");

        d3.display();
    }

}
