public class EmailParser {
    public static String theCoolparser(String email) {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            return "This email lwky sucks";
        }
        String username = email.substring(0, email.indexOf('@'));
        String[] partsOfUsername = username.split("\\."); //this thing splits the string into an array of substrings whenever there is a . https://docs.oracle.com/javase/8/docs/api/java/lang/String.html 

        if (partsOfUsername.length != 2) {
            return "This email lwky sucks";
        }

        return partsOfUsername[0].toLowerCase() + " " + partsOfUsername[1].toLowerCase();
    }

    public static void main(String[] args) {
        String email1 = "john.doe@example.com";
        System.out.println(theCoolparser(email1)); 
    }
}
