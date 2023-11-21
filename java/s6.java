//slip 6 Q1
class Employee {
    private int empId;
    private String empName;
    private String empDesignation;
    private double empSalary;

    // Parameterized constructor
    public Employee(int empId, String empName, String empDesignation, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
    }

    // Override toString method to display employee information
    @Override
    public String toString() {
        return "Employee Information:\n" +
                "EmpId: " + empId + "\n" +
                "EmpName: " + empName + "\n" +
                "EmpDesignation: " + empDesignation + "\n" +
                "EmpSalary: " + empSalary;
    }
}

public class main7
{
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee(101, "John Doe", "Software Engineer", 75000.0);

        // Displaying employee information using toString()
        System.out.println(employee.toString());
    }
}
