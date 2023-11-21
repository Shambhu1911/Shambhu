//slip 8 Q1

import java.util.Scanner;

class Sphere {
    private double radius;



    // Parameterized constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Method to calculate surface area
    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // Method to calculate volume
    public double calculateVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
}

public class main10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the radius from the user
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        // Create a Sphere object
        Sphere mySphere = new Sphere(radius);

        // Calculate and display the surface area and volume
        double surfaceArea = mySphere.calculateSurfaceArea();
        double volume = mySphere.calculateVolume();

        System.out.println("\nSphere Calculations:");
        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);

        scanner.close();
    }
}
