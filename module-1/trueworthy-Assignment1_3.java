import java.util.Scanner;

class WaterHeatingEnergy {

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input values
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = scanner.nextDouble();

        System.out.print("Enter the initial temperature of the water (in Celsius): ");
        double initialTemperature = scanner.nextDouble();

        System.out.print("Enter the final temperature of the water (in Celsius): ");
        double finalTemperature = scanner.nextDouble();

        // Calculate the energy required using the formula
        double Q = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Output the result
        System.out.println("The energy required to heat the water is " + Q + " joules.");

        // Close the scanner
        scanner.close();
    }
}
