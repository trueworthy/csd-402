// Lea Trueworthy
// March 5, 2025
// M12 Programming assignment
// Description: Write a Java program with four overloaded yearlyService methods to calculate annual auto service costs, testing each method twice.

public class trueworthy_auto {

    // Method 1: No parameters
    public static double yearlyService() {
        double standardCharge = 100.0;
        return standardCharge;
    }

    // Method 2: One parameter
    public static double yearlyService(double oilChangeFee) {
        double standardCharge = 100.0;
        return standardCharge + oilChangeFee;
    }

    // Method 3: Two parameters
    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        double standardCharge = 100.0;
        return standardCharge + oilChangeFee + tireRotationFee;
    }

    // Method 4: Three parameters
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double couponAmount) {
        double standardCharge = 100.0;
        return standardCharge + oilChangeFee + tireRotationFee - couponAmount;
    }

    public static void main(String[] args) {
        // Testing the methods
        // System.out.println("1: No parameters");
        System.out.println("1 - Standard Service: $" + yearlyService());

        // System.out.println("\n2: One parameter (oil change fee)");
        double oilChangeFee = 30.0;
        System.out.println("2 - Service with Oil Change: $" + yearlyService(oilChangeFee));

        // System.out.println("\n3: Two parameters (oil change fee & tire rotation fee)");
        double tireRotationFee = 25.0;
        System.out.println("3 - Service with Oil Change & Tire Rotation: $" + yearlyService(oilChangeFee, tireRotationFee));

        // System.out.println("\n4: Three parameters (oil change fee, tire rotation fee, and coupon amount)");
        double couponAmount = 20.0;
        System.out.println("4 - Service with Coupon: $" + yearlyService(oilChangeFee, tireRotationFee, couponAmount));

        // Testing each method a second time
        System.out.println("\nTest again with new values");

        // System.out.println("\n1.2: No parameters");
        System.out.println("1 again - Standard Service: $" + yearlyService());

        // System.out.println("\n2.2: One parameter (oil change fee)");
        oilChangeFee = 40.0; // Different oil change fee
        System.out.println("2 again - Service with Oil Change: $" + yearlyService(oilChangeFee));

        // System.out.println("\n3.2: Two parameters (oil change fee and tire rotation fee)");
        tireRotationFee = 20.0; // Different tire rotation fee
        System.out.println("3 again - Service with Oil Change & Tire Rotation: $" + yearlyService(oilChangeFee, tireRotationFee));

        // System.out.println("\n4.2: Three parameters (oil change fee, tire rotation fee, and coupon amount)");
        couponAmount = 10.0; // Different coupon amount
        System.out.println("4 again - Service with Coupon: $" + yearlyService(oilChangeFee, tireRotationFee, couponAmount));
    }
}