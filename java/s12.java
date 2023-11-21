slip 12 Q1

class College {
    protected int cno;
    protected String cname;
    protected String caddr;

    // Parameterized constructor for College
    public College(int cno, String cname, String caddr) {
        this.cno = cno;
        this.cname = cname;
        this.caddr = caddr;
    }

    // Method to display College details
    public void displayCollegeDetails() {
        System.out.println("College Details:");
        System.out.println("College Number: " + cno);
        System.out.println("College Name: " + cname);
        System.out.println("College Address: " + caddr);
    }
}

class Department extends College {
    private int dno;
    private String dname;

    // Parameterized constructor for Department
    public Department(int cno, String cname, String caddr, int dno, String dname) {
        super(cno, cname, caddr);
        this.dno = dno;
        this.dname = dname;
    }

    // Method to display Department details along with College details
    public void displayDepartmentDetails() {
        // Call the displayCollegeDetails method from the parent class
        super.displayCollegeDetails();

        // Display additional Department details
        System.out.println("Department Details:");
        System.out.println("Department Number: " + dno);
        System.out.println("Department Name: " + dname);
    }
}

public class CollegeDepartmentDemo {
    public static void main(String[] args) {
        // Create an object of the Department class
        Department myDepartment = new Department(1, "XYZ College", "123 Main Street", 101, "Computer Science");

        // Display the details of the Department along with College details
        myDepartment.displayDepartmentDetails();
    }
}



slip 12 Q2

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {
    private JTextField resultTextField;

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the result text field
        resultTextField = new JTextField();
        resultTextField.setEditable(false);
        add(resultTextField, BorderLayout.NORTH);

        // Create the panel for buttons using GridLayout
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        // Define button labels
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        // Add buttons to the panel
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        // Add the button panel to the frame
        add(buttonPanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    // ActionListener for the calculator buttons
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getAct
