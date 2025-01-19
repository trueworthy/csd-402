// Lea Trueworthy
// January 17, 2025
// M2 Programming assignment
// Description: Write a program that is like the popular game titled “Rock-Paper-Scissors.”

import java.util.Scanner;
import java.util.Random;

public class trueworthy_RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors.");

        int userChoice = scanner.nextInt();

        // Validate input
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid input. Please enter 1, 2, or 3.");
            return;
        }

        // Generate the computer's choice
        int computerChoice = random.nextInt(3) + 1; // Random number between 1 and 3

        // Display choices
        System.out.println("You chose: " + choiceToString(userChoice));
        System.out.println("Computer chose: " + choiceToString(computerChoice));

        // Determine the winner
        String result = determineWinner(userChoice, computerChoice);
        System.out.println(result);

        // Close scanner
        scanner.close();
    }

    // Convert the choice number to a string (Rock, Paper, or Scissors)
    public static String choiceToString(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "";
        }
    }

    // Determine the winner
    public static String determineWinner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return "It's a tie!";
        }
        // Rock beats Scissors, Scissors beats Paper, Paper beats Rock
        if ((userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }
}
