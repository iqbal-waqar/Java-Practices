

//Q no 1 :Write a program to convert a string to lower case
//Q no 2 :Write a program to Replace spaces with underscores
//Q no 3 :Write a program to Replace the given template
// Dear <name> , Thanks alot! ; replace the <name> with (some name)
//Q no 2 :Write a program to Detect double and triple spaces in a sentence

import java.util.Scanner;
public class String_Practice_Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the string in upper case :");
//        String name = sc.nextLine();
//
//        String value = name.toLowerCase();
//        System.out.println("String to lower case :");
//        System.out.println(value);

//        String name = "    Waqar    ";
//        System.out.println(name);
//        String value = name.replace(" ", "_");
//        System.out.println(value);

//        String oldLine = "Dear <name> , Thanks alot!";
//        System.out.println(oldLine);
//
//        String value = oldLine.replace("<name>" , "Waqar");
//        System.out.println(value);

        String name = "This is  Java   Programming";
        System.out.println(name);
        int value1 = name.indexOf("  ");
        int value2 = name.indexOf("   ");
        System.out.println(value1);
        System.out.println(value2);



    }
}
