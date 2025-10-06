import java.util.Scanner;

public class EmailParser {

    public static String parseName(String mail) {
        // find index of '@' symbol
        int atIndex = mail.indexOf('@');

        // get name before '@'
        String username = mail.substring(0, atIndex);

        // split name by '.' to separate names
        String[] names = username.split("\\.");

        // return first and last name if . exists and there is something following it
        if (names.length >= 2) {
            return names[0] + " " + names[1];
        } else {
            return "expected 'firstname.lastname'";
        }
    }

    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);

        // prompt user for input
        System.out.print("Your email address: ");
        String userinput = scanner.nextLine();

        // parse name from email
        String fullName = parseName(userinput);

        // result
        System.out.println("Parsed name: " + fullName);
    }
}
