
slip 9 Q1
import java.util.Scanner;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;
    private String amPm;

    // Default constructor
    public Clock() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
        this.amPm = "AM";
    }

    // Parameterized constructor with input validation
    public Clock(int hours, int minutes, int seconds) {
        if (isValidTime(hours, minutes, seconds)) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            setAmPm();
        } else {
            System.out.println("Invalid time input. Defaulting to midnight (12:00:00 AM).");
            this.hours = 0;
            this.minutes = 0;
            this.seconds = 0;
            this.amPm = "AM";
        }
    }

    // Method to check the validity of time input
    private boolean isValidTime(int hours, int minutes, int seconds) {
        return (hours >= 0 && hours < 24) && (minutes >= 0 && minutes < 60) && (seconds >= 0 && seconds < 60);
    }

    // Method to set AM/PM mode based on the hours
    private void setAmPm() {
        amPm = (hours >= 12) ? "PM" : "AM";
        if (hours > 12) {
            hours -= 12;
        } else if (hours == 0) {
            hours = 12;
        }
    }

    // Method to display the time in HH:MM:SS AM/PM format
    public void displayTime() {
        System.out.println("Time: " + String.format("%02d", hours) + ":" +
                String.format("%02d", minutes) + ":" +
                String.format("%02d", seconds) + " " + amPm);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept hours, minutes, and seconds from the user
        System.out.print("Enter hours: ");
        int hours = scanner.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();

        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();

        // Create a Clock object
        Clock myClock = new Clock(hours, minutes, seconds);

        // Display the time
        myClock.displayTime();

        scanner.close();
    }
}
