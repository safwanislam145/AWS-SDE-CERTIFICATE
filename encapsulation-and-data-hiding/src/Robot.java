public abstract class Robot {

    private int modeOfOperation;

    private int batteryCharge;

    public Robot() {
        
        // initial charge of battery is 0
        batteryCharge = 0;
        
        // set default o cleaning or 1 
        modeOfOperation = 1;
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

    public abstract void setChoice();

    public abstract void takeAction();
}
