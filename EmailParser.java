public class EmailParser {

    /**
     * Parses an email address and returns the first and last name.
     * Expected format: firstname.lastname@domain.com
     *
     * @param email the email address to parse
     * @return the formatted name or an error message
     */
    public static String parseEmail(String email) {
        // Step 1: Check if the email is null or empty
        // null means no value or no imput and empty means no characters so we have to furst check if the email is empty by using this if statement
        if (email == null || email.trim().isEmpty()) {
            return "Invalid email: input is empty";
        }

        // Step 2: Check if the email contains '@' symbol
        // we use the indexOf method to find the position of the '@' symbol in the email string. If it returns -1, it means the symbol is not present.
        int atIndex = email.indexOf("@");
        if (atIndex == -1) {
            return "Invalid email: missing '@' symbol";
        }

        // Step 3: Extract the username part before the '@' symbol
        // we use the substring method to extract the part of the email string from the beginning up to (but not including) the position of the '@' symbol.
        String username = email.substring(0, atIndex);

        // Step 4: Check if the username contains '.' character
        // we use the split method to divide the username into parts based on the '.' character. If the resulting array does not have exactly two elements, it means the username is not in the expected format.
        String[] names = username.split("\\.");
        if (names.length != 2) {
            return "Invalid email: username should contain exactly one '.'";
        }

        // Step 5: Capitalize first and last names
        // we call the capitalize method to format both the first and last names properly. this was optional though
        String firstName = capitalize(names[0]);
        String lastName = capitalize(names[1]);

        // Step 6: Return the formatted full name

        return firstName + " " + lastName;
    }

    /**
     * Capitalizes the first letter of a name and makes the rest lowercase.
     *
     * @param name the name to format
     * @return the capitalized name
     */
    // helper method to capitalize the first letter of a name and make the rest lowercase
    private static String capitalize(String name) {
        if (name == null || name.isEmpty()) {
            return name;
        }
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    // Sample test cases
    public static void main(String[] args) {
        System.out.println(parseEmail("john.doe@example.com"));     // Output: John Doe
        System.out.println(parseEmail("JANE.SMITH@domain.com"));    // Output: Jane Smith
        System.out.println(parseEmail("invalidemail.com"));         // Output: Invalid email: missing '@' symbol
        System.out.println(parseEmail("no_dot@domain.com"));        // Output: Invalid email: username should contain exactly one '.'
    }
}
