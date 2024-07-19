import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LoginSystem {
    private String username;
    private String password;

    public LoginSystem() {}

    public void login(Scanner scanner) {
        System.out.print("Enter email: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            LocalDateTime d1 = LocalDateTime.now();
            DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy");

            String myDate = d1.format(df);
            System.out.println("Logged in at " + myDate);
            System.out.print("Press enter to logout: ");
            scanner.nextLine();
            logout();
        } else {
            System.out.println("Invalid credentials");

        }
    }

    public void logout() {
        LocalDateTime d1 = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy --- E hh:mm a");
        String myDate = d1.format(df);
        System.out.println("Logged out at " + myDate);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginSystem loginSystem = new LoginSystem();
        System.out.println("Login:");
        loginSystem.login(scanner);
    }
}