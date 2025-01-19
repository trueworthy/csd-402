// Lea Trueworthy
// January 18, 2025
// M3 Programming assignment
// Description: Write a program that uses nested loops to print a pyramid pattern of numbers, followed by an "@" symbol on each row

public class trueworthy_PyramidPattern {
    public static void main(String[] args) {
        // number of rows
        int totalRows = 7;
        
        // Loop to generate the pattern
        for (int i = 0; i < totalRows; i++) {
            // Print leading spaces
            for (int j = 0; j < totalRows - i - 1; j++) {
                System.out.print(" ");
            }

            // Show the numbers increasing
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                // Double the number
                num *= 2;
            }

            // Show the numbers decreasing
            // Adjust the number to the last value in the increasing part
            num /= 2;
            for (int j = 0; j < i; j++) {
                // Halve the number
                num /= 2;
                System.out.print(num + " ");
            }

            // Print the @ symbol
            System.out.println("@");
        }
    }
}