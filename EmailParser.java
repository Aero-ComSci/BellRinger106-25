public class EmailParser {
    public static String parseEmail(String email) {
        if (email == null || !email.contains("@")) {
            return "invalid email: missing the '@' symbol";
        }
        String username = email.split("@")[0];
        if (!username.contains(".")) {
            return "invalid username: missing '.' to separate first and last name";
        }
        String[] nameParts = username.split("\\.");
        if (nameParts.length != 2) {
            return "invalid username: should contain exactly one '.' separating first and last name";
        }
        return nameParts[0] + " " + nameParts[1];
    }
    public static void main(String[] args) {
        System.out.println(parseEmail("sriram.kannan@example.com"));
        System.out.println(parseEmail("rishi.nellipudi@domain.com"));
        System.out.println(parseEmail("pranav@domain.com"));
        System.out.println(parseEmail("matthew.liu@example"));
        System.out.println(parseEmail("jayanth.vinay.veerapandyaman@domain.com")); 
    }
}
