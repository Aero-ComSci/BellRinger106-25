import java.util.Scanner;

public class EmailParser {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Please input an email address");
        String Email= sc.nextLine(); //reads user input for email address
        int atsymbol= Email.indexOf("@");
        String start=Email.substring(0,atsymbol);
        System.out.print("The start is" + Email);




    }
}
