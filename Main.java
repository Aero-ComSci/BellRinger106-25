import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your email address: ");
        String email = input.nextLine();
        try {
            int atIndex = email.indexOf("@");
            String username = email.substring(0, atIndex);
            String[] parts = username.split("\\.");
            System.out.println("First name: " + parts[0]);
            System.out.println("Last name: " + parts[1]);
        } catch (Exception e) {
            System.out.println("You have entered an an invalid format of email. You have enter your email in this format: firstname.lastname@domain.com");
        }
        input.close();
    }
}
