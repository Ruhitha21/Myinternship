package TaskofMotionCut;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        int lowerBound = 1;
	        int upperBound = 100;

	        // Generate a random number within the specified range
	        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

	        int userGuess;
	        int attempts = 0;

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("Try to guess the number between " + lowerBound + " and " + upperBound);

	        do {
	            System.out.print("Enter your guess: ");
	            userGuess = scanner.nextInt();
	            attempts++;

	            if (userGuess < randomNumber) {
	                System.out.println("Too low! Try again.");
	            } else if (userGuess > randomNumber) {
	                System.out.println("Too high! Try again.");
	            } else {
	                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
	            }

	        } while (userGuess != randomNumber);

	        // Close the scanner
	        scanner.close();

	}

}
