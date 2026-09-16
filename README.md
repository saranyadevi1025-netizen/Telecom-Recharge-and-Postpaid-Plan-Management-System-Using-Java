Telecom Plan Management System
Problem Statement
Write a Java program to create a Plan class for a telecom scenario with the following attributes:
planName – stores the name of the telecom plan.
dataLimitGB – stores the data limit in GB.
Create a constructor to initialize these attributes.
Create a subclass PostpaidPlan that extends Plan.
Add an additional attribute billingCycle to PostpaidPlan.
Override the display() method to display all plan details.
Assigned Data
Attribute
Assigned Value
Plan Name
Premium Postpaid
Data Limit
50 GB
Billing Cycle
Monthly
Concepts Used
Class and Object
Constructor
Inheritance
super keyword
Method Overriding
Sample Output
Plan Name: Premium Postpaid
Data Limit: 50.0 GB
Billing Cycle: Monthly
Java Program
class Plan {
    String planName;
    double dataLimitGB;

    Plan(String planName, double dataLimitGB) {
        this.planName = planName;
        this.dataLimitGB = dataLimitGB;
    }

    void display() {
        System.out.println("Plan Name: " + planName);
        System.out.println("Data Limit: " + dataLimitGB + " GB");
    }
}

class PostpaidPlan extends Plan {
    String billingCycle;

    PostpaidPlan(String planName, double dataLimitGB, String billingCycle) {
        super(planName, dataLimitGB);
        this.billingCycle = billingCycle;
    }

    @Override
    void display() {
        System.out.println("Plan Name: " + planName);
        System.out.println("Data Limit: " + dataLimitGB + " GB");
        System.out.println("Billing Cycle: " + billingCycle);
    }
}

public class Main {
    public static void main(String[] args) {
        PostpaidPlan plan =
            new PostpaidPlan("Premium Postpaid", 50, "Monthly");

        plan.display();
    }
}
