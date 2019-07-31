import java.util.Scanner;

public class TextMsgDecoder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      
      String text;
      String a = "BFF";
      String b = "IDK";
      String c = "JK";
      String d = "TMI";
      String e = "TTYL";
      
      String f = "best friend forever";
      String g = "I don't know";
      String h = "just kidding";
      String i = "too much information";
      String j = "talk to you later";
      
      System.out.println("Enter text:");
      text = scnr.nextLine();
         
      System.out.println("You entered: " + text);
           
      if (text.indexOf(a) != -1)   {
         System.out.println("BFF: " + f);
      }
      
      if (text.indexOf(b) != -1)   {
         System.out.println("IDK: " + g);;
      }
      
      if (text.indexOf(c) != -1)   {
         System.out.println("JK: " + h);
      }
      
      if (text.indexOf(d) != -1)   {
         System.out.println("TMI: " + i);
      }
      
      if (text.indexOf(e) != -1)   {
         System.out.println("TTYL: " + j);
      }

   }
}
