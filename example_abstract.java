
abstract class Shape{
    private String colour;

    public Shape(String c1){
        colour = c1;
    }

    public String getColour(){
        return colour;
    }

    public abstract double area();
}

class Circle extends Shape{

    private double radius;

    public Circle(String c1 , double r){
        super(c1);
        radius = r;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

}
public class example_abstract {
    public static void main(String[] args) {
        Circle c = new Circle("RED",5);
        System.out.println("The area is : "+ c.area());
        System.out.println("The Colour is : "+ c.getColour());
    }
}
