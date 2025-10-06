public class EmailParser{
    // Function to parse an email and return "firstname lastname"
    public static String parseEmail(String email){
        // parsing process by splitting from @
        String user = email.split("@")[0];
        String[] names = user.split("\\.");
        return names[0] + " " +names[1];
    }
    // testing function
    public static void main(String[] args){
        String email1 = "john.doe@example.com";
        System.out.println(parseEmail(email1));

    }
    
}