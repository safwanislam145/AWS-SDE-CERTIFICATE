import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int continueOuterLoop = 1;
        int continueInnerLoop;
        int menuChoice;

        // Animal objects
        Tiger tigerObject = new Tiger();
        Dolphin dolphinObject = new Dolphin();
        Penguin penguinObject = new Penguin();

        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1: // Tiger
                    do {
                        System.out.println("The animal which is chosen is: " + tigerObject.getNameOfAnimal());

                        menuChoice = animalDetailsManipulationMenu(keyboard, tigerObject);
                        switch (menuChoice) {
                            case 1:
                                System.out.print("Enter age: ");
                                tigerObject.setAge(keyboard.nextInt());

                                System.out.print("Enter height: ");
                                tigerObject.setHeight(keyboard.nextInt());

                                System.out.print("Enter weight: ");
                                tigerObject.setWeight(keyboard.nextInt());

                                System.out.print("Enter number of stripes: ");
                                tigerObject.setNumberOfStripes(keyboard.nextInt());

                                System.out.print("Enter speed (mph): ");
                                tigerObject.setSpeed(keyboard.nextInt());

                                System.out.print("Enter sound level of roar: ");
                                tigerObject.setSoundLevelOfRoar(keyboard.nextInt());
                                break;

                            case 2:
                                System.out.println("Name: " + tigerObject.getNameOfAnimal());
                                System.out.println("Age: " + tigerObject.getAge());
                                System.out.println("Height: " + tigerObject.getHeight());
                                System.out.println("Weight: " + tigerObject.getWeight());
                                System.out.println("Stripes: " + tigerObject.getNumberOfStripes());
                                System.out.println("Speed: " + tigerObject.getSpeed() + " mph");
                                System.out.println("Roar level: " + tigerObject.getSoundLevelOfRoar());
                                break;

                            case 3:
                                tigerObject.walking();
                                break;

                            case 4:
                                tigerObject.eatingFood();
                                tigerObject.eatingCompleted();
                                break;

                            default:
                                System.out.println("Invalid choice");
                        }

                        System.out.println("Continue with this animal? (Enter 1 for yes / 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                case 2: // Dolphin
                    do {
                        System.out.println("The animal which is chosen is: " + dolphinObject.getNameOfAnimal());

                        menuChoice = animalDetailsManipulationMenu(keyboard, dolphinObject);
                        switch (menuChoice) {
                            case 1:
                                System.out.print("Enter age: ");
                                dolphinObject.setAge(keyboard.nextInt());

                                System.out.print("Enter height: ");
                                dolphinObject.setHeight(keyboard.nextInt());

                                System.out.print("Enter weight: ");
                                dolphinObject.setWeight(keyboard.nextInt());

                                keyboard.nextLine(); // Clear buffer
                                System.out.print("Enter color of dolphin: ");
                                dolphinObject.setColorOfDolphin(keyboard.nextLine());

                                System.out.print("Enter swimming speed (nautical mph): ");
                                dolphinObject.setSwimmingSpeed(keyboard.nextInt());
                                break;

                            case 2:
                                System.out.println("Name: " + dolphinObject.getNameOfAnimal());
                                System.out.println("Age: " + dolphinObject.getAge());
                                System.out.println("Height: " + dolphinObject.getHeight());
                                System.out.println("Weight: " + dolphinObject.getWeight());
                                System.out.println("Color: " + dolphinObject.getColorOfDolphin());
                                System.out.println("Swimming Speed: " + dolphinObject.getSwimmingSpeed() + " nautical mph");
                                break;

                            case 3:
                                dolphinObject.swimming();
                                break;

                            case 4:
                                dolphinObject.eatingFood();
                                dolphinObject.eatingCompleted();
                                break;

                            default:
                                System.out.println("Invalid choice");
                        }

                        System.out.println("Continue with this animal? (Enter 1 for yes / 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                case 3: // Penguin
                    do {
                        System.out.println("The animal which is chosen is: " + penguinObject.getNameOfAnimal());

                        menuChoice = animalDetailsManipulationMenu(keyboard, penguinObject);
                        switch (menuChoice) {
                            case 1:
                                System.out.print("Enter age: ");
                                penguinObject.setAge(keyboard.nextInt());

                                System.out.print("Enter height: ");
                                penguinObject.setHeight(keyboard.nextInt());

                                System.out.print("Enter weight: ");
                                penguinObject.setWeight(keyboard.nextInt());

                                System.out.print("Is the penguin swimming (true/false): ");
                                penguinObject.setIsSwimming(keyboard.nextBoolean());

                                System.out.print("Enter walk speed (mph): ");
                                penguinObject.setWalkSpeed(keyboard.nextInt());

                                System.out.print("Enter swim speed (nautical mph): ");
                                penguinObject.setSwimSpeed(keyboard.nextInt());
                                break;

                            case 2:
                                System.out.println("Name: " + penguinObject.getNameOfAnimal());
                                System.out.println("Age: " + penguinObject.getAge());
                                System.out.println("Height: " + penguinObject.getHeight());
                                System.out.println("Weight: " + penguinObject.getWeight());
                                System.out.println("Is Swimming: " + penguinObject.getIsSwimming());
                                System.out.println("Walk Speed: " + penguinObject.getWalkSpeed() + " mph");
                                System.out.println("Swim Speed: " + penguinObject.getSwimSpeed() + " nautical mph");

                                if (penguinObject.getIsSwimming()) {
                                    System.out.println("Current Mode: Swimming");
                                } else {
                                    System.out.println("Current Mode: Walking");
                                }
                                break;

                            case 3:
                                System.out.print("Is the penguin swimming? Enter true or false: ");
                                penguinObject.setIsSwimming(keyboard.nextBoolean());

                                if (penguinObject.getIsSwimming()) {
                                    penguinObject.swimming();
                                } else {
                                    penguinObject.walking();
                                }
                                break;

                            case 4:
                                penguinObject.eatingFood();
                                penguinObject.eatingCompleted();
                                break;

                            default:
                                System.out.println("Invalid choice");
                        }

                        System.out.println("Continue with this animal? (Enter 1 for yes / 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                default:
                    System.out.println("Sorry, no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes / 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while (continueOuterLoop == 1);
    }

    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("\n******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");
        System.out.print("Enter choice of animal (1-3): ");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("\n******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " *******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.print("Enter choice (1-4): ");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }
}
