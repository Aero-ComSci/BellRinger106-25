public class EmailParser {
    public static String parseEmail(String email) {


        String[] emailParts = email.split("@");


        String username = emailParts[0];
        String[] nameParts = username.split("\\.");

        String firstName = nameParts[0].toLowerCase();
        String lastName = nameParts[1].toLowerCase();
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        System.out.println(parseEmail("john.doe@example.com"));      
    }
}
