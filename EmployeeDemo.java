interface Salary {
    void calculateSalary();
}

class PermanentEmployee implements Salary {
    double basicSalary;
    double hra;
    double da;
    double totalSalary;

    PermanentEmployee(double basic, double h, double d) {
        basicSalary = basic;
        hra = h;
        da = d;
    }

    public void calculateSalary() {
        totalSalary = basicSalary + hra + da;

        System.out.println("Permanent Employee Salary: Rs. " + totalSalary);
    }
}

class ContractEmployee implements Salary {
    int workingDays;
    double dailyWage;
    double totalSalary;

    ContractEmployee(int days, double wage) {
        workingDays = days;
        dailyWage = wage;
    }

    public void calculateSalary() {
        totalSalary = workingDays * dailyWage;

        System.out.println("Contract Employee Salary: Rs. " + totalSalary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        Salary s;

        s = new PermanentEmployee(30000, 5000, 3000);
        s.calculateSalary();

        s = new ContractEmployee(20, 800);
        s.calculateSalary();
    }
}
