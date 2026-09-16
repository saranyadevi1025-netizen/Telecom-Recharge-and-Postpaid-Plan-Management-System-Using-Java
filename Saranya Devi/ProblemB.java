%%writefile Main.java
// Abstract class Recharge
abstract class Recharge {
    // Abstract method to be implemented by subclasses
    public abstract void processRecharge();
}

// Subclass extending Recharge
class PrepaidRecharge extends Recharge {
    private double amount;
    private String mobileNumber;

    // Constructor
    public PrepaidRecharge(String mobileNumber, double amount) {
        this.mobileNumber = mobileNumber;
        this.amount = amount;
    }

    // Implementation of the abstract method
    @Override
    public void processRecharge() {
        System.out.println("Processing prepaid recharge of $" + amount + " for mobile: " + mobileNumber);
        System.out.println("Recharge successful!");
    }
}

// Main class to test Problem B
public class Main {
    public static void main(String[] args) {
        Recharge myRecharge = new PrepaidRecharge("9876543210", 29.99);
        myRecharge.processRecharge();
    }
}
