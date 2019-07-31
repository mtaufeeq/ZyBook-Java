import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int baseChar; 
      int headChar; 
      
      /* Type your code here. */
      baseChar=scnr.nextInt();
      headChar=scnr.nextInt();
      System.out.println("     "+headChar);
      for (int i=0;i<5;i++)
      {              
         System.out.print(baseChar);
      }  
      for (int j=0;j<2;j++)
      {
         System.out.print(headChar);
      }
      System.out.println("");
      for (int k=0;k<5;k++)
      {               
         System.out.print(baseChar);
      }  
      for (int l=0;l<3;l++)
      {
         System.out.print(headChar);
      }
      System.out.println("");
      for (int m=0;m<5;m++)
      {
         System.out.print(baseChar);
      }
      for (int n=0;n<2;n++)
      {
         System.out.print(headChar);
      }
      System.out.println("");
      System.out.println("     "+headChar);
      
   }
}

