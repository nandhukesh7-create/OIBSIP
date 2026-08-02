import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Random random = new Random();
        var scanner = new Scanner(System.in);

        int secretNumber = random.nextInt(100) + 1; 
        int guess;
        int attempts = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("Number of attempts: " + attempts);
            }
        } while (guess != secretNumber);

        scanner.close();
    }
}