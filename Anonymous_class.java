interface myinterface{
    void meth1();
    void meth2();
}
//class myclass implements myinterface{
//    @Override
//    public void meth1() {
//        System.out.println("This is Method 1");
//    }
//    @Override
//    public void meth2() {
//        System.out.println("This is Method 2");
//    }
//
//}
public class Anonymous_class {
    public static void main(String[] args) {
//        myinterface m1 = new myclass();
//        m1.meth1();

        myinterface mf = new myinterface() {
            @Override
            public void meth1() {
                System.out.println("This is Method 1");

            }

            @Override
            public void meth2() {
                System.out.println("This is Method 2");

            }
        };
        mf.meth1();
    }
}
