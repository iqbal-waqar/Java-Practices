@FunctionalInterface
interface myNewInterface{
    void method1(int a);
//    void method2();
}
//class myNewClass implements myNewInterface{
//    @Override
//    public void method1() {
//        System.out.println("This is method - 1");
//    }
//
//    @Override
//    public void method2() {
//        System.out.println("This is method - 2");
//    }
//}

public class lambda_expression {
    public static void main(String[] args) {
//        myNewInterface m1 = new myNewClass();
//        m1.method1();

        myNewInterface m1 =(a)->{
            System.out.println("This is method 1 from lambda expression and value is : "+a);
        };
        m1.method1(10);
    }
}
