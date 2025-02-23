// Lea Trueworthy
// February 18, 2025
// M10 Programming assignment
// Description: The DomesticDivision class includes a field for the state in which the division is located and a constructor that requires all fields when created.

class DomesticDivision extends Division {
    private String state;

    // Grab the division, account number, and state
    public DomesticDivision(String divisionName, String accountNumber, String state) {
        // superclass
        super(divisionName, accountNumber);
        this.state = state;
    }

    // Displaying domestic
    @Override
    public void display() {
        System.out.println("Domestic Division: " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("State: " + state);
    }

    // Getter method - State
    public String getState() {
        return state;
    }
}
