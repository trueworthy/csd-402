// Lea Trueworthy
// February 18, 2025
// M10 Programming assignment
// Description: The InternationalDivision class includes a field for the country in which the division is located, a field for the language spoken, and a constructor that requires all fields when created.

class InternationalDivision extends Division {
    private String country;
    private String languageSpoken;

    // Pulling the division, account number, country, and language
    public InternationalDivision(String divisionName, String accountNumber, String country, String languageSpoken) {
        super(divisionName, accountNumber);
        this.country = country;
        this.languageSpoken = languageSpoken;
    }

    // Displaying international
    @Override
    public void display() {
        System.out.println("International Division: " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Country: " + country);
        System.out.println("Language Spoken: " + languageSpoken);
    }

    // Getter method - Country
    public String getCountry() {
        return country;
    }

    public String getLanguageSpoken() {
        return languageSpoken;
    }
}
