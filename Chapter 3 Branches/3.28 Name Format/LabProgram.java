import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      /* Type your code here. */
    
     Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    String splits[] = name.split(" ");
    String firstName = splits[0];
    String middleName = splits[1];
    
    int count = splits.length;
    
    if(count == 2)
      System.out.println(middleName + ", " + firstName);
    
    else{
      String lastName = splits[2];
      System.out.println(lastName + ", " + firstName + " " + middleName.charAt(0) + ".");
    }
   }
}
