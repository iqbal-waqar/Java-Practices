import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};

        System.out.println("Welcome to Rock-Paper-Scissors Game!");
        System.out.println("Enter your move (Rock, Paper, or Scissors): ");
        String userMove = sc.nextLine().trim();

        int computerIndex = random.nextInt(3);
        String computerMove = moves[computerIndex];

        System.out.println("You chose: " + userMove);
        System.out.println("Computer chose: " + computerMove);

        String result;
        if (userMove.equalsIgnoreCase(computerMove)) {
            result = "It's a tie!";
        } else if (userMove.equalsIgnoreCase("Rock") && computerMove.equals("Scissors") ||
                userMove.equalsIgnoreCase("Paper") && computerMove.equals("Rock") ||
                userMove.equalsIgnoreCase("Scissors") && computerMove.equals("Paper")) {
            result = "You win!";
        } else if (userMove.equalsIgnoreCase("Rock") && computerMove.equals("Paper") ||
                userMove.equalsIgnoreCase("Paper") && computerMove.equals("Scissors") ||
                userMove.equalsIgnoreCase("Scissors") && computerMove.equals("Rock")) {
            result = "Computer wins!";
        } else {
            result = "Invalid input!";
        }

        System.out.println(result);

    }
}
