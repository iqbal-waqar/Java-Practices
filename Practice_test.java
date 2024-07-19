import java.util.Scanner;
public class Practice_test {
    public static void main(String[] args) {
        System.out.println("Converting Kilometres to Miles");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the kilometeres");
        int k1 = sc.nextInt();
        System.out.println(k1);

        float miles = k1* 0.621371f;

        System.out.println("The value in Miles is:");
        System.out.println(miles);

    }
}
