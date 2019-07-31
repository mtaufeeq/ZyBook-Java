public class ItemToPurchase {

//class properties

    private String Name;

    private int Price;

    private int Quantity;


//default constructor to set properties to default values

    public ItemToPurchase() {

        Name="None";

        Price=0;

        Quantity=0;

    }

//getters and setters to get and set properties

    public String getName() {

        return Name;

    }

    public void setName(String Name) {

        this.Name = Name;

    }

    public int getPrice() {

        return Price;

    }

    public void setPrice(int Price) {

        this.Price = Price;

    }

    public int getQuantity() {

        return Quantity;

    }

    public void setQuantity(int Quantity) {

        this.Quantity = Quantity;

    }

}
