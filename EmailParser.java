
public class EmailParser {
    public static void main(String[] args) {
        String email = "micah.zhou@gmail.com";
        String name = email.split("@")[0];
        String last = name.replace(".", " ");
        System.out.println(last);
    }

}