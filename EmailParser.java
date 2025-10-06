public class EmailParser {
    public static String parseFullName(String email) {
        // 1) Validate input
        if (email == null) {
            throw new IllegalArgumentException("Email cannot be null.");
        }
        email = email.trim();
        if (email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be empty.");
        }

        // 2) Extract username
        int atIndex = email.indexOf('@');
        if (atIndex <= 0 || atIndex == email.length() - 1) {
            throw new IllegalArgumentException("Email must contain a single '@' with text on both sides.");
        }
        String username = email.substring(0, atIndex);

        // 3) Remove any "+" tags
        int plusIndex = username.indexOf('+');
        if (plusIndex != -1) {
            username = username.substring(0, plusIndex);
        }

        // 4) Validate presence of '.'
        if (!username.contains(".")) {
            throw new IllegalArgumentException("Username must contain a '.' separating first and last names.");
        }

        // 5) Split into parts
        String[] parts = username.split("\\.");
        if (parts.length < 2) {
            throw new IllegalArgumentException("Need both first and last names separated by '.'.");
        }

        String first = parts[0];
        String last = parts[parts.length - 1];

        if (first.isEmpty() || last.isEmpty()) {
            throw new IllegalArgumentException("First or last name is missing around the '.'.");
        }

        // 6) Capitalize first letters
        first = capitalize(first);
        last = capitalize(last);

        return first + " " + last;
    }

    // Helper method to capitalize first letter and make the rest lowercase
    private static String capitalize(String name) {
        if (name == null || name.isEmpty()) return name;
        return Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase();
    }

    // Simple manual tests
    public static void main(String[] args) {
        String[] samples = new String[] {
            "hrihaan.bhutani@gmail.com",
            "avi.amanchi@university.edu",
            "rishi.nell@example.com",
            "john.doe+newsletter@gmail.com",
            "alice@example.com",
            "noatsign.com"
        };

        for (String s : samples) {
            try {
                System.out.println(s + "  ->  " + parseFullName(s));
            } catch (IllegalArgumentException ex) {
                System.out.println(s + "  ->  ERROR: " + ex.getMessage());
            }
        }
    }
}
