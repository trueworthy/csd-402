// Lea Trueworthy
// February 5, 2025
// M7 Programming assignment
// Description: Create a UseFans class that stores a collection of Fan instances
// and includes methods to display the collection and a single fan without using
// the toString() method. Use the this reference in the Fan class where
// applicable and write test code to demonstrate the functionality.

import java.util.ArrayList;
import java.util.List;

class Fan {
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String getSpeedString() {
        switch (this.speed) {
            case STOPPED:
                return "STOPPED";
            case SLOW:
                return "SLOW";
            case MEDIUM:
                return "MEDIUM";
            case FAST:
                return "FAST";
            default:
                return "UNKNOWN";
        }
    }

    public void display() {
        if (this.on) {
            System.out.println("Fan is ON, Speed: " + this.getSpeedString() + ", Color: " + this.color + ", Radius: "
                    + this.radius);
        } else {
            System.out.println("Fan is OFF, Color: " + this.color + ", Radius: " + this.radius);
        }
    }
}

class UseFans {
    public static void displayFan(Fan fan) {
        fan.display();
    }

    public static void displayFans(List<Fan> fans) {
        for (Fan fan : fans) {
            fan.display();
        }
    }

    // running the program
    public static void main(String[] args) {
        List<Fan> fanList = new ArrayList<>();

        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");
        Fan fan3 = new Fan(Fan.MEDIUM, false, 8, "green");

        fanList.add(fan1);
        fanList.add(fan2);
        fanList.add(fan3);

        System.out.println("Displaying all fans:");
        displayFans(fanList);

        System.out.println("\nUpdating fan1:");
        fan1.setSpeed(Fan.SLOW);
        fan1.setOn(true);
        fan1.setColor("red");
        fan1.setRadius(7);
        displayFan(fan1);
    }
}
