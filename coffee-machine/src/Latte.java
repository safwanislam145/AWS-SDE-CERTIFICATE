public class Latte extends Coffee {

    String milkType;
    String syrupFlavor;

    public Latte(String name, String roast, double price, String milkType, String syrupFlavor) {
        super(name, roast, 0, price);
        this.milkType = milkType;
        this.syrupFlavor = syrupFlavor;
    }

    public void printLatteDetails() {
        System.out.println("Milk Type: " + milkType);
        System.out.println("Syrup Flavor: " + syrupFlavor);
        System.out.println("Price: $" + price); 
    }
}
