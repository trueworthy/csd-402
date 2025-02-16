// Lea Trueworthy
// February 14, 2025
// M8 Programming assignment
// Description: write a program that takes a series of integers from user input,
// stores them in an ArrayList, and then finds and displays the largest value in
// the list.

import java.util.ArrayList;
import java.util.Scanner;

public class LeaArrayListTest {

    public static Integer max(ArrayList<Integer> list) {
        // If the list is empty, return 0
        if (list.isEmpty()) {
            return 0;
        }

        Integer max = list.get(0);

        for (Integer num : list) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // input
        System.out.println("Enter a whole number or enter 0 to stop:");

        while (true) {
            int userInput = scanner.nextInt();

            list.add(userInput);

            if (userInput == 0) {
                break;
            }
        }

        Integer largestValue = max(list);

        System.out.println("The largest value from the list is: " + largestValue);

        // Close scanner
        scanner.close();
    }
}
