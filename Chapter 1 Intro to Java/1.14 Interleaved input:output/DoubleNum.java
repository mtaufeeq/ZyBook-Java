import java.util.Scanner;

public class DoubleNum {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int x;
      
      System.out.println("Enter x: ");
      x = scnr.nextInt();
      
    // Student mistakenly is echo'ing the input to output to match example
      System.out.println("x doubled is: " + (2 * x));
   }
}