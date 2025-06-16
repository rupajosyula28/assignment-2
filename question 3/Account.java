public class Account {
    private double balance;

    // No-argument constructor - initializes balance to 0
    public Account() {
        this.balance = 0.0;
    }

    // Constructor with initial balance
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal.");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Main method for demonstration
    public static void main(String[] args) {
        Account acc1 = new Account();               // Using no-argument constructor
        Account acc2 = new Account(500.0);          // Using parameterized constructor

        acc1.deposit(200);
        acc1.withdraw(100);
        acc1.displayBalance();

        System.out.println();

        acc2.deposit(500);
        acc2.withdraw(10000); // Will show insufficient balance
        acc2.displayBalance();
    }
}
