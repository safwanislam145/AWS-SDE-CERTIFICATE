import java.util.Scanner;

public class GuessGame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 7; // The number to guess
        int userGuess = 0; // Variable to store user's guess

        // WHILE loop to keep asking for input until the correct guess
        while (userGuess != secretNumber) {
            System.out.println("Guess the number (between 1 and 10): ");
            userGuess = scanner.nextInt(); // get user input

            if (userGuess != secretNumber) {
                System.out.println("Wrong guess! Try again.");
            }
        }
        System.out.println("Congratulations! You've guessed the right number: " + secretNumber);
        // Close the scanner to prevent resource leaks
        scanner.close();
        // The program ends here
    }
}
