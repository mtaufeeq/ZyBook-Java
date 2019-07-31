import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      long phoneNumber;
    
      // Add more variables as needed
      long tmpVal;
      long prefixNum;
      long areaCode;
      long lineNum;

      phoneNumber = scnr.nextLong();
      
      /* Type your code here. */
      
      tmpVal = phoneNumber / 10000;
      prefixNum = tmpVal % 1000;
      
      areaCode = phoneNumber / 10000000;
      
      
      lineNum = phoneNumber % 10000;
      
      System.out.print(areaCode +"-");
      System.out.print(prefixNum +"-");
      System.out.println(lineNum);
      
   }
}
