public class Latte extends Coffee {

    String milkType;
    String syrupFlavor;

    public Latte(String name, String roast, double price, String milkType, String syrupFlavor) {
        super(name, roast, 0, price);
        this.milkType = milkType;
        this.syrupFlavor = syrupFlavor;
    }

    @Override
    public void grindBeans() {
        System.out.println("Grinding coffee beans coarsely for a latte (medium grind)");
    }

    @Override
    public void brewCoffee() {
        System.out.println("Brewing the latte with steamed milk...");

        if (!syrupFlavor.equals("no")) {
            System.out.println("Adding " + syrupFlavor + " syrup to the latte...");
        } else {
            System.out.println("No syrup added to the latte.");
        }

        System.out.println("Steaming " + milkType + " milk for the latte...");
        System.out.println("Pouring steamed milk into the brewed coffee...");
        System.out.println("Adding foam on top of the latte...");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Milk Type: " + milkType);
        System.out.println("Syrup Flavor: " + syrupFlavor);
        System.out.println("Price: $" + price);
    }
}
