import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      double milesPerGallon;
      double dollarsPerGallon;
      double gasCost;
      
      milesPerGallon = scnr.nextDouble();
      dollarsPerGallon = scnr.nextDouble();
      
      gasCost = dollarsPerGallon / milesPerGallon;
      
      System.out.printf("%.2f ", 10 * gasCost);
      System.out.printf("%.2f ", 50 * gasCost);
      System.out.printf("%.2f\n", 400 * gasCost);
   }
}
