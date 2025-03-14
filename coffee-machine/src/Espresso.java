public class Espresso extends Coffee {

    int numberOfShots;

    public Espresso(String name, String roast, double price, int numberOfShots) {
        
        super(name, roast, 0, price);
        this.numberOfShots = numberOfShots;

    }

    @Override
    public void grindBeans() {
        System.out.println("Grinding espresso beans finely..");
    }

    @Override
    public void brewCoffee() {
        System.out.println("Brewing the espresso under high pressure…");
    }

    @Override
    public void printInfo() {
        super.printInfo();

        double totalbill = price * numberOfShots;
        System.out.println("You asked for " + numberOfShots + " servings!");
        System.out.println("Every serving of espresso costs " + price + " $.");
        System.out.println("Your total bill is " + totalbill + " $.");
    }

}
