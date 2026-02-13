public class vijayesh {
    public static void main(String[] args) {
        //example emails
        String email1 = "vijayeshnandavvvng@gmail.com";
        String email2 = "daily.question123@gmail.com";
        String email3 = "nachiappan.thenappan.nachiappan@gmail.com";
        System.out.println(parseEmail(email1));
        System.out.println(parseEmail(email2));
        System.out.println(parseEmail(email3));
    }
  
    public static String hivijayesh(String email) {
        //if theres no @ then its invalid
        int findtheat = email.indexOf('@');
        if (atIndex == -1) {
            return "Invalid email (missing @)";
        }
      
        String user = email.substring(0, atIndex);
        String[] parts = username.split("\\.");
      // split w the dot
        if (parts.length < 2) {
            return "email invalid (missing the .)";
        }
      // no dot= invalid
        String first = parts[0];
        String last = parts[1];
        first = first.toLowerCase();
        last = last.toLowerCase();
        return first + " " + last;
    }
}
