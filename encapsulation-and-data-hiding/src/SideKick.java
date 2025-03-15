import java.util.Scanner;

public class SideKick {
    
    Scanner keyboard;

    private int modeOfOperation;

    int batteryCharge;

    public SideKick() {
        keyboard = new Scanner(System.in);
        
        // initial charge of battery is 0
        batteryCharge = 0;
        
        // set default o cleaning or 1 
        modeOfOperation = 1;
    }

    // Getter method
    public int getBatteryCharge() {
        return batteryCharge;
    }

    // setter method
    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    public void rechargeBattery() {
        System.out.println("Plug into socket..");
        System.out.println("Charging..");
        for (int i = 0; i <= 100; i+=10) {
            System.out.println(".");
            batteryCharge =  i;
        }
        System.out.println("\nUnplug from socket....");
        System.out.println("Fully charged...");
    }

    public void displayBatteryLevel() {
        System.out.println("The battery charge is at :" + batteryCharge);
    }


    public int getModeOfOperation() {
        return modeOfOperation;
    }

    public void setModeOfOperation(int mode) {
        if (mode == 1 || mode == 2 || mode == 3) {
            this.modeOfOperation = mode;
        } else {
            System.out.println("Invalid mode of operation. Please enter 1, 2, or 3.");
            this.modeOfOperation = 1;
        }
    }

    // method to set choice
    public void setChoice() {
        System.out.println("*** SideKick Menu ***");
        System.out.println("1. Cleaning");
        System.out.println("2. Cooking");
        System.out.println("3. Re-charge");

        System.out.println("Enter choice(1-3)");
        int choice = keyboard.nextInt();
        modeOfOperation = choice;
    }


    // method to take action
    public void takeAction() {
        switch(modeOfOperation) {
            case 1:
                cleanHouse();
                System.out.println("SideKick cleaning completed");
                break;
            case 2:
                cookFood();
                System.out.println("SideKick cooking completed.");
                break;
            case 3:
                rechargeBattery();
                System.out.println("SideKick recharge battery");
                break;
            default:
                System.out.println("Sidekick does not support the operation.");
        }
    }

    private void cleanHouse() {
        System.out.println("Get the vacuum cleaner...");
        System.out.println("Put the dust bag in vacuum...");
        System.out.println("Go to living room and clean...");
        System.out.println("Take out trash...");
        System.out.println("Go back to Toni..");
    }

    // method to cook
    public void cookFood() {
        System.out.println("Move to the kitchen");
        System.out.println("Get the vegetables");
        System.out.println("Cut the veggies");
        System.out.println("Cook the food");
        System.out.println("Go back to Tone..");
    }
}
