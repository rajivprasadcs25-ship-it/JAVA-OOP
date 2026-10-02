// Class representing a student
class Stud {
    int id;
    String name;

    // Method to display student details
    public void display(int id, String name) {
        System.out.println("id = " + id);
        System.out.println("name = " + name);
    }
}

// Main class
public class Student {
    public static void main(String[] args) {
        // Create object of Stud class
        Stud s1 = new Stud();
        
        // Call display method
        s1.display(10, "Rahul");
    }
}
