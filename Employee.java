// Class representing an Employee
class Emp {
    int id;
    String name;
    int salary;

    // Constructor to initialize employee details
    public Emp(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void display() {
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Salary = " + salary);
    }
}

// Main class
public class Employee {
    public static void main(String[] args) {
        // Create an Emp object with details
        Emp e1 = new Emp(101, "Rahul", 2000);

        // Display employee details
        e1.display();
    }
}
