import java.util.Scanner;

public class EmailParser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = input.nextLine();

        // Get the part before '@'
        String username = email.substring(0, email.indexOf('@'));

        // Split by '.'
        String[] parts = username.split("\\.");

        // Print first and last name
        System.out.println("First name: " + parts[0]);
        System.out.println("Last name: " + parts[1]);

        input.close();
    }
}
