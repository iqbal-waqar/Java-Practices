import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        System.out.println("Calculating the percentage of a Student in Board Exams");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name os the student :");
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println("Enter the roll number os student");
        int rn = sc.nextInt();
        System.out.println(rn);

        System.out.println("Enter Marks in English");
        int e1 = sc.nextInt();
        System.out.println(e1);
        System.out.println("Enter Marks in Urdu");
        int u1 = sc.nextInt();
        System.out.println(u1);
        System.out.println("Enter Marks in Math");
        int m1 = sc.nextInt();
        System.out.println(m1);
        System.out.println("Enter Marks in Chemistry");
        int c1 = sc.nextInt();
        System.out.println(c1);
        System.out.println("Enter Marks in Islamiat");
        int i1 = sc.nextInt();
        System.out.println(i1);

        int sum = e1+u1+m1+c1+i1;
        System.out.println("The total marks out of 500 are :");
        System.out.println(sum);

        float percentage = (sum/500.0f)*100;

        System.out.println("THe Percentage is :"+ percentage + "%");
        sc.close();


    }

}
