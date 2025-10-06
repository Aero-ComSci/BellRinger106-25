public class EmailParser {
    public static void main(String[] args) {
        String por;
        try {
            por = args[0].split("@")[0];
            String dummy = args[0].split("@")[1];
        } catch (Exception e) {
            System.err.println("No @");
            return;
        }
        String first;
        String last;
        try {
            first = por.split("\\.")[0];
            last = por.split("\\.")[1];
        } catch (Exception e) {
            System.err.println("No .");
            return;
        }
        System.out.println(first + " " + last);
    }
}
