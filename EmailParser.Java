import java.util.*;
import java.util.stream.Collectors;
import java.util.Locale;

public final class EmailParser {

    private EmailParser() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Parses an email address and returns "first last" (lowercased).
     * Username must contain at least two non-blank dot-separated parts.
     */
    public static String parseName(String email) {
        if (email == null) {
            throw new NullPointerException("Email cannot be null.");
        }

        email = email.trim();
        if (email.isBlank()) {
            throw new IllegalArgumentException("Email is blank.");
        }

        int atIndex = email.indexOf('@');
        if (atIndex <= 0 || atIndex == email.length() - 1) {
            throw new IllegalArgumentException("Email must be of the form username@domain.");
        }
        if (atIndex != email.lastIndexOf('@')) {
            throw new IllegalArgumentException("Email must contain exactly one '@'.");
        }

        String username = email.substring(0, atIndex).trim();
        if (username.isBlank()) {
            throw new IllegalArgumentException("Username missing before '@'.");
        }

        // OPTIONAL: handle plus-addressing like "john.doe+alerts"
        // int plus = username.indexOf('+');
        // if (plus >= 0) username = username.substring(0, plus);

        List<String> parts = Arrays.stream(username.split("\\."))
                .filter(p -> p != null && !p.isBlank())
                .collect(Collectors.toList());

        if (parts.size() < 2) {
            throw new IllegalArgumentException("Username must contain a '.' separating first and last names.");
        }

        String first = parts.get(0).toLowerCase(Locale.ROOT);
        String last  = parts.get(parts.size() - 1).toLowerCase(Locale.ROOT);
        return first + " " + last;
    }

    public static void main(String[] args) {
        String[] samples = {
            "john.doe@example.com",        // "john doe"
            "Jane.Doe@corp.co",            // "jane doe"
            "first..last@example.com",     // "first last"
            "admin@example.com",           // ERROR (no dot)
            "noatsign.com",                // ERROR (no @)
            " .@example.com",              // ERROR (no two name parts)
            "only.first.@example.com"      // "only first"
        };

        Arrays.stream(samples).forEach(email -> {
            try {
                String parsed = parseName(email);
                System.out.printf("%-30s -> %s%n", email, parsed);
            } catch (Exception e) {
                System.out.printf("%-30s -> ERROR: %s%n", email, e.getMessage());
            }
        });
    }
}
