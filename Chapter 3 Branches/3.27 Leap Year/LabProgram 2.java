import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int year;
      boolean leap;
      
      leap = false;
      year = scnr.nextInt();
      
      /* Type your code here. */
      if(year % 4 == 0)    {
      if( year % 100 != 0)   {
            leap = true;
      } else if   ( year % 400 == 0)   {
         leap = true;
      }}
        if(leap)   
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
   }
}
