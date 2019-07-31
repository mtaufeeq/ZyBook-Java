import java.util.Scanner; 

public class DrawHalfArrow {
   public static void main(String[] args) {
        int arrowBaseHeight = 0;
      int arrowBaseWidth = 0;
      int arrowHeadWidth = 0;
      
     
         Scanner scnr = new Scanner(System.in);
         System.out.println("Enter arrow base height:");
         arrowBaseHeight = scnr.nextInt();
            
         System.out.println("Enter arrow base width:");
         arrowBaseWidth = scnr.nextInt();
while (arrowHeadWidth <= arrowBaseWidth) {
         System.out.println("Enter arrow head width:");
         arrowHeadWidth = scnr.nextInt();
}
         System.out.println();
      for (int i = 0; i < arrowBaseHeight; i++) {
         System.out.print("");
         for (int j = 0; j < arrowBaseWidth; j++) {
            System.out.print("*");                 
         }
            System.out.println();
      }
      for (int f=arrowHeadWidth; f > 0; f--) {
         for (int k=0; k < f; k++) {
         System.out.print("*");
         }
         System.out.println();
         
      }
   }
}