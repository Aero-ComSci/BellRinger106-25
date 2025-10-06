public class EmailParser {
    public static String parseNameFromEmail(String e) {
        // gets the part before the @
        String user = e.split("@")[0].toLowerCase();
        
        // Split the username by the dot
        String[] n = user.split("\\.");

        // Put the first part and the second part together.
        return n[0].trim() + " " + n[1].trim();
    }

    public static void main(String[] args) {
        
        // My list of test emails.
        String[] tests = {
            "John.Doe@Example.com",
        };

        // Test loop.
        for (String email : tests) {
            System.out.println("Input: " + email);
            String result = parseNameFromEmail(email);
            System.out.println("Output: " + result);
        }
        System.out.println("Done");
    }
}
