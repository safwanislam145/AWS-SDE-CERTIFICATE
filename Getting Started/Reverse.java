public class Reverse {
    public static void main(String[] args) {
        // The string given
        String stringToReverse = "rotor";
        // The string to store the reversed string
        String reversed = "";
        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            char ch = stringToReverse.charAt(i);
            // Append the character to the reversed string
            reversed += ch;
        }
        System.out.println("Reversed string: " + reversed);
        // check if palindrome
        if (stringToReverse.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("Not palindrome.");
        }
    }
}