// BellRinger106-25
// Checklist: Parsing an Email Address in Java
// Students should complete the following steps to implement a Java function that parses an email address and returns the first and last name:

//  Create a new Java class (e.g., EmailParser).
//  Write a function that accepts an email address string as an argument.
//  Extract the portion before the '@' symbol (the username).
//  Split the username by the '.' character to separate first and last names.
//  Return the first name and last name as a single string (e.g., "firstname lastname").
//  Test the function using sample email addresses (e.g., "john.doe@example.com" should return "john doe").
//  Handle basic error cases (e.g., email not containing '.' or '@'). - NO LONGER DONE
//  Document your code with comments explaining each step.

import java.util.Scanner;
//Br stands for breaking down relevant info

public class Br {

    public static String ask(Scanner scanner, String prompt) {

        ///Definelet nto stolen form my mad libs 
        System.out.print(prompt + ": ");
        return scanner.nextLine();
    }

    public static void main(String[] arg){


       Scanner sc = new Scanner(System.in); 
//Takingg in the input 

    try{
       String email = ask(sc, "email");

       int firstSpl = email.indexOf('@');

       int secondSpl = email.indexOf('.');

       //int maxL = email.length();

       ///Using subtrings to find the firs and last name 

       String firstName = email.substring(0, secondSpl); 

       String lastName = email.substring(secondSpl + 1, firstSpl); 
//Printingg out the final result 
       System.out.println( firstName  + " "  + lastName);  } 
//Stolen try and cath syntax from the back alleys of the 
    catch (Exception e ){ 

        System.out.println( "Sorry buster brown its time to  put in the email correctly and try again later ");
    }


    

    }

    


    



}
