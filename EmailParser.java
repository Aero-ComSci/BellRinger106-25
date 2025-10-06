import java.util.Scanner;
public class EmailParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        EmailParser parser = new EmailParser();
        String result = parser.parseEmail(email);
        System.out.println(result);
    }

    public String parseEmail(String email) {
        String username = email.substring(0, email.indexOf('@'));
        String firstname = email.substring(0, email.indexOf('.'));
        String lastname = email.substring(email.indexOf('.') + 1, email.indexOf('@'));
        return (firstname + " " + lastname);
    }
}
