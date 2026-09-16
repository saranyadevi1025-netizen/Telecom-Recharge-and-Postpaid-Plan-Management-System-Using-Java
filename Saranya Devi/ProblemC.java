%%writefile Main.java
// Custom Exception Class
class InvalidDataLimitException extends Exception {
    public InvalidDataLimitException(String message) {
        super(message);
    }
}

// Plan class that uses the custom exception
class Plan {
    private String planName;
    private double dataLimitGB;

    public Plan(String planName, double dataLimitGB) throws InvalidDataLimitException {
        if (dataLimitGB < 0) {
            throw new InvalidDataLimitException("Error: Data limit cannot be negative (" + dataLimitGB + " GB)");
        }
        this.planName = planName;
        this.dataLimitGB = dataLimitGB;
    }

    public void display() {
        System.out.println("Plan Name: " + planName);
        System.out.println("Data Limit: " + dataLimitGB + " GB");
    }
}

// Main class to test Problem C
public class Main {
    public static void main(String[] args) {
        // Test Case 1: Valid data limit
        try {
            System.out.println("Creating valid plan...");
            Plan validPlan = new Plan("Basic Plan", 50.0);
            validPlan.display();
        } catch (InvalidDataLimitException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n-------------------\n");

        // Test Case 2: Negative data limit (triggers exception)
        try {
            System.out.println("Creating invalid plan...");
            Plan invalidPlan = new Plan("Invalid Plan", -10.0);
            invalidPlan.display();
        } catch (InvalidDataLimitException e) {
            System.out.println(e.getMessage());
        }
    }
}
