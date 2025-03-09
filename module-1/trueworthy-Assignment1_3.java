// Lea Trueworthy
// March 9, 2025
// M1 Programming assignment - Redo
// Description: Write a program to calculate the energy required to heat water. The program should prompt the user for the water's mass in kilograms and the initial and final temperatures.

import java.util.Scanner;

class WaterHeatingEnergy {

    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Input values
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = scanner.nextDouble();

        System.out.print("Enter the starting temperature of water (in Celsius): ");
        double initialTemperature = scanner.nextDouble();

        System.out.print("Enter the final temperature of water (in Celsius): ");
        double finalTemperature = scanner.nextDouble();

        // Math: Q = waterMass ( finalTemperature – initialTemperature ) x 4184
        double Q = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Output the result
        System.out.println("The energy required to heat the water is " + Q + " joules.");

        // Close the scanner
        scanner.close();
    }
}
