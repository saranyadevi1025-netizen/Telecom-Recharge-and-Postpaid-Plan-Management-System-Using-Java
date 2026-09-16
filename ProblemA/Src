%%writefile Main.java
// Base class
class Plan {
    protected String planName;
    protected double dataLimitGB;

    // Constructor for Plan class
    public Plan(String planName, double dataLimitGB) {
        this.planName = planName;
        this.dataLimitGB = dataLimitGB;
    }

    // Method to display plan details
    public void display() {
        System.out.println("Plan Name: " + planName);
        System.out.println("Data Limit: " + dataLimitGB + " GB");
    }
}

// Subclass extending Plan
class PostpaidPlan extends Plan {
    private String billingCycle;

    // Constructor for PostpaidPlan class
    public PostpaidPlan(String planName, double dataLimitGB, String billingCycle) {
        super(planName, dataLimitGB);
        this.billingCycle = billingCycle;
    }

    // Overriding display() method to show all details
    @Override
    public void display() {
        super.display();
        System.out.println("Billing Cycle: " + billingCycle);
    }
}

// Main class to test Problem A
public class Main {
    public static void main(String[] args) {
        PostpaidPlan plan = new PostpaidPlan("Family Postpaid", 150.0, "Monthly");
        plan.display();
    }
}
