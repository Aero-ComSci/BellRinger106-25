public class EmailParser
{

    public static String ParseEmail(String email)
    {
        String username = email.split("@")[0];
        int Ind = username.indexOf('.')
        
        if (Ind != -1)
        {
            String FirstName = username.substring(0, Ind);
            String LastName = username.substring(Ind + 1);
            return FirstName + " " + LastName;
        }
        
        else
        {
            return "Wrong Format";
        }
    }

    public static void main(String[] args)
    {
        String email = "Jason.Zeng@gmail.com";
        String result = ParseEmail(email);
        System.out.println(email + ": " + result);
    }
}
