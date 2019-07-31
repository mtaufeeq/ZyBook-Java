import java.util.Scanner;
import java.util.ArrayList;


public class ShoppingCartManager {

    //Implement the printMenu() method. printMenu() has a ShoppingCart parameter,
    // and outputs a menu of options to manipulate the shopping cart.
    // Each option is represented by a single character. Build and output the menu within the method.

    public static char printMenu(ShoppingCart shoppingCart, Scanner scnr) {
        System.out.println ("MENU");
        System.out.println ("a - Add item to cart");
        System.out.println ("d - Remove item from cart");
        System.out.println ("c - Change item quantity");
        System.out.println ("i - Output items' descriptions");
        System.out.println ("o - Output shopping cart");
        System.out.println ("q - Quit");
        System.out.println ("");


        char option = ' ';
        String Name = "";
        String Description = "";
        int Price = 0;
        int Quantity = 0;

        while (option != 'a' && option != 'd' && option != 'c' &&
                option != 'i' && option != 'o' && option != 'q') {

            System.out.println ("Choose an option:");
            option = scnr.next ().charAt (0);
        }

        switch (option) {

            case 'a':

                scnr.nextLine ();
                System.out.println ("ADD ITEM TO CART");
                System.out.println ("Enter the item name:");
                Name = scnr.nextLine ();

                System.out.println ("Enter the item description:");
                Description = scnr.nextLine ();

                System.out.println ("Enter the item price:");
                Price = scnr.nextInt ();

                System.out.println ("Enter the item quantity:");
                Quantity = scnr.nextInt ();

                ItemToPurchase item = new ItemToPurchase (Name, Description, Price,
                        Quantity);

                shoppingCart.addItem (item);

                option = ' ';
                System.out.println ("");
                break;

            case 'd':
                scnr.nextLine ();
                System.out.println ("REMOVE ITEM FROM CART");
                System.out.println ("Enter name of item to remove:");

                Name = scnr.nextLine ();
                shoppingCart.removeItem (Name);
                option = ' ';
                System.out.println ("");
                break;

            case 'c':

                scnr.nextLine ();
                System.out.println ("CHANGE ITEM QUANTITY");
                System.out.println ("Enter the item name:");
                Name = scnr.nextLine ();
                System.out.println("Enter the new quantity:");
                Quantity = scnr.nextInt();

                ItemToPurchase modItem = new ItemToPurchase();
                modItem.setName(Name);
                modItem.setQuantity(Quantity);

                shoppingCart.modifyItem(modItem);

                option = ' ';
                System.out.println("");
                break;

            case 'i':
                System.out.println ("OUTPUT ITEMS' DESCRIPTIONS");
                shoppingCart.printDescriptions ();
                option = ' ';
                System.out.println ("");
                break;

            case 'o':
                System.out.println ("OUTPUT SHOPPING CART");
                shoppingCart.printTotal ();
                System.out.println ("");
                option = ' ';
                break;

        }
        return option;
    }

    public static void main(String[] args) {

        {
            Scanner scnr = new Scanner (System.in);
            System.out.println ("Enter Customer's Name:");
            String customerName = scnr.nextLine ();
            System.out.println ("Enter Today's Date:");
            String currentDate = scnr.nextLine ();
            System.out.println ("\nCustomer Name: " + customerName);
            System.out.println ("Today's Date: " + currentDate);
            System.out.println ("");
            // Create a linked list shopping cart.
            ShoppingCart shoppingCart = new ShoppingCart (customerName, currentDate);
            // Print menu.
            char choice = ' ';
            while (choice != 'q') {
                choice = printMenu (shoppingCart, scnr);
            }

            return;
        }
    }

}

