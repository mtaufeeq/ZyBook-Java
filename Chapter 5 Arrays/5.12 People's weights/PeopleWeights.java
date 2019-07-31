import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      final int WEIGHTS = 5;             
      double[] userVals = new double[WEIGHTS];
      int i;  
      

      
      for (i = 0; i < WEIGHTS; ++i)
       { 
           System.out.println("Enter weight " + (i + 1) + ":");
           /*userVals[i] = scnr.nextInt();*/
           userVals[i]=scnr.nextDouble();
           /*System.out.println(userDouble[i]);*/
       }
      
      System.out.print("You entered: ");
      for (i = 0; i < userVals.length; ++i) {
          System.out.print(userVals[i] + " ");
      }
      
      System.out.println("\n")
      ;
     double totalWeight = 0.0;
      for (i = 0; i < userVals.length; ++i) {
         totalWeight = totalWeight + userVals[i];
      }
      
      System.out.println("Total weight: " + totalWeight);
      
      double avgWeight = 0.0;
      for (i = 0; i < userVals.length; ++i) {
         avgWeight = totalWeight/WEIGHTS;
      }
      System.out.println("Average weight: " + avgWeight);
      
      double maxWeight = 0.0;
      for (i = 0; i < userVals.length; ++i) {
         if ( maxWeight < userVals[i])   {
         maxWeight = userVals[i];
      }
      }
      System.out.println("Max weight: " + maxWeight);
        
   }
}