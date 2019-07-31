import java.util.Scanner;


public class ShoppingCartPrinter {

    public static void main(String[] args) {

        ItemToPurchase item1=new ItemToPurchase(); //object 1

        ItemToPurchase item2=new ItemToPurchase(); //object 2

        Scanner scnr=new Scanner(System.in);



        System.out.println("Item 1");

        System.out.println("Enter the item name:");
        item1.setName(scnr.nextLine());
        System.out.println("Enter the item price:");
        item1.setPrice(scnr.nextInt());
        System.out.println("Enter the item quantity:");
        item1.setQuantity(scnr.nextInt());


        System.out.println();
        scnr.nextLine();


        System.out.println("Item 2");
        System.out.println("Enter the item name:");
        item2.setName(scnr.nextLine());
        System.out.println("Enter the item price:");
        item2.setPrice(scnr.nextInt());
        System.out.println("Enter the item quantity:");
        item2.setQuantity(scnr.nextInt());

        System.out.println();

        int item1subTotal = item1.getPrice();
        int item1TotalCost = item1.getPrice() * item1.getQuantity();

        int item2subTotal = item1.getPrice();
        int item2TotalCost = item2.getPrice() * item2.getQuantity();


        int totalCost = item1TotalCost + item2TotalCost;


        System.out.println("TOTAL COST");
        System.out.println(item1.getName() +" "+ item1.getQuantity() +" @ $" + item1.getPrice() +" = $"
                + item1TotalCost);
        System.out.println(item2.getName() +" "+ item2.getQuantity() +" @ $" + item2.getPrice() +" = $"
                + item2TotalCost);

        System.out.println();

        System.out.println("Total: $" + totalCost);

    }

}
