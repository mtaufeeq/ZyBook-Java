import java.util.Scanner;

public class TowersOfHanoi{

    public static void solve(int n, String start, String auxiliary, String end)

    {

        //Base Case - When n = 1 Move the disc from start pole to end pole

        if(n==1)

            System.out.println(start+" -> "+end);

        else

        {

            /*we need to move n-1 discs from the start pole to the auxiliary pole, the auxiliary pole becomes the end pole and the end pole becomes the auxiliary pole.*/

            solve(n-1,start,end,auxiliary);

            //Move the largest disc at the bottom from the start pole to the end pole

            System.out.println(start+" -> "+end);

            //the auxiliary pole becomes the start pole and the start pole becomes the auxiliary pole

            solve(n-1,auxiliary,start,end);

        }

    }

    public static void main(String[] args)

    {

        Scanner sc = new Scanner(System.in); //Initialize scanner

        System.out.print("Enter number of discs: "); // ask user to enter no. of disks

        int n = sc.nextInt(); //store it in n

        //call solve method passing the number of discs and the strings for the tower names

        solve(n,"A","B","C");

    }

}
