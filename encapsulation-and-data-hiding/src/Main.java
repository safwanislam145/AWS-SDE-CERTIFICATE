public class Main {
    public static void main(String[] args) throws Exception {
        // SideKick sideKickObject = new SideKick();
        // Attempt to access the private property directly 
        // System.out.println(sideKickObject.modeOfOperation);
        // System.out.println(sideKickObject.getModeOfOperation());
        // sideKickObject.setChoice();
        // sideKickObject.takeAction();

        WatADriver driverBot = new WatADriver();
        ///driverBot.rechargeBattery();
        //driverBot.displayBatteryLevel();
        driverBot.setChoice();
        driverBot.takeAction();
    }
}
