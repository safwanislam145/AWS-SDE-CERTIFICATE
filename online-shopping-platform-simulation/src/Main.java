public class Main {
    public static void main(String[] args) throws Exception {
        Electronics laptop = new Electronics("Laptop",1200, 12);
        Clothing tshirt = new Clothing("T-shirt", 20, "M");
        ShoppingCart  cart = new ShoppingCart();

        cart.addItem(laptop);
        cart.addItem(tshirt);
    }
}
