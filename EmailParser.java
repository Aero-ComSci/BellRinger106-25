public class EmailParser {
    public static String parseEmailToName(String email) {
        //get position of '@'
        int atIndex = email.indexOf('@');

        //get the part before '@'
        String username = email.substring(0, atIndex);

        //split username by '.'
        String[] parts = username.split("\\.");

        //return first and last name joined by space
        return parts[0] + " " + parts[1];
    }

    public static void main(String[] args) {
        //test case
            String email = "john.doe@example.com";

            System.out.println("Input: " + email);
            System.out.println("Output: " + parseEmailToName(email));
    }
}
