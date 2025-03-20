import java.util.Scanner;

public class WatADriver extends Robot {

    Scanner keyboard;

    public WatADriver() {
        keyboard = new Scanner(System.in);
    }

    @Override
    public void setChoice() {
        System.out.println("WatADriver Menu");
        System.out.println("1. Drive");
        System.out.println("2. Fly");
        System.out.println("3. Recharge");
        System.out.println("4. Check Battery Level");

        System.out.println("Enter choice(1-4)");
        int choice = keyboard.nextInt();
        setModeOfOperation(choice);
    }

    @Override
    public void takeAction() {
        switch (getModeOfOperation()) {
            case 1:
                driveACar();
                System.out.println("WatADriver driving completed"); 
                break;
            case 2:
                flyAPlane();
                System.out.println("WatADriver flying completed.");
                break;
            case 3:
                rechargeBattery();
                System.out.println("WatADriver recharge battery");
                break;
            case 4:
                displayBatteryLevel();
                break;
            default:
                System.out.println("WatADriver does not support the operation.");
        }
    }

    private void driveACar() {
        System.out.println("Get into the car...");
        System.out.println("Start the engine...");
        System.out.println("Drive to the destination...");
        System.out.println("Park the car...");
        System.out.println("Get out of the car...");
    }

    private void flyAPlane() {
        System.out.println("Get into the plane...");
        System.out.println("Start the engine...");
        System.out.println("Fly to the destination...");
        System.out.println("Land the plane...");
        System.out.println("Get out of the plane...");
    }
}