import java.util.Scanner;

public class EmailParser
{
  public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Email: ");
        String email = sc.nextLine();
        int at = email.indexOf("@");
        String start = email.substring(0, at);
        System.out.println(start);
    }
}
