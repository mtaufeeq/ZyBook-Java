import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double x;
      double y;
      double z;
      /* Type your code here. */
      double r1;
      double r2;
      double r3;
      double r4;
      double r5;
      double r6;
      double r7;
      
      x = scnr.nextDouble();
      y = scnr.nextDouble();
      z = scnr.nextDouble();
      
      r1 = Math.pow(x,y);
      System.out.print(r1 + " ");
     
      r2 = Math.pow(y,z);
      r3 = Math.pow(x,r2);
      System.out.print(r3 + " ");
      
      r4 = Math.abs(x);
      System.out.print(r4 + " ");
      
      r5 =x*y;
      r6 = Math.pow(r5,z);
      r7 = Math.sqrt(r6);
      System.out.println(r7);
      
  
   }
}
