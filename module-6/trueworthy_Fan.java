// Lea Trueworthy
// January 29, 2025
// M6 Programming assignment
// Description: Write a program with a Fan class with speed constants, private fields, constructors, getter/setter methods, a toString() method, and test code to demonstrate its functionality

class Fan {
    // Constants for speed levels
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

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // return
    @Override
    public String toString() {
        if (on) {
            return "Fan is ON, Speed: " + getSpeedString() + ", Color: " + color + ", Radius: " + radius;
        } else {
            return "Fan is OFF, Color: " + color + ", Radius: " + radius;
        }
    }

    // return speed as a string
    private String getSpeedString() {
        switch (speed) {
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

    public static void main(String[] args) {
        // Create first Fan
        Fan fan1 = new Fan();
        System.out.println(fan1); // Display the state of fan1

        // Create second fan
        Fan fan2 = new Fan(FAST, true, 10, "blue");
        System.out.println(fan2); // Display the state of fan2

        // Change fan1
        fan1.setSpeed(MEDIUM);
        fan1.setOn(true);
        fan1.setColor("red");
        fan1.setRadius(8);
        System.out.println("Updated fan1: " + fan1);

        // Change fan2
        fan2.setSpeed(SLOW);
        fan2.setOn(false);
        fan2.setColor("green");
        fan2.setRadius(7);
        System.out.println("Updated fan2: " + fan2);
    }
}
