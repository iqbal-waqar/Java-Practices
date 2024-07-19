
class NegativeradiusException extends  Exception{
    @Override
    public String toString() {
        return "Negative Radius Exception.No Negative radius";
    }
}

public class throw_throws {
    public static double area(double r)throws NegativeradiusException {
        if (r<0){
            throw new NegativeradiusException();
        }
        return Math.PI * r * r;
    }
//    public static int division(int a , int b)throws ArithmeticException{
////        Made by waqar
//        int result = a/b;
//        return result;
//    }
    public static void main(String[] args) {
//        used by rohail
        try {
//            int c = division(6, 0);
//            System.out.println(c);

            double radius = area(-4);
            System.out.println(radius);
        }
        catch(Exception e){
            System.out.println("Exception Occured!.....");
            System.out.println(e);
        }

    }
}
