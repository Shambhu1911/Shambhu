//slip2 Q1
public class main2 {
    public static void main(String[] args) {
        // Check if there are enough command line arguments
        if (args.length < 4) {
            System.out.println("Usage: java BMICalculator <First Name> <Last Name> <Weight in kgs> <Height in meters>");
            return;
        }

        // Retrieve data from command line arguments
        String firstName = args[0];
        String lastName = args[1];
        double weight = Double.parseDouble(args[2]);
        double height = Double.parseDouble(args[3]);

        // Calculate BMI
        double bmi = calculateBMI(weight, height);

        // Display the results
        System.out.println("BMI Calculation for " + firstName + " " + lastName + ":");
        System.out.println("Weight: " + weight + " kgs");
        System.out.println("Height: " + height + " meters");
        System.out.println("BMI: " + bmi);
    }

    // Method to calculate BMI
    private static double calculateBMI(double weight, double height) {
        // BMI formula: weight / (height * height)
        return weight / (height * height);
    }
}


//slip2 Q2

import java.util.Arrays;

class CricketPlayer {
    String name;
    int noOfInnings;
    int noOfTimesNotOut;
    int totalRuns;
    double batAvg;

    // Constructor
    public CricketPlayer(String name, int noOfInnings, int noOfTimesNotOut, int totalRuns) {
        this.name = name;
        this.noOfInnings = noOfInnings;
        this.noOfTimesNotOut = noOfTimesNotOut;
        this.totalRuns = totalRuns;
        this.batAvg = avg(totalRuns, noOfInnings - noOfTimesNotOut);
    }

    // Static method to calculate batting average
    public static double avg(int totalRuns, int totalInnings) {
        if (totalInnings == 0) {
            return 0.0;
        }
        return (double) totalRuns / totalInnings;
    }

    // Static method to sort array based on batting average
    public static void sort(CricketPlayer[] players) {
        Arrays.sort(players, (p1, p2) -> Double.compare(p2.batAvg, p1.batAvg));
    }

    // Method to display player details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Number of Innings: " + noOfInnings);
        System.out.println("Number of Times Not Out: " + noOfTimesNotOut);
        System.out.println("Total Runs: " + totalRuns);
        System.out.println("Batting Average: " + batAvg);
        System.out.println();
    }
}

public class main3 {
    public static void main(String[] args) {
        int n = 3; // Number of players

        // Creating an array of CricketPlayer objects
        CricketPlayer[] players = new CricketPlayer[n];

        // Initializing CricketPlayer objects
        players[0] = new CricketPlayer("Player1", 50, 5, 1500);
        players[1] = new CricketPlayer("Player2", 40, 3, 1200);
        players[2] = new CricketPlayer("Player3", 45, 7, 1800);

        // Calculate batting average and display details
        System.out.println("Player Details Before Sorting:");
        for (CricketPlayer player : players) {
            player.displayDetails();
        }

        // Sorting the array based on batting average
        CricketPlayer.sort(players);

        // Displaying player details after sorting
        System.out.println("Player Details After Sorting:");
        for (CricketPlayer player : players) {
            player.displayDetails();
        }
    }
}
