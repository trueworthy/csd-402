// Lea Trueworthy
// January 25, 2025
// M4 Programming assignment
// Description: Write four overloaded methods to calculate the average of arrays with different data types and create a test program to display the arrays and their averages.

public class trueworthy_ArrayAverage {

    // calculate short array
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short)(sum / array.length);
    }

    // calculate int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // calculate long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // calculate double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        // Arrays with different sizes
        short[] shortArray = {15, 22, 31, 55, 70};
        int[] intArray = {103, 215, 300, 4056};
        long[] longArray = {1000L, 2000L, 3000L};
        double[] doubleArray = {10.2, 25.3, 31.7, 40.4, 50.5, 66.0};

        // Display results
        System.out.println("Short Array: " + arrayToString(shortArray));
        System.out.println("Average: " + average(shortArray));
        
        System.out.println("\nInt Array: " + arrayToString(intArray));
        System.out.println("Average: " + average(intArray));
        
        System.out.println("\nLong Array: " + arrayToString(longArray));
        System.out.println("Average: " + average(longArray));
        
        System.out.println("\nDouble Array: " + arrayToString(doubleArray));
        System.out.println("Average: " + average(doubleArray));
    }

    // convert to a string
    public static String arrayToString(short[] array) {
        String result = "";
        for (short num : array) {
            result += num + " ";
        }
        return result.trim();
    }

    public static String arrayToString(int[] array) {
        String result = "";
        for (int num : array) {
            result += num + " ";
        }
        return result.trim();
    }

    public static String arrayToString(long[] array) {
        String result = "";
        for (long num : array) {
            result += num + " ";
        }
        return result.trim();
    }

    public static String arrayToString(double[] array) {
        String result = "";
        for (double num : array) {
            result += num + " ";
        }
        return result.trim();
    }
}