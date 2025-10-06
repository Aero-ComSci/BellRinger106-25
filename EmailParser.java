import java.util.Scanner;

public class EmailParser {
    // This method gets first and last name from the email
    public static String parseEmail(String email) {
        // Get the part before the @
        String username = email.substring(0, email.indexOf('@'));
        // Split the username by the dot
        String[] parts = username.split("\\.");
        // Combine first and last name with a space
        return parts[0] + " " + parts[1];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an email address: ");
        String email = input.nextLine();
        System.out.println("Parsed name: " + parseEmail(email));
        input.close();
    }
}
