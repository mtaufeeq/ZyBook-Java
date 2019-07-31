import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      /* Type your code here. */
      int dollars = 100;             // number of cents in dollar
      int quarters = 25;             // number of cents in quarter
      int dimes = 10;                // number of cents in dime
      int nickels = 5;               // number of cents in nickel
      
      int cents;                               // total amount of cents
      int numDollars, numQuarters,             // number of dollars, quarters
          numDimes, numNickels;                // number of dimes, nickels
      int centsLeft;                           // cents left after coins

      Scanner sncr = new Scanner(System.in);
      cents = sncr.nextInt();
      
      numDollars = cents/dollars;
      centsLeft = cents % dollars;
      numQuarters = centsLeft/quarters;
      centsLeft = centsLeft % quarters;
      numDimes = centsLeft/dimes;
      centsLeft = centsLeft % dimes;
      numNickels = centsLeft/nickels;
      centsLeft = centsLeft % nickels;
      
      if (cents == 0 )
      {
         System.out.println("no change");
      }
      
      if (cents == 1 )
      {
         System.out.println(cents + " penny");
      }
      
      if (cents > 1 && cents < 5 )
      {
         System.out.println(cents + " pennies");
      }
      
      if (numDollars == 1)
      {
         System.out.println(numDollars + " dollar");
      }
      
      if (numDollars > 1)
      {
         System.out.println(numDollars + " dollars");
      }
      
      if (numQuarters == 1)
      {
         System.out.println(numQuarters + " quarter");
      }
      
      if (numQuarters > 1)
      {
         System.out.println(numQuarters + " quarters");
      }
      
      if ( numDimes == 1)
      {
         System.out.println(numDimes + " dime");
      }
      
      if ( numDimes > 1)
      {
         System.out.println(numDimes + " dimes");
      }
      
      if (numNickels == 1)
      {
         System.out.println(numNickels + " nickel");
      }
      
      if (numNickels > 1)
      {
         System.out.println(numNickels + " nickels");
      }
      
      if (centsLeft == 1 )
      {
         System.out.println(centsLeft + " penny");
      }
      
      if (centsLeft > 1  && centsLeft < 5)
      {
         System.out.println(centsLeft + " pennies");
      }
         
      }
}
