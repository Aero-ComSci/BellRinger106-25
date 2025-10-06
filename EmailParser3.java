import java.util.Scanner; 

public class EmailParser3 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in); 
       System.out.println("enter a email");
       String email = sc.nextLine(); 
       int i = email.indexOf("@"); 
       String first = email.substring(0,i); 
       System.out.println("The email starts with: "+ first); 
        
        
    
    }
}
