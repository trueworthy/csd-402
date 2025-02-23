// Lea Trueworthy
// February 18, 2025
// M10 Programming assignment
// Description: Write an application named UseDivision that creates two instances of each of these concrete classes (4 total instances).

public class UseDivision {
    public static void main(String[] args) {
        // creating instances of InternationalDivision
        InternationalDivision intlDiv1 = new InternationalDivision("Global Operations", "A16408", "Germany", "German");
        InternationalDivision intlDiv2 = new InternationalDivision("Bonjour Sales", "B67890", "France", "French");

        // Creating instances of DomesticDivision
        DomesticDivision domesticDiv1 = new DomesticDivision("East Coast Operations", "C58432", "New York");
        DomesticDivision domesticDiv2 = new DomesticDivision("West Coast Marketing", "D44156", "California");

        // displaying the 4 instances
        System.out.println();
        intlDiv1.display();
        System.out.println();
        intlDiv2.display();

        System.out.println();
        domesticDiv1.display();
        System.out.println();
        domesticDiv2.display();
    }
}
