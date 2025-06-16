public class Employee extends Person {
    private int employeeID;
    private double salary;

    // Constructor for Employee using super to initialize Person fields
    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age);  // calling the constructor of Person
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to display all employee details
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }

    // Main method for testing
    public static void main(String[] args) {
        Employee emp = new Employee("MANGALA RUPA", 25, 1001, 55000.50);
        emp.displayInfo();
    }
}
