
import java.util.Scanner;
import java.util.Random;

public class Practicing_RPS_Game {
    public static void main(String[] args) {
        System.out.println("--We are Going to make Rock, Paper , Scissors Game--");
        Scanner sc = new Scanner(System.in);
        Random r1 = new Random();

        String[] moves = {"Rock" , "Paper" , "Scissors"};

        System.out.println("Enter Your Move :");
        String usermove = sc.nextLine();


        int comp_index = r1.nextInt(3);
        String comp_move = moves[comp_index];

        System.out.println("Your Move : "+ usermove);
        System.out.println("Computer's Move : "+ comp_move);

        String result;

        if (usermove.equalsIgnoreCase("Rock") && comp_move.equals("Scissors")
        || usermove.equalsIgnoreCase("Paper") && comp_move.equals("Rock")
        || usermove.equalsIgnoreCase("Scissors") && comp_move.equals("Paper")){
            result = "You Won!";
        }
        else if (usermove.equalsIgnoreCase("Scissors") && comp_move.equals("Rock")
        || usermove.equalsIgnoreCase("Rock") && comp_move.equals("Paper")
        || usermove.equalsIgnoreCase("Paper") && comp_move.equals("Scissors")){
            result = "Computer Won!";
        }
        else{
            result = "Invalid Input";
        }
        System.out.println(result);
    }
}
