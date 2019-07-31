public class ItemToPurchase {

//class properties

    private String Name;

    private int Price;

    private int Quantity;

    private String Description;


//default constructor to set properties to default values

    public ItemToPurchase() {

        Name="None";

        Price=0;

        Quantity=0;

        Description = "None";

    }

//parametrised constructor

    public ItemToPurchase (String Name, String Description, int Price, int Quantity) {

        this.Name = Name;

        this.Description = Description;

        this.Price = Price;

        this.Quantity = Quantity;

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

    public String getDescription() {

        return Description;

    }

    public void setDescription(String Description) {

        this.Description = Description;

    }

    public void printItemCost() {

        System.out.println(Name + " " + Quantity + " @ " + "$"+Price + " = $"
                +  (Price*Quantity));

    }


    public void printItemDescription() {

        System.out.println(Name + ": " + Description);

    }


}


