import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        // Correct username and password

        String correctUsername = "Sujitha0318";
        String correctPassword = "suji#0318";

        // Input from user

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = sc.nextLine().trim(); // Remove extra spaces

        System.out.print("Enter your password: ");
        String password = sc.nextLine().trim(); // Remove extra spaces

        // Check if username and password are correct using equalsIgnoreCase for username

        if (username.equalsIgnoreCase(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful!");
        } else if (!username.equalsIgnoreCase(correctUsername)) {
            System.out.println("Username is incorrect.");
        } else {
            System.out.println("Password is incorrect.");
        }
    }
}
