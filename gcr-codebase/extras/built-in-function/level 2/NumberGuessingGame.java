//Creating a class name with NumberGuessingGame .
import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    public static void playGame() {
        int min = 1;
        int max = 100;
        int attempts = 0;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            int guess = generateGuess(min, max);
            attempts++;            
            char feedback = getFeedback(guess);
            if (feedback == 'c') {
                System.out.println("I guessed it in " + attempts + " attempts!");
                guessedCorrectly = true;
            } else if (feedback == 'h') {
                max = guess - 1; 
            } else if (feedback == 'l') {
                min = guess + 1;
            }
        }
    }
    public static int generateGuess(int min, int max) {
        if (min > max) return min; 
        return random.nextInt((max - min) + 1) + min;
    }
    public static char getFeedback(int guess) {
        System.out.print("Is it " + guess + "? (h/l/c): ");
        return scanner.next().toLowerCase().charAt(0);
    }
	public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("Feedback: 'h' for High, 'l' for Low, 'c' for Correct.");

        playGame();
        
        scanner.close();
    }
}