import java.util.Scanner;

public class BasicInput {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userInt;
      double userDouble;
      // FIXME Define char and string variables similarly
      char userChar;
      String userString;
      
      System.out.println("Enter integer:");
      userInt = scnr.nextInt();
      
      System.out.println("Enter double:");
      userDouble = scnr.nextDouble();
      
      System.out.println("Enter character:");
      userChar = scnr.next().charAt(0);
      
      System.out.println("Enter string:");
      userString = scnr.next();
      
      // FIXME (1): Finish reading other items into variables, then output the four values on a single line separated by a space
   
      System.out.print(userInt + " ");
      System.out.print(userDouble + " ");
      System.out.print("" + userChar);
      System.out.print(" " + userString);
      System.out.println();
      
      // FIXME (2): Output the four values in reverse
      
      System.out.print(userString + " ");
      System.out.print("" + userChar);
      System.out.print(" " + userDouble);
      System.out.print(" " + userInt);
      System.out.println();
      // FIXME (3): Cast the double to an integer, and output that integer
      
      int castInt = (int) userDouble;

      System.out.println(userDouble + " cast to an integer is " + castInt);
   }
}