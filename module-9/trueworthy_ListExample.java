// Lea Trueworthy
// February 14, 2025
// M9 Programming assignment
// Description: Create a program with an ArrayList of 10+ Strings. Print the
// list with a ‘for-each’ loop. Ask the user for an element, then use try/catch
// to handle invalid input and show "Out of Bounds." Use
// Autoboxing/Auto-Unboxing for input.

import java.util.ArrayList;
import java.util.Scanner;

public class trueworthy_ListExample {
    public static void main(String[] args) {
        // List
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Date");
        stringList.add("Lime");
        stringList.add("Apple");
        stringList.add("Raspberries");
        stringList.add("Fig");
        stringList.add("Banana");
        stringList.add("Mango");
        stringList.add("Watermelon");
        stringList.add("Orange");
        stringList.add("Papaya");
        stringList.add("Jackfruit");
        stringList.add("Pineapple");
        stringList.add("Plum");

        System.out.println("The ArrayList contains:");
        for (String fruit : stringList) {
            System.out.println(fruit);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nWhat fruit would you like to see again (0 to 12): ");
        int index = scanner.nextInt();

        try {
            System.out.println("\nYou selected: " + stringList.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Not Available");
        } finally {
            scanner.close();
        }
    }
}
