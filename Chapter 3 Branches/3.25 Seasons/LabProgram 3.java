import java.util.Scanner; 
import java.time.Month;

public class LabProgram {
   public static void main(String[] args) {
      final Scanner scnr = new Scanner(System.in);
      
      String monthName;
      int day;
      int output=0;
      
      monthName = scnr.next();
      day = scnr.nextInt();
      
      
      /* Type your code here. */
      try {
      output = Month.valueOf(monthName.toUpperCase()).getValue();
      if ( (output == 12) && (day >= 21) && (day  <= 31) )
         {
          System.out.println("winter");
         }
   else if ( (output == 1) && (day >= 1) && (day <= 31 ))   
         {
         System.out.println("winter");
         }
   else if ( (output == 2) && (day >= 1) && (day <- 29))   
         {
         System.out.println("winter");
         }
   else if ( (output == 3) && (day >= 1) && (day <= 19))   
         {
         System.out.println("winter");
         }
   else if ( (output == 3) && (day >=20 ) && (day <=31))   
         {
         System.out.println("spring");
         }
   else if ( (output == 4) && (day >= 1 ) && (day <= 30))   
         {
         System.out.println("spring");
         }
   else if ( (output == 5) && (day >=1 ) && (day <= 31))   
         {
         System.out.println("spring");
         } 
   else if ( (output == 6) && (day >=1 ) && (day <= 20))   
         {
         System.out.println("spring");
         } 
   else if ( (output == 6) && (day >=21 ) && (day <= 30))   
         {
         System.out.println("summer");
         }
   else if ( (output == 7) && (day >=1 ) && (day <= 31))   
         {
         System.out.println("summer");
         }
   else if ( (output == 8) && (day >=1 ) && (day <= 31))   
         {
         System.out.println("summer");
         }
   else if ( (output == 9) && (day >=1 ) && (day <= 21))   
         {
         System.out.println("summer");
         }
   else if ( (output == 9) && (day >=22 ) && (day <= 30))   
         {
         System.out.println("autumn");
         }
   else if ( (output == 10) && (day >=1 ) && (day <= 31))   
         {
         System.out.println("autumn");
         }
   else if ( (output == 11) && (day >=1 ) && (day <= 30))   
         {
         System.out.println("autumn");
         }
   else if ( (output == 12) && (day >=1 ) && (day <= 20))   
         {
         System.out.println("autumn");
         }
   else if ( (output == 1 ) || (output == 2 ) || (output == 3 ) ||
             (output == 4 ) || (output == 5 ) || (output == 6 ) ||
             (output == 7 ) || (output == 8 ) || (output == 9 ) ||
             (output == 10 ) || (output == 11) || (output == 12) && (day <= 0 )) {
         System.out.println("invalid");
             }
   else {
         System.out.println("invalid");
   }
      }
      catch (IllegalArgumentException e)
      {
         System.out.println("invalid");
      }
      
    
   }
   

}

