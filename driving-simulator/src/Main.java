import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Start the car");
            System.out.println("2. Select a gear");
            System.out.println("3. Accelerate");
            System.out.println("4. Brake");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    car.start();
                    break;
                case 2:
                    System.out.print("Enter gear (P, D, R): ");
                    String gear = scanner.next();
                    car.selectGear(gear);
                    break;
                case 3:
                    car.accelerate();
                    break;
                case 4:
                    car.brake();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}