public class EmailParser {

    // This method gets the first and last name from an email
    public static String getName(String email) {
        // Get the part before the @
        String username = email.substring(0, email.indexOf("@"));

        // Get the first and last name by splitting at the .
        int dot = username.indexOf(".");
        String first = username.substring(0, dot);
        String last = username.substring(dot + 1);

        // Return the names with a space
        return first + " " + last;
    }

    public static void main(String[] args) {
        
        String name = getName("john.doe@example.com");
        System.out.println(name); // Output: john doe
    }
}
