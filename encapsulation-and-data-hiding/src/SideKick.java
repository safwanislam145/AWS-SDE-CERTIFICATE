import java.util.Scanner;

public class SideKick extends Robot implements KungFuSkills{
    
    Scanner keyboard;


    public SideKick() {
        keyboard = new Scanner(System.in);
    }

    @Override
    // method to set choice
    public void setChoice() {
        System.out.println("*** SideKick Menu ***");
        System.out.println("1. Cleaning");
        System.out.println("2. Cooking");
        System.out.println("3. Re-charge");

        System.out.println("Enter choice(1-3)");
        int choice = keyboard.nextInt();
        setModeOfOperation(choice);
    }

    @Override
    // method to take action
    public void takeAction() {
        switch(getModeOfOperation()) {
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
    private void cookFood() {
        System.out.println("Move to the kitchen");
        System.out.println("Get the vegetables");
        System.out.println("Cut the veggies");
        System.out.println("Cook the food");
        System.out.println("Go back to Tone..");
    }

    @Override
    public void kungFuProtection() {
        System.out.println("SideKick is protecting Toni");
    }

    
}
