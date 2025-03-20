import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        SideKick sideKickObject = new SideKick();

        WatADriver driverBot = new WatADriver();

        // Object of scanner class to get input from the user 
        Scanner keyboardInput = new Scanner(System.in);

        // integer variable to get choice of use as to which robot to use
        int menuChoice;

        // boolean variable to keep the dowhile running
        boolean keepMenuRunning;

        // do while loop to keep the menu running until the user chooses to exit
        do {

            System.out.println("*** Main Menu ***");
            System.out.println("1. SideKick");
            System.out.println("2. WatADriver");
            System.out.println("*****************");

            System.out.println("Enter choice(1-2)");
            menuChoice = keyboardInput.nextInt();

            // switch case to choose which robot to use
            switch (menuChoice) {
                case 1:
                    sideKickObject.setChoice();
                    sideKickObject.takeAction();

                    if (sideKickObject instanceof KungFuSkills) {
                        sideKickObject.kungFuProtection();
                    } else {
                        System.out.println("SideKick does not have KungFuSkills");
                    }
                    
                    break;
                case 2:
                    driverBot.setChoice();
                    driverBot.takeAction();
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");

            }

            // incase the input skips
            keyboardInput.nextLine();

            // prompt user to if continuation is reqired or not
            System.out.println("Do you want to continue? (y/n)");
            // get the input from the user and store it in the variable keepMenuRunning
            String userInput = keyboardInput.nextLine();

            if (userInput.equalsIgnoreCase("y")) {
                // re-run loop
                keepMenuRunning = true;
            } else {
                keepMenuRunning = false;
            }
        } while (keepMenuRunning);
    } 
}
