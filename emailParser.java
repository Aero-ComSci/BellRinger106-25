public class emailParser
public static String parseEmail(String email) {
  String username = email.split("@")[0];
  String[] nameSections = username.split("\\.");
  if(nameSections.length >= 2) {
    String firstName = nameParts[0];
    String lastName = nameParts[1];
    return firstName + "" + lastName;
  } else {
    return username;
  }
}
  public static void main(String[] args) {
    String email = "imsocool@email.com";
    String fullName = parseEmail(email);
    System.out.println(fullName);
    
    
    
