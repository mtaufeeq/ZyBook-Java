import java.util.Scanner;

public class PlayerRoster {
   public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
      int[][] players = new int[5][2];
      boolean keepAlive = true;
      char input;
      
      for (int i = 0; i < 5; i++) {
         System.out.println("Enter player " + (i+1) + "'s jersey number:");
         players[i][0] = scan.nextInt();
         System.out.println("Enter player " + (i+1) + "'s rating:");
         players[i][1] = scan.nextInt();
         System.out.println();
      }
      outputRoster(players, 0);
      
      while (keepAlive) {
         outputMenu();
         input = scan.next().charAt(0);
         if (input == 'q') {
            keepAlive = false;
            break;
         } else if (input == 'o') {
            outputRoster(players, 0);
         } else if (input == 'u') {
            System.out.println("Enter a jersey number:");
            int jerseyNum = scan.nextInt();
            System.out.println("Enter a new rating for the player:");
            int newRating = scan.nextInt();
            for (int l = 0; l < 5; l++) {
               if (players[l][0] == jerseyNum) {
                  players[l][1] = newRating;
               }
            }
         } else if (input == 'a') {
            System.out.println("Enter a rating:");
            int rating = scan.nextInt();
            outputRoster(players, rating);
         } else if (input == 'r') {
            System.out.println("Enter a jersey number:");
            int jerseyNum = scan.nextInt();
            boolean exists = true;
            for (int l = 0; l < 5; l++) {
               if (players[l][0] == jerseyNum) {
                  System.out.println("Enter a new jersey number:");
                  players[l][0] = scan.nextInt();
                  if(scan.hasNextInt())  {
                  System.out.println("Enter a rating for the new player:");
                  players[l][1] = scan.nextInt();
                  }
                  else;
                  break;
               }
            }
            
         }
      }
      
      return;
   }
   
   public static void outputRoster(int[][] players, int min) {
      System.out.println(((min>0) ? ("ABOVE " + min) : ("ROSTER")));
      int item = 1;
      for (int[] player : players) {
         if (player[1] > min) {
            System.out.println("Player " + item + " -- Jersey number: " + player[0] + ", Rating: " + player[1]);
         }
         item++;
      }
      System.out.println();
   }
   
   public static void outputMenu() {
      System.out.println("MENU");
      System.out.println("u - Update player rating");
      System.out.println("a - Output players above a rating");
      System.out.println("r - Replace player");
      System.out.println("o - Output roster");
      System.out.println("q - Quit\n");
      System.out.println("Choose an option:");  
   }
}