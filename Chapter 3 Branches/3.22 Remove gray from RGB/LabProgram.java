import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      /* Type your code here. */
   Scanner scnr = new Scanner(System.in);
  
    int a;
    int b;
    int c;
    int output;
    
    a = scnr.nextInt();
    b = scnr.nextInt();
    c = scnr.nextInt();
    
        if( a <= b && a <= c)   {
           System.out.print(a-a + " ");
           System.out.print(b-a);
           System.out.println(" " + (c-a));
   }
        else if( b <= a && b <= c)   {
           System.out.print(a-b + " ");
           System.out.print(b-b);
           System.out.println(" " + (c-b));
   }
        else if( c <= a && c <= b)   {
           System.out.print(a-c + " ");
           System.out.print(b-c);
           System.out.println(" " + (c-c));
        }
        else {
           System.out.println("Error");
        }
   }
}