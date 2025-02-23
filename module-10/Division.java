// Lea Trueworthy
// February 18, 2025
// M10 Programming assignment
// Description: Create an abstract Division class with fields for a company's division name and account number, and an abstract display () method that will be defined in the subclasses.

abstract class Division {
    private String divisionName;
    private String accountNumber;

    // Get the division name and account number
    public Division(String divisionName, String accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // display method
    public abstract void display();

    // Getter method - Division Name
    public String getDivisionName() {
        return divisionName;
    }

    // Getter method - Account number
    public String getAccountNumber() {
        return accountNumber;
    }
}
