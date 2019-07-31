import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      int num3;
      /* Type your code here. */
      
      int avg;
      int product;
      double avg1;
      double product1;
      
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      num3 = scnr.nextInt();
      
      avg = (num1 + num2 + num3) / 3;
      product = (num1 * num2 * num3);
      
      System.out.print(avg + " ");
      System.out.println(product);
      
      avg1 = (num1 + num2 + num3) / 3.0; 
      product1 = (long) (num1 )* (long) (num2) *(long) (num3);
      
      
      System.out.printf("%.2f ", avg1);
      System.out.printf("%.2f\n", product1);
      
   }
}
