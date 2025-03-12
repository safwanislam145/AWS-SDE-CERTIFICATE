import java.util.Scanner;

public class CoffeeMachine {
    
    public static void main(String[] args) {
        
        // create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Coffee Machine!");
            System.out.println("Select an option:");
            System.out.println("1. Espresso");
            System.out.println("2. Latte");
            System.out.println("3. Exit");
            System.out.println("Enter yout choice (1-3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // initialize the name of the espresso
                    String espressoName = "Espresso";
                    // initialize the price of the espresso
                    double espressoPrice = 2.50;
                    // Ask the user for the type of roast
                    System.out.println("Enter the roast level (light, medium, dark):");
                    String espressoRoast = scanner.next();
                    
                    // ask the user how many shots of espresso they want
                    System.out.println("Enter the number of shots:");
                    int numberOfShots = scanner.nextInt();

                    Espresso myEspresso = new Espresso(espressoName, espressoRoast, espressoPrice, numberOfShots);
                    myEspresso.grindBeans();
                    myEspresso.brewCoffee();
                    myEspresso.printInfo();
                    myEspresso.printEspressoDetails();



                    break;
                
                case 2:
                    // initialize the name of the latte
                    String latteName = "Latte";
                    // initialize the price of the latte2
                    
                    double lattePrice = 3.50;
                    // Ask the user for the type of roast
                    System.out.println("Enter the roast level (light, medium, dark):");
                    String latteRoast = scanner.next();
                    
                    // ask the user for milk type
                    System.out.println("Enter the type of milk (whole, skim, almond):");
                    String milkType = scanner.next();

                    // ask the user for syrup
                    System.out.println("Would you like to add syrup? (yes/no):");
                    String syrupWanted = scanner.next();

                    String syrupFlavor = "no";
                    if (syrupWanted.equals("yes")) {
                        System.out.println("What flavor of syrup would you like? (vanilla, caramel, hazelnut):");
                        syrupFlavor = scanner.next();
                    }

                    Latte myLatte = new Latte(latteName, latteRoast, lattePrice, milkType, syrupFlavor);
                    myLatte.grindBeans();
                    myLatte.brewCoffee();
                    myLatte.printInfo();
                    myLatte.printLatteDetails();

                    break;
                
                case 3:
                    System.out.println("Thank you for using the Coffee Machine. Goodbye!");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
