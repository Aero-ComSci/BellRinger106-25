import java.util.Scanner;

public class bellbinger106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enter Email Input
        String email = scanner.nextLine();

        System.out.println(namePrinter(email));

        scanner.close();

    }
    public static String namePrinter(String email) { 
        // finds eveyrhting before the @ symbol
        String split = email.substring(0, email.indexOf("@"));
        //Finds eveything before the .
        String beforeDot = split.substring(0, email.indexOf("."));
        //Finds the word after the dot
        String afterDot = split.substring(email.indexOf(".") + 1);

        return beforeDot +  afterDot;

    }
}