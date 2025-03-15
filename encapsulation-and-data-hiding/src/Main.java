public class Main {
    public static void main(String[] args) throws Exception {
        SideKick sideKickObject = new SideKick();
        // Attempt to access the private property directly 
        // System.out.println(sideKickObject.modeOfOperation);
        System.out.println(sideKickObject.getModeOfOperation());
        sideKickObject.setModeOfOperation(2);
        sideKickObject.takeAction();

    }
}
