public class EmailParser {
    public static void main(String[] args) {

        // Example email address
        String email = "jack.johnson@gmail.com";

        // Check if email contains '@' and '.'
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Invalid email. Must contain '@' and '.'");
            return;
        }

        // Get the part before the '@'
        int atIndex = email.indexOf("@");
        String namePart = email.substring(0, atIndex);  // e.g., "jack.johnson"

        // Check if namePart contains a dot
        if (!namePart.contains(".")) {
            System.out.println("Invalid name format. Must be 'first.last'");
            return;
        }

        // Split the name using '.'
        String[] parts = namePart.split("\\.");

        // Check if both parts exist
        if (parts.length != 2) {
            System.out.println("Invalid name format.");
            return;
        }

        // Get first and last names
        String firstName = parts[0];
        String lastName = parts[1];

        // Print the result
        System.out.println(firstName + " " + lastName);
    }
}
