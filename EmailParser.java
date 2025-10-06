
public class EmailParser {

    /**
     * @param email
     * @return 
     * @throws IllegalArgumentException 
     */
    public static String parseEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException("Email cannot be null.");
        }

        int atIndex = email.indexOf('@');
        if (atIndex <= 0) { 
            throw new IllegalArgumentException("Invalid email: missing or misplaced '@' symbol.");
        }

        String username = email.substring(0, atIndex).trim();
        if (username.isEmpty()) {
            throw new IllegalArgumentException("Invalid email: username is empty before '@'.");
        }

        String[] parts = username.split("\\.");
        if (parts.length < 2) { 
            throw new IllegalArgumentException("Invalid email username: expected at least one '.' between first and last name.");
        }

        String first = parts[0].trim();
        String last = parts[parts.length - 1].trim();

        if (first.isEmpty() || last.isEmpty()) {
            throw new IllegalArgumentException("Invalid email username: first or last name segment is empty.");
        }

        return first.toLowerCase() + " " + last.toLowerCase();
    }


    public static String parseEmailProperCase(String email) {
        String lower = parseEmail(email); 
        String[] parts = lower.split(" ");
        return proper(parts[0]) + " " + proper(parts[1]);
    }

    private static String proper(String s) {
        if (s == null || s.isEmpty()) return s;
        return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }


    public static void main(String[] args) {
        String[] tests = {
            "john.doe@example.com",
            "amanchi4850@mydusd.org",
            "avinashamanchi@gmail.com",         
            "eaadetailing.com",                
            "amanchi@yahoo.com",             
            ".amanchi.avinash@hotmail.com",        
            "amanchi@domain",                 
            null                         
        };

        for (String t : tests) {
            try {
                String parsed = parseEmail(t);
                String proper = parseEmailProperCase(t);
                System.out.printf("Input: %-30s -> parsed: %-15s | proper-cased: %s%n", t, parsed, proper);
            } catch (IllegalArgumentException e) {
                System.out.printf("Input: %-30s -> Error: %s%n", t, e.getMessage());
            }
        }
    }
}
