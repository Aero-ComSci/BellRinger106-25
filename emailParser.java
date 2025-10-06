public class emailParser {
    public static String parseEmail(String email) {
        String username = email.split("@")[0]; //parsing the username
        String[] names = username.split("\\.");
        return names[0] + " " + names[1];
    }

    public static void main(String[] args) {
        String email1 = "vaidehi.akbari@gmail.com";      
        String email2 = "cool.cornball@gmail.com";   
// Test cases
        System.out.println(parseEmail(email1));          //vaidehi akbari
        System.out.println(parseEmail(email2));          //cool cornball
    }
}
