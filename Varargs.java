public class Varargs {
//    static int sum(int a  , int b){
//        int res;
//        res = a+b;
//        return res;
//    }
//    static int sum(int a  , int b, int c){
//        int res;
//        res = a+b+c;
//        return res;
//    }static int sum(int a  , int b , int c , int d){
//        int res;
//        res = a+b+c+d;
//        return res;
//    }

//    Varargs

    static int sum(int ...arr){
        int result = 0;
        for (int a:arr){
            result = result + a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Learning Varargs in Java ");
        System.out.println("The sum of nothing is : "+sum());
        System.out.println("The sum of 1 is : "+sum(1));
        System.out.println("The sum of numbers is : "+sum(4,5));
        System.out.println("The sum of numbers is : "+sum(4,5,6));
        System.out.println("The sum of numbers is : "+sum(4,5,7));

    }
}
