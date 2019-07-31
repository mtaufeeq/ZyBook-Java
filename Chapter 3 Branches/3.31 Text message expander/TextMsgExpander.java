import java.util.Scanner;

public class TextMsgExpander {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      
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
      System.out.println();
      
      if (text.indexOf(a) != -1)   {
         text = text.replace(a,f);
         System.out.println("Replaced \"" + a + "\" with \"" + f + "\".");
      }
      
      if (text.indexOf(b) != -1)   {
         text = text.replace(b,g);
         System.out.println("Replaced \"" + b + "\" with \"" + g + "\".");
      }
      
      if (text.indexOf(c) != -1)   {
         text = text.replace(c,h);
         System.out.println("Replaced \"" + c + "\" with \"" + h + "\".");
      }
      
      if (text.indexOf(d) != -1)   {
         text = text.replace(d,i);
         System.out.println("Replaced \"" + d + "\" with \"" + i + "\".");
      }
      
      if (text.indexOf(e) != -1)   {
         text = text.replace(e,j);
         System.out.println("Replaced \"" + e + "\" with \"" + j + "\".");
      }
    
      System.out.println();
      System.out.println("Expanded: " + text);

   }
}