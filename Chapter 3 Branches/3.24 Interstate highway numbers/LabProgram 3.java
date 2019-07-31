import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int hwy;
      int output;

      hwy = scnr.nextInt();
      
      /* Type your code here. */
   if ((hwy<=0) || (hwy >999))   {
      System.out.println(hwy +" is not a valid interstate highway number.");
   }
   else if (((hwy>0) && (hwy <= 99)) && (hwy % 2 == 0))   {
       System.out.println("The " + hwy + " is primary, going east/west.");
   }
   else if (((hwy>0) && (hwy <= 99)) && (hwy % 2 != 0))  {
      System.out.println("The " + hwy + " is primary, going north/south.");
   }
   
   else if (((hwy>=100) && (hwy <=999)) && (hwy % 2 == 0))   {
       output = Integer.parseInt(Integer.toString(hwy).substring(1,3));
       System.out.println("The " + hwy +" is auxiliary, serving the " + output + ", going east/west.");
   }
   else  {
       output = Integer.parseInt(Integer.toString(hwy).substring(1,3));
       System.out.println("The " + hwy +" is auxiliary, serving the "+ output + ", going north/south.");
   }
   
}
}
