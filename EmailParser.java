public class EmailParser {
    //create a function that takes in an email and returns the first and last name
    public static String parseEmailForName(String email) {
        int atsign = email.indexOf('@');
        String username = email.substring(0, atsign);

        int dot = username.indexOf('.');
        String firstName = username.substring(0, dot);
        String lastName = username.substring(dot + 1);

        String output = firstName + " " + lastName;
        return output;
    }

    //main function to test the parseEmailForName function with the john.doe@gmail.com email
    public static void main(String[] args) {
        String email = "john.doe@gmail.com";
        String name = parseEmailForName(email);
        System.out.println(name);
    }
}
