import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      double fn;
      double r;
      double n;
      double fO;
      
      fO = scnr.nextDouble();
      
      r = Math.pow (2 , (1.0/12.0));
                  
      System.out.printf("%.2f ", fO);
      
      n = 1;
      fn = fO * Math.pow (r, n);
      
      System.out.printf("%.2f ", fn);
      
      fn = fO * Math.pow (r, 2);
      System.out.printf("%.2f ", fn);
      
      fn = fO * Math.pow (r, 3);
      System.out.printf("%.2f ", fn);
      
      fn = fO * Math.pow (r, 4);
      System.out.printf("%.2f\n", fn);
   
      
   }
}
