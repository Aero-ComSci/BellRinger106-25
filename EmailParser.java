import java.util.Scanner;

public class EmailParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test email input
        String email = scanner.nextLine();

        // Print input
        System.out.println(emailParser(email));
    }

    // Defines method for parsing the email
    public static String emailParser(String email) {
        // Gets everything in email before the @ symbol
        String handle = email.substring(0, email.indexOf("@"));

        // Gets everything in the handle before the period
        String firstName = handle.substring(0, handle.indexOf("."));
        // Gets everything in the handle after the period
        String lastName = handle.substring(handle.indexOf(".") + 1);

        // Prints extracted first and last name
        return firstName + " " + lastName;
    }
}
