import java.util.Scanner;

public class EmailParser {
    public static void main(String[] args) {
        String sampleEmail = "bobby.jones@gmail.com";
        String user = sampleEmail.split("@")[0];
        String[] parts = user.split("\\.");
        String firstName = parts[0];
        String lastName = parts[1];
        System.out.println(firstName + " " + lastName);
    }
}
