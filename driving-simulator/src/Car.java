public class Car {
    private boolean isStarted;
    private String gear;
    private int speed;

    public Car() {
        this.isStarted = false;
        this.gear = "P";
        this.speed = 0;
    }

    public void start() {
        if (!isStarted) {
            isStarted = true;
            System.out.println("Car started.");
        } else {
            System.out.println("Car is already started.");
        }
    }

    public void selectGear(String gear) {
        if (isStarted) {
            if (gear.equals("P") || gear.equals("D") || gear.equals("R")) {
                this.gear = gear;
                System.out.println("Gear selected: " + gear);
            } else {
                System.out.println("Invalid gear. Please select P, D, or R.");
            }
        } else {
            System.out.println("Start the car first.");
        }
    }

    public void accelerate() {
        if (isStarted && (gear.equals("D") || gear.equals("R"))) {
            speed += 10;
            System.out.println("Accelerating. Current speed: " + speed + " km/h");
        } else if (!isStarted) {
            System.out.println("Start the car first.");
        } else {
            System.out.println("Select a valid gear (D or R) to accelerate.");
        }
    }

    public void brake() {
        if (isStarted && speed > 0) {
            speed -= 10;
            if (speed < 0) speed = 0;
            System.out.println("Braking. Current speed: " + speed + " km/h");
        } else if (!isStarted) {
            System.out.println("Start the car first.");
        } else {
            System.out.println("The car is already stopped.");
        }
    }
}