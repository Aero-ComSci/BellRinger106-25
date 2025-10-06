import java.util.Scanner;

public class EmailParser {
    public static void main(String[] args) {
        System.out.print("Enter an email: ");
        Scanner s = new Scanner(System.in); 
        String email = s.nextLine(); // this askas user for input
        String e = (""+email).trim(); // this makes it a stireng just in case and removes the spaces
        String u = e.split("@",2)[0]; // this splits at the @ and takes thee part before it
        String p = u + "."; //this adds a dot so the next split has atleast two parts 
        String[] parts = p.split("\\.",3); // this splits at the dots th elimti is 3 cus we only need the first two parts
        String name = (parts[0] + " " + parts[1]).trim(); // combines the first two parts and adds a space. it also removes any unnsesayr space
        System.out.println(name); //prints it

        s.close();
    }
}
