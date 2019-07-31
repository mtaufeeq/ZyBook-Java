import java.util.Scanner;

public class TextMsgAbbreviation {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      
      String input;
      String a;
      String b;
      String c;
      String d;
      String e;
      
      a = "LOL";
      b = "IDK";
      c = "BFF";
      d = "IMHO";
      e = "TMI";
      
      input  = scnr.nextLine();
      System.out.println("Input an abbreviation:");
      
      if (input.compareTo(a) == 0) {
         System.out.println("laughing out loud");
      }   
      else if (input.compareTo(b) == 0) {
         System.out.println("I don't know");
      }
      else if (input.compareTo(c) == 0) {
         System.out.println("best friends forever");
      }
      else if (input.compareTo(d) == 0) {
         System.out.println("in my humble opinion");
      }
      else if (input.compareTo(e) == 0) {
         System.out.println("too much information");
      }
      else   {
         System.out.println("Unknown");
      }
   }
}