import java.util.Scanner;

public Class EmailParser{
  public static void main(String[] args) {
    Scanner ss = new Scanner(system.in) 
    System.out.println("type in your email!")
    g = ss.nextLine();
    int a = g.indexOf("@");
    String b = g.substring(0,(int)(g));
    int t = b.indexOf(".");
    String c = b.substring(0,(int)(t));
    int p = b.length();
    String h = b.substring((int)(t),(int)(p));
    System.out.println(c+h) 
  }

}
