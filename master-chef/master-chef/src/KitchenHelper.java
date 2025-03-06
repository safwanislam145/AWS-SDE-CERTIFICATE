public class KitchenHelper {
    //method signature
    public static double calculateIngredientQuantity(int servings, double originalQuantity) {
        //calate the adjusted quantity
        double adjustedQuantity = originalQuantity * servings;
        return adjustedQuantity;
    }

    public static void spiceUpDish(int spiceLevel) {
        switch (spiceLevel) {
            case 1:
                System.out.println("Suggested spices: Salt, Pepper");
                break;
            case 2:
                System.out.println("Suggested spices: Salt, Pepper, Paprika");
                break;
            case 3:
                System.out.println("Suggested spices: Salt, Pepper, Paprika, Cayenne");
                break;
            case 4:
                System.out.println("Suggested spices: Salt, Pepper, Paprika, Cayenne, Red Pepper Flakes");
                break;
            case 5:
                System.out.println("Suggested spices: Salt, Pepper, Paprika, Cayenne, Red Pepper Flakes, Ghost Pepper");
                break;
            default:
                System.out.println("Spice level not recognized");
                break;
        }
    }

    public static void greetGuest(String name, String timeOfDay) {
        if (timeOfDay.equalsIgnoreCase("morning")){
            System.out.println("Good morning, " + name);
        } else if (timeOfDay.equalsIgnoreCase("afternoon")) {
            System.out.println("Good afternoon, " + name);
        } else if (timeOfDay.equalsIgnoreCase("evening")) {
            System.out.println("Good evening, " + name);
        } else {
            System.out.println("Hello, " + name);
        }
    }
    
    public static void main(String[] args) {
        double newQuantity = calculateIngredientQuantity(4, 2.5);
        System.out.println("The new quantity is: " + newQuantity);

        // Test the spiceUpDish method
        spiceUpDish(3);

        // Test the greetGuest method
        greetGuest("Alice", "morning");
    }
}

