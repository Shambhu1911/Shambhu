//slip 1 Q.2
abstract class Staff {
    protected int id;
    protected String name;

    // Parameterized constructor
    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayDetails();
}

class OfficeStaff extends Staff {
    private String department;

    // Parameterized constructor for OfficeStaff
    public OfficeStaff(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    // Implementation of the abstract method to display details
    @Override
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 3; // Number of OfficeStaff objects

        // Creating an array of OfficeStaff objects
        OfficeStaff[] officeStaffArray = new OfficeStaff[n];

        // Initializing OfficeStaff objects
        officeStaffArray[0] = new OfficeStaff(101, "John Doe", "HR");
        officeStaffArray[1] = new OfficeStaff(102, "Jane Smith", "Finance");
        officeStaffArray[2] = new OfficeStaff(103, "Bob Johnson", "IT");

        // Displaying details of each OfficeStaff object
        for (int i = 0; i < n; i++) {
            System.out.println("Details for OfficeStaff " + (i + 1) + ":");
            officeStaffArray[i].displayDetails();
            System.out.println(); // Adding a newline for better readability
        }
    }
}
