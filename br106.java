public class br106{
    public static void main(String[] args){
        String email = "firstlast@gmail.com";
        // creating new string
        email = email.substring(0, 5) + "." + email.substring(5);
        //adding "." in the 5th index

        System.out.println(email.substring(0,10));
        //prints first and last name

        System.out.println(email.substring(0,5));
        System.out.println(email.substring(6,10));
        //printing first and last name individually

        if (!email.contains("@") || !email.contains(".")) {
            email = email + "@gmail.com";
        }
        //conditional if it doesnt contain @ or . then add @gmail.com

        System.out.println(email);
    }

}
