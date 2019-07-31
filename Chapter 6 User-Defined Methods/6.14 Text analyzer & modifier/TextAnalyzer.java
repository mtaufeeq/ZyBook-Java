import java.util.Scanner;

public class TextAnalyzer {

         public static int getNumOfCharacters(String sentence)   {
         int count = 0;

            for(int i = 0; i < sentence.length(); i++)
            count++;
            return count;
         }

         public static String outputWithoutWhitespace(String sentence)   {
         String output = "";

         for(int i = 0; i < sentence.length(); i++)
         if(sentence.charAt(i) != ' ')
         output += sentence.charAt(i);
         return output;
         }
  

      public static void main(String[] args)   {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a sentence or phrase:");
         System.out.println();
         String sentence = sc.nextLine();
         System.out.println("You entered: " + sentence);
         System.out.println();
         System.out.println("Number of characters: " + getNumOfCharacters(sentence));

         System.out.println("String with no whitespace: " + outputWithoutWhitespace(sentence));
      }
}

