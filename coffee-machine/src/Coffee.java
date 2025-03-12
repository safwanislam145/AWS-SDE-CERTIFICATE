public class Coffee {

    // attributes to store information about coffee
    String name; // name of the coffee e.g. espresso, cappuccino, latte
    String roast; // roast level of the coffee e.g. light, medium, dark
    int caffeineLevel; // caffeine level of the coffee in mg
    double price; // price of the coffee in dollars

    // constructor to create a new coffee object with the given attributes 
    public Coffee(String name, String roast, int caffeineLevel, double price) {
        this.name = name;
        this.roast = roast;
        this.caffeineLevel = caffeineLevel;
        this.price = price;

        // the constructor calls the setCaffeineLevel method to set the caffeine level of the coffee
        setCaffeineLevel();
    }

    // method to set the caffeine level of the coffee based on its name and roast level
    public void setCaffeineLevel() {
        if (roast.equals("light")) {
            caffeineLevel = 50; 
        } else if (roast.equals("medium")) {
            caffeineLevel = 100;
        } else if (roast.equals("dark")) {
            caffeineLevel = 150;
        } else {
            caffeineLevel = 0; // if the roast level is not valid, set caffeine level to 0
        }
    }

    // method to simulate coffee preparation
    public void grindBeans() {
        System.out.println("Grinding beans for " + name + "...");
    }

    public void brewCoffee() {
        System.out.println("Brewing " + name + "...");
    }

    // method to print the details of the coffee
    public void printInfo() {
        System.out.println("Coffee Name: " + name);
        System.out.println("Roast Level: " + roast);
        System.out.println("Caffeine Level: " + caffeineLevel + " mg");
        System.out.println("Price: $" + price);
    }
}
