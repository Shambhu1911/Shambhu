slip 20 Q1

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {
    public BorderLayoutExample() {
        setTitle("BorderLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Create buttons
        JButton btnNorth = new JButton("North");
        JButton btnSouth = new JButton("South");
        JButton btnEast = new JButton("East");
        JButton btnWest = new JButton("West");
        JButton btnCenter = new JButton("Center");

        // Set layout manager to BorderLayout
        setLayout(new BorderLayout());

        // Add buttons to the frame with specified regions
        add(btnNorth, BorderLayout.NORTH);
        add(btnSouth, BorderLayout.SOUTH);
        add(btnEast, BorderLayout.EAST);
        add(btnWest, BorderLayout.WEST);
        add(btnCenter, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BorderLayoutExample example = new BorderLayoutExample();
            example.setVisible(true);
        });
    }
}




slip 20 Q2

// Addition.java
package operations;

public class Addition {
    public int add(int a, int b) {
        return a + b;
    }

    public float subtract(float a, float b) {
        return a - b;
    }
}
// Maximum.java
package operations;

public class Maximum {
    public void max(int a, int b) {
        int max = (a > b) ? a : b;
        System.out.println("Maximum of " + a + " and " + b + " is: " + max);
    }
}
// MainApp.java
import operations.Addition;
        import operations.Maximum;

public class MainApp {
    public static void main(String[] args) {
        // Using Addition class
        Addition addition = new Addition();
        int sum = addition.add(5, 3);
        float difference = addition.subtract(8.0f, 3.5f);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

        // Using Maximum class
        Maximum maximum = new Maximum();
        maximum.max(10, 7);
    }
}
