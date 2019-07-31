import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String firstName;
      String genericLocation;
      int wholeNumber;
      String pluralNoun;
   
      /* Type your code here. */
      
      firstName = scnr.next();
      genericLocation = scnr.next();
      wholeNumber = scnr.nextInt();
      pluralNoun = scnr.next();
   
      System.out.println(firstName + " went to " + genericLocation + " to buy " + wholeNumber + " different types of " + pluralNoun + ".");
   }
}
