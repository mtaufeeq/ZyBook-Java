import java.util.Scanner;

public class ParseStrings {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       while(true){

         System.out.print("Enter input string:\n");
         String s = scan.nextLine();

         if(s.equalsIgnoreCase("q")) {
           break;
         }
         else if (!s.contains(","))   {
         System.out.println("Error: No comma in string.");
         System.out.println();
         }
         else  {

         String firstName = s.split(",")[0].trim();
         String lastName = s.split(",")[1].trim();

         System.out.println("First word: "+firstName);

         System.out.println("Second word: "+ lastName);
         
         System.out.println();
         }

      }

   }

}