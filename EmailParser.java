import java.util.Scanner;
public class EmailParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input scanner
        String email = sc.nextLine();
        //get email
        EmailParser parser = new EmailParser();
        //initialize object
        String result = parser.parseEmail(email);
        //call function
        System.out.println(result);
        //print result
    }

    public String parseEmail(String email) {
        String username = email.substring(0, email.indexOf('@'));
        //seperate username from email adres beyond @
        String firstname = email.substring(0, email.indexOf('.'));
        //firstname from all text before .
        String lastname = email.substring(email.indexOf('.') + 1, email.indexOf('@'));
        //lastname from text between . and @(non included)
        return (firstname + " " + lastname);
        //return firstname lastname
    }
}
