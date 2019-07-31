import java.util.Scanner;

public class NumSquared {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;
      int userNumSquared;
      
      userNum = scnr.nextInt();
      
      userNumSquared = userNum * userNum;   // Bug here; fix it when instructed
      
      System.out.println(userNumSquared);   // Output formatting issue here; fix it when instructed
   }
}