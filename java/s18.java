slip 18 Q 1

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



slip 18 Q 2

import java.util.Arrays;

class CricketPlayer {
    String name;
    int no_of_innings;
    int no_of_times_notout;
    int totalruns;
    double bat_avg;

    public CricketPlayer(String name, int no_of_innings, int no_of_times_notout, int totalruns) {
        this.name = name;
        this.no_of_innings = no_of_innings;
        this.no_of_times_notout = no_of_times_notout;
        this.totalruns = totalruns;
        this.bat_avg = avg(totalruns, no_of_innings, no_of_times_notout);
    }

    // Static method to calculate batting average
    public static double avg(int totalruns, int no_of_innings, int no_of_times_notout) {
        if (no_of_innings == 0) {
            return 0.0;
        }
        return ((double) totalruns / no_of_innings);
    }

    // Static method to sort CricketPlayer array based on batting average
    public static void sort(CricketPlayer[] players) {
        Arrays.sort(players, (player1, player2) -> Double.compare(player2.bat_avg, player1.bat_avg));
    }

    // Method to display player details
    public void displayDetails() {
        System.out.println("Player Name: " + name);
        System.out.println("Number of Innings: " + no_of_innings);
        System.out.println("Number of Times Not Out: " + no_of_times_notout);
        System.out.println("Total Runs: " + totalruns);
        System.out.println("Batting Average: " + bat_avg);
        System.out.println("-----------------------------");
    }
}

public class CricketPlayerDemo {
    public static void main(String[] args) {
        int n = 3; // Number of players
        CricketPlayer[] players = new CricketPlayer[n];

        // Creating player objects
        players[0] = new CricketPlayer("Player1", 50, 5, 2000);
        players[1] = new CricketPlayer("Player2", 40, 3, 1500);
        players[2] = new CricketPlayer("Player3", 60, 8, 2500);

        // Displaying player details before sorting
        System.out.println("Player Details Before Sorting:");
        for (CricketPlayer player : players) {
            player.displayDetails();
        }

        // Sorting players based on batting average
        CricketPlayer.sort(players);

        // Displaying player details after sorting
        System.out.println("Player Details After Sorting:");
        for (CricketPlayer player : players) {
            player.displayDetails();
        }
    }
}
