import java.util.Scanner;

public class EmailParser{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String userEmail = scanner.nextLine();
        //User input

        int period = userEmail.indexOf(".");
        int atSign = userEmail.indexOf("@");
        //Meant to find these symbols in the input.

        String fullName = userEmail.substring(0, period) + userEmail.substring(period, atSign);
    }

}
