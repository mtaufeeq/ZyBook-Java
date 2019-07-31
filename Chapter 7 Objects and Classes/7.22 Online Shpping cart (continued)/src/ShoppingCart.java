import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {

    private String CustomerName;
    private String Date;

    ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>();
    Scanner scnr = new Scanner(System.in);

    boolean found;


    public ShoppingCart() {

        CustomerName = "none";

        Date = "January 1, 2016";



    }

//parametrised constructor

    public ShoppingCart(String CustomerName, String CurrentDate) {

        this.CustomerName = CustomerName;

        this.Date = CurrentDate;


    }

    //getCustomerName() accessor (1 pt)
    //getDate() accessor (1 pt)


    public String getCustomerName() {

        return CustomerName;

    }

    public void setCustomerName(String CustomerName) {

        this.CustomerName = CustomerName;

    }


    public String getDate() {

        return Date;

    }

    public void setDate(String currentDate) {

        this.Date = currentDate;

    }

    //addItem()
    //Adds an item to cartItems array. Has parameter ItemToPurchase. Does not return anything.

    public void addItem(ItemToPurchase item) {

        cartItems.add(item);
    }

    //removeItem()
    //Removes item from cartItems array. Has a string (an item's name) parameter. Does not return anything.
    //If item name cannot be found, output this message: Item not found in cart. Nothing removed.

    public void removeItem(String itemName) {
        //found = false;
        boolean found = false;
        for (ItemToPurchase i : cartItems) {
            if (i.getName().equalsIgnoreCase(itemName)) {
                cartItems.remove(i);
                found = true;
                break;
            }
        }
        if (!found)

            System.out.println("Item not found in cart. Nothing removed.");
    }

    //modifyItem()
    //Modifies an item's description, price, and/or quantity. Has parameter ItemToPurchase. Does not return anything.
    //If item can be found (by name) in cart, check if parameter has default values for description, price,
    // and quantity. If not, modify item in cart.
    //If item cannot be found (by name) in cart, output this message: Item not found in cart. Nothing modified.

    public void modifyItem(ItemToPurchase item) {

        found = false;
        for (ItemToPurchase i : cartItems) {

            if (i.getName().equalsIgnoreCase(item.getName())) {

                i.setQuantity(item.getQuantity());
                found = true;
                break;
            }

        }
        if (!found)
            System.out.println("Item not found in cart. Nothing modified.");

    }
    //getNumItemsInCart() (2 pts)
    //Returns quantity of all items in cart. Has no parameters.

    public int getNumItemsInCart() {
        int totalQuantity = 0;

        if (cartItems.isEmpty()) {

            System.out.println("SHOPPING CART IS EMPTY");

        } else {

            for (int i = 0; i < cartItems.size(); i++) {

                totalQuantity = totalQuantity + cartItems.get(i).getQuantity();

            }

        }

        return totalQuantity;

    }

    //getCostOfCart() (2 pts)
    //Determines and returns the total cost of items in cart. Has no parameters.

    public int getCostOfCart() {

        int totalCost = 0;

        if (cartItems.isEmpty()) {

            System.out.println("SHOPPING CART IS EMPTY");

        } else {

            for (int i = 0; i < cartItems.size(); i++) {

                totalCost =  totalCost + (cartItems.get(i).getQuantity() * cartItems.get(i).getPrice());

            }
        } //Price + Price*Quantity

        return totalCost;
    }

    //printTotal()
    //
    //Outputs total of objects in cart.
    //If cart is empty, output this message: SHOPPING CART IS EMPTY

    public void printTotal() {

        if (cartItems.isEmpty()) {
            System.out.println(CustomerName + "'s Shopping Cart - " + Date);
            System.out.println("Number of Items: 0");
            System.out.println("");
            System.out.println("\nTotal: $" + getCostOfCart());

        } else {

            System.out.println(CustomerName + "'s Shopping Cart - " + Date);
            System.out.println("Number of Items: " + getNumItemsInCart());
            System.out.println("");
            for (ItemToPurchase item : cartItems) {
                item.printItemCost();
            }
            System.out.println("\nTotal: $" + getCostOfCart());
        }
    }


    //printDescriptions()
    //Outputs each item's description.

    public void printDescriptions() {

        if (cartItems.isEmpty()) {

            System.out.println("SHOPPING CART IS EMPTY");

        } else {

            System.out.println(CustomerName + "'s Shopping Cart - " + Date);
            //System.out.println("Number of Items: " + cartItems.size());

            System.out.println();

            System.out.println("Item Descriptions");

            for (ItemToPurchase i : cartItems) {

                i.printItemDescription();
            }

        }
    }

}


