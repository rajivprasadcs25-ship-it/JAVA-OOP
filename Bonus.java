class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void bonus() {
        double bonus = salary * 0.10;
        salary = salary + bonus;

        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

public class Bonus {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Rajiv", 30000);

        e1.bonus();
    }
}
