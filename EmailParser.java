public class EmailParser {

    // Function that parses an email and returns "firstname lastname"
    public static String parseEmail(String email) {
        // find the index of '@' 
        int atIndex = email.indexOf('@');
        String username = email.substring(0, atIndex);

        // Find the index of '.' 
        int dotIndex = username.indexOf('.');

        // split the first and last names 
        String firstName = username.substring(0, dotIndex);
        String lastName = username.substring(dotIndex + 1);

        // returning them with a space
        return firstName + " " + lastName;
    }

    // testing the function
    public static void main(String[] args) {
        System.out.println(parseEmail("john.doe@example.com"));  
        System.out.println(parseEmail("mary.smith@school.org"));
    }
}
