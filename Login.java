package learnjava;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        // Set the correct username and password
        String correctUsername = "student";
        String correctPassword = "year2";

        
        Scanner scanner = new Scanner(System.in);

        String username;
        String password;
        int attempts = 0;

        // Loop to prompt for username and password
        do {
        	
            System.out.print("Enter username: ");
            username = scanner.nextLine();

            System.out.print("Enter password: ");
            password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful!");
                break; // Exit the loop if login successful
            } else {
                System.out.println("Invalid username or password. Please try again.");
                attempts++; // Increment login attempts
            }
        } while (attempts < 3);

        // If 3 login attempts are reached, deny access
        if (attempts == 3) {
            System.out.println("Maximum login attempts reached. Access denied.");
        }

        scanner.close();
    }
}

