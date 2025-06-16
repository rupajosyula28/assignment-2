public class Person {
    // Properties
    private String name;
    private int age;

    // Default constructor - sets default age to 18
    public Person(String name) {
        this.name = name;
        this.age = 18;
    }

    // Parameterized constructor - initializes name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Person p1 = new Person("sandeep");
        Person p2 = new Person("vijay", 25);

        System.out.println("Person 1:");
        p1.displayInfo();

        System.out.println("\nPerson 2:");
        p2.displayInfo();
    }
}
