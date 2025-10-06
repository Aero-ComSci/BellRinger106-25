import java.util.Scanner;
public class EmailParser {

    public static void main(String[] args) {
        //Initializes a Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Email: ");
        String input = sc.nextLine();
        //Finds the index of the @ sign
        int index = input.indexOf("@");
        //Only takes the part of the string before the @ sign's index
        String newInput = input.substring(0, index);
        //Finds the index of the period
        int otherIndex = newInput.indexOf(".");
        //Makes one variable the stuff after the period's index, and the other stuff before
        String splitInput1 = newInput.substring(0, otherIndex);
        String splitInput2 = newInput.substring(otherIndex + 1);
        //Print out both names
        System.out.println("First Name: " + splitInput1 + " Last Name: " + splitInput2);
  
    }

}
