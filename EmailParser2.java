public class EmailParser2 {
    public static void main(String[] args){
        String email = "venkat.surya@example.com"; 
        String username = email.substring(0, email.indexOf("@")); 
        String[] splitted = username.split("\\."); 
        System.out.println(splitted[0]+" "+splitted[1]); 
        



    }
}
