import java.util.Scanner;

public class BasicInput {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userInt;
      double userDouble;
      char userChar;
      String userString;
      // FIXME Define char and string variables similarly
      
      System.out.println("Enter integer:");
      userInt = scnr.nextInt();
      
      // FIXME (1): Finish reading other items into variables, then output the four values on a single line separated by a space
   
      System.out.println("Enter double:");
      userDouble = scnr.nextDouble();
      
      System.out.println("Enter character:");
      userChar = scnr.next().charAt(0);
      
      System.out.println("Enter string:");
      userString = scnr.next();
      
      System.out.print(userInt + " ");
      System.out.print(userDouble + " ");
      System.out.print("" + userChar);
      System.out.println(" " + userString);
      
      // FIXME (2): Output the four values in reverse
      
      System.out.print(userString + " ");
      System.out.print("" + userChar);
      System.out.print(" " + userDouble);
      System.out.println(" " + userInt);
      
      // FIXME (3): Cast the double to an integer, and output that integer
      
     int Cast = (int) userDouble;
      
      System.out.println(userDouble + " cast to an integer is " + Cast);
      
   }
}