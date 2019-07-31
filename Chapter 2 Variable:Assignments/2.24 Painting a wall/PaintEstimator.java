import java.util.Scanner;
import java.lang.Math;     // Note: Needed for math functions in part (3)

public class PaintEstimator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double wallHeight;
      double wallWidth;
      double wallArea;
      double totalPaintNeeded;
      final double oneGallonCoversInFeet = 350;
      int noOfCansNeeded;
      double gallonsPerCan = 1.0;
      
      
      System.out.println("Enter wall height (feet):");
      wallHeight = scnr.nextDouble();
      
      System.out.println("Enter wall width (feet):");           // FIXME (1): Prompt user to input wall's width
      wallWidth = scnr.nextDouble();
      
      // Calculate and output wall area
      wallArea = wallHeight * wallWidth;                        // FIXME (1): Calculate the wall's area
      System.out.println("Wall area: " + wallArea + " square feet");             // FIXME (1): Finish the output statement
      
      // FIXME (2): Calculate and output the amount of paint in gallons needed to paint the wall
      
      totalPaintNeeded = wallArea / oneGallonCoversInFeet;
      System.out.println("Paint needed: " + totalPaintNeeded + " gallons");
      
      // FIXME (3): Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer

      noOfCansNeeded = (int) (totalPaintNeeded / gallonsPerCan) + 1;
      System.out.println("Cans needed: " + noOfCansNeeded + " can(s)"); 
      
   }
}