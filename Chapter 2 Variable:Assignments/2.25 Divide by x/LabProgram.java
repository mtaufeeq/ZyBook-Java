import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      /* Type your code here. */
      int userNum;
      int x;
      
      userNum = scnr.nextInt();
      x = scnr.nextInt();
      
      userNum = userNum / x;
      System.out.print(userNum + " ");
      
      userNum = userNum /  x;
      System.out.print(userNum + " ");
      
      userNum = userNum /  x;
      System.out.print(userNum + " ");
      
      userNum = userNum /  x;
      System.out.println(userNum);
      
      
   }
}
