import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      
      /* Type your code here. */
      Scanner scnr = new Scanner (System.in);
      int years;
      int weight;
      int heartRate;
      int time;
      double caloriesMen;
      double caloriesWomen;
      
      years = scnr.nextInt();
      weight = scnr.nextInt();
      heartRate = scnr.nextInt();
      time = scnr.nextInt();
      
      caloriesMen = (((years * 0.2017) - (weight * 0.09036) + (heartRate * 0.6309) - 55.0969) * time / 4.184);
      caloriesWomen = (((years * 0.074) - (weight * 0.05741) + (heartRate * 0.4472) - 20.4022) * time / 4.184);
      
      System.out.printf("Men: %.2f calories\n", caloriesMen);
      System.out.printf("Women: %.2f calories\n", caloriesWomen);
      
      
   }
} 
