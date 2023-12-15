package TaskofMotionCut;

import java.util.Scanner;

public class TextAdventureGame {

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Mysterious Forest Adventure!");
        System.out.println("You find yourself at the entrance of a mysterious forest.");

        System.out.println("1. Enter the forest.");
        System.out.println("2. Turn back.");

        int choice = getUserChoice(scanner, 2);

        if (choice == 1) {
            insideForest(scanner);
        } else {
            System.out.println("You decide not to enter the forest. Game over.");
        }

        scanner.close();
    }

    public static void insideForest(Scanner scanner) {
        System.out.println("Inside the forest, you encounter a fork in the path.");

        System.out.println("1. Take the left path.");
        System.out.println("2. Take the right path.");

        int choice = getUserChoice(scanner, 2);

        if (choice == 1) {
            System.out.println("You find a magical waterfall. Do you want to approach it?");
            System.out.println("1. Approach the waterfall.");
            System.out.println("2. Ignore it and continue.");

            choice = getUserChoice(scanner, 2);

            if (choice == 1) {
                System.out.println("As you approach the waterfall, you discover a hidden treasure chest. Congratulations, you win!");
            } else {
                System.out.println("You decide to ignore the waterfall and continue your journey.");
                System.out.println("Unfortunately, you get lost in the forest. Game over.");
            }
        } else {
            System.out.println("You encounter a pack of wolves on the right path. What will you do?");
            System.out.println("1. Try to scare them away.");
            System.out.println("2. Slowly retreat.");

            choice = getUserChoice(scanner, 2);

            if (choice == 1) {
                System.out.println("Your attempt to scare the wolves fails, and they attack. Game over.");
            } else {
                System.out.println("You slowly retreat, avoiding the wolves. You find a hidden cave.");
                System.out.println("Do you want to enter the cave?");
                System.out.println("1. Enter the cave.");
                System.out.println("2. Keep moving forward.");

                choice = getUserChoice(scanner, 2);

                if (choice == 1) {
                    System.out.println("Inside the cave, you discover a valuable gem. Congratulations, you win!");
                } else {
                    System.out.println("You decide not to enter the cave. As you continue, you encounter a dead end. Game over.");
                }
            }
        }
    }

    public static int getUserChoice(Scanner scanner, int maxChoice) {
        int choice = 0;
        do {
            System.out.print("Enter your choice (1-" + maxChoice + "): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            choice = scanner.nextInt();
        } while (choice < 1 || choice > maxChoice);

        return choice;
    }
}