public class Testuser {

    // method email return name
    public static String main(String email) {
        // before @
        String username = email.substring(0, email.indexOf("@"));

        // split by .
        String[] nameParts = username.split("\\.");

        // return name
        return nameParts[0] + " " + nameParts[1];
    }

    public static void main(String[] args) {
        // test email
        String result = main("john.doe@example.com");
        System.out.println(result);
    }
}
