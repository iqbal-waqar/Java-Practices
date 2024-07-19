
import java.util.Scanner;
public class String_Methods {
    public static void main(String[] args) {
//        String name = "waqar";
//        System.out.println(name);
//        int value = name.length();
//        String value = name.toUpperCase();
//        String value = name.toLowerCase();
//        System.out.println(value);

//        String nontrimmed = "   Waqar     ";
//        System.out.println(nontrimmed);
//        String value = nontrimmed.trim();
//        System.out.println(value);

//        String name = "Waqar";
//        String value = name.substring(3);
//        System.out.println(value);
//        String value = name.substring(1,4);
//        System.out.println(value);

//        String value = name.replace('q','r');
//        System.out.println(value);

//        boolean value = name.startsWith("qa"); //False
//        System.out.println(value);
//        boolean value = name.endsWith("ar"); //True
//        System.out.println(value);
//        char value = name.charAt(2);
//        int value = name.indexOf('q');
//        System.out.println(value);
//        int value = name.indexOf('a',2);
//        System.out.println(value);
        Scanner sc = new Scanner(System.in);
        String name = "Waqar";
        System.out.println(name);
        System.out.println("Enter the String to check if it is equal or not:");
        String newName = sc.nextLine();
        System.out.println(newName);

        System.out.println(newName.equalsIgnoreCase(name));



    }
}
