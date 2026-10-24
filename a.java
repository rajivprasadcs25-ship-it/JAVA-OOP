abstract class Employee {
    abstract void salary();
}


class HR extends Employee{
    @Override 
    void salary() {
       System.out.println("HR Salary: Rs.30,000");
    }
}

class Manager extends Employee{
    @Override 
    void salary() {
       System.out.println("Manager Salary: Rs.60,000");
    }
}

public class a {
    public static void main(String[] args){
        Employee hr = new HR();
        Employee manager = new Manager();

        hr.salary();
        manager.salary();

    }
}
