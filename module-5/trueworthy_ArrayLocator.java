// Lea Trueworthy
// January 29, 2025
// M5 Programming assignment
// Description: Write a program to find the largest and smallest elements in 2D
// arrays, returning their locations as row and column indices.

public class trueworthy_ArrayLocator {

    // find the largest element in a double array
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = { 0, 0 };
        double largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // find the largest in a int array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = { 0, 0 }; 
        int largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = { 0, 0 };
        double smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // smallest element in a int array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = { 0, 0 };
        int smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static void main(String[] args) {
        // Example usage

        // double 2D array
        double[][] doubleArray = {
                { 1.1, 3.3, 4.5 },
                { 0.5, 3.6, 5.2 },
                { 9.1, 6.8, 5.4 }
        };

        int[] largestLocationDouble = locateLargest(doubleArray);
        System.out.println("Largest in double: [" + largestLocationDouble[0] + ", "
                + largestLocationDouble[1] + "]");

        int[] smallestLocationDouble = locateSmallest(doubleArray);
        System.out.println("Smallest in double: [" + smallestLocationDouble[0] + ", "
                + smallestLocationDouble[1] + "]");

        // int 2D array
        int[][] intArray = {
                { 1, 6, 8 },
                { 0, 9, 2 },
                { 9, 6, 5 }
        };

        int[] largestLocationInt = locateLargest(intArray);
        System.out.println("Largest in int: [" + largestLocationInt[0] + ", " 
        + largestLocationInt[1] + "]");

        int[] smallestLocationInt = locateSmallest(intArray);
        System.out.println("Smallest in int: [" + smallestLocationInt[0] + ", " 
        + smallestLocationInt[1] + "]");
    }
}
