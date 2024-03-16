package Task2;

import java.util.*;
public class GuessingGame
{
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int numberToGuess = random.nextInt(100) + 1; // Generates a random number between 1 and 100
            int attempts = 0;

            System.out.println("Welcome to Guess the Number game!");
            System.out.println("I have picked a number between 1 and 100. Can you guess it?");

            int guess;
            do {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                }
            } while (guess != numberToGuess);

            System.out.println("Congratulations! You guessed the number " + numberToGuess + " correctly in " + attempts + " attempts.");
        }
    }

