public class EmailParser {
    public static void main(String[] args) {
        // Test Case 1
        String testEmail1 = "sarah.connor@noemail.com";
        parseEmail(testEmail1);
        
        // Test Case 2
        String testEmail2 = "mike.wilson@mcdonalds.edu";
        parseEmail(testEmail2);
    }
    
    public static void parseEmail(String email) {
        System.out.println("Testing: " + email);
        
        // Extract username portion before '@'
        String username;
        try {
            username = email.split("@")[0];
            String domain = email.split("@")[1];
        } catch (Exception e) {
            System.err.println("No @");
            return;
        }
        
        // Split username by '.' to get first and last name
        String firstName;
        String lastName;
        try {
            firstName = username.split("\\.")[0];
            lastName = username.split("\\.")[1];
        } catch (Exception e) {
            System.err.println("No .");
            return;
        }
        
        // Output the parsed name
        System.out.println("Result: " + firstName + " " + lastName);
        System.out.println();
    }
}
