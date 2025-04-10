public class Penguin extends Animal implements Walk, Swim {

    private boolean isSwimming;
    private int walkSpeed;
    private int swimSpeed;

    // Default constructor
    public Penguin() {
        super("Penguin");
    }

    // Getters and setters
    public boolean getIsSwimming() {
        return isSwimming;
    }

    public void setIsSwimming(boolean isSwimming) {
        this.isSwimming = isSwimming;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    // Eat interface methods
    @Override
    public void eatingFood() {
        System.out.println("Penguin: I am eating some fresh fish!");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I have eaten fish.");
    }

    // Walk interface method
    @Override
    public void walking() {
        System.out.println("Penguin: I am waddling at the speed of " + walkSpeed + " mph.");
    }

    // Swim interface method
    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed of " + swimSpeed + " nautical miles per hour.");
    }
}
