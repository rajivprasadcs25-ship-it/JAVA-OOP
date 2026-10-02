import java.util.Scanner;

class Employee {
    int emp_id;
    String emp_name;
    float emp_sal;

    public void display(int emp_id, String emp_name, float emp_sal) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_sal = emp_sal;

        System.out.println("employee id = " + emp_id);
        System.out.println("employee name = " + emp_name);
        System.out.println("employee salary = " + emp_sal);
    }
}

public class Emp {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Scanner emp = new Scanner(System.in);

        System.out.println("enter employee id:");
        int e_id = emp.nextInt();
        emp.nextLine(); // Consumes the leftover newline character

        System.out.print("enter employee name:");
        String e_name = emp.nextLine();

        System.out.println("enter employee salary:");
        float e_sal = emp.nextFloat();

        System.out.println("\n--- Employee Details ---");
        e1.display(e_id, e_name, e_sal);

        emp.close();
    }
}