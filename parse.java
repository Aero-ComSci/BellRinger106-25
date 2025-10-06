import java.util.Scanner;

public class parse {
    public static String parseEmail(String email) {
        String username = email.split("@")[0];

        String[] names = username.split("\\.");

        return names[0] + " " + names[1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        System.out.println(parseEmail(email));
    }
}
