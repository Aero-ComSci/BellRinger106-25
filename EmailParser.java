importjava.utill.Scanner;
public class EmailParser{
    public static void main(String[] args){
        Scanner scanner = new Scaner(system.in);
        System.out.println("type in your email");
        x = scanner.nextline();
        int a = x.indexof("@");
        String b = x.substring(0,(int)(a));
        int t = b.indexof(".");
        n = b.substring(0, (int)(t));
        int i = b.length();
        last = b.substring((int)(t),(int(i)));
        System.out.println(str(i)+last);
    }
}
