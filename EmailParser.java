import java.util.Scanner;  
public class EmailParser {
    public static void main(String[]args){
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter Email: ");
        String Email = Scan.nextLine();
        int index = Email.indexOf("@");
        String name = Email.substring(0,index);
        System.out.println(name);



    }
}
