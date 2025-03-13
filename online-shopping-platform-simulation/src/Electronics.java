public class Electronics extends Product {
    int warrantyPeriodInMonths;

    public Electronics(String name, double price, int warrantyPeriodInMonths) {
        super(name, price);
        this.warrantyPeriodInMonths = warrantyPeriodInMonths;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warrant " + warrantyPeriodInMonths + " months.");
    }
}
