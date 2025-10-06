import java.util.Scanner;
public class emailUser {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Email Address: ");
        String email = sc.nextLine();
        
        Scanner emailSC = new Scanner(email);
        emailSC.useDelimiter("@");
        String username = emailSC.next();
        
        Scanner userSC = new Scanner(username);
        userSC.useDelimiter("\\.");
        String firstName = userSC.next();
        String lastName = userSC.next();
        
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        
    }

}
