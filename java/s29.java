slip 29 Q1

import java.util.ArrayList;
import java.util.List;

class Customer {
    private int custno;
    private String custname;
    private String contactnumber;
    private String custaddr;

    public Customer(int custno, String custname, String contactnumber, String custaddr) {
        this.custno = custno;
        this.custname = custname;
        this.contactnumber = contactnumber;
        this.custaddr = custaddr;
    }

    public String getContactNumber() {
        return contactnumber;
    }

    public void displayDetails() {
        System.out.println("Customer Details:");
        System.out.println("Customer Number: " + custno);
        System.out.println("Customer Name: " + custname);
        System.out.println("Contact Number: " + contactnumber);
        System.out.println("Customer Address: " + custaddr);
        System.out.println("-----------------------------");
    }
}

public class CustomerSearchDemo {
    public static void main(String[] args) {
        // Create a list of customers
        List<Customer> customers = new ArrayList<>();

        // Add customers to the list
        customers.add(new Customer(1, "John Doe", "1234567890", "123 Main St"));
        customers.add(new Customer(2, "Jane Smith", "9876543210", "456 Oak St"));
        customers.add(new Customer(3, "Bob Johnson", "5551234567", "789 Pine St"));

        // Search for a customer by contact number and display details
        searchAndDisplayCustomer(customers, "9876543210");
        searchAndDisplayCustomer(customers, "5555555555"); // Not found case
    }

    private static void searchAndDisplayCustomer(List<Customer> customers, String contactNumber) {
        System.out.println("Searching for customer with contact number: " + contactNumber);

        for (Customer customer : customers) {
            if (customer.getContactNumber().equals(contactNumber)) {
                customer.displayDetails();
                return;
            }
        }

        System.out.println("Customer not found for contact number: " + contactNumber);
        System.out.println("-----------------------------");
    }
}





slip 29 Q2

import java.util.Scanner;

class Vehicle {
    protected String company;
    protected double price;

    public Vehicle(String company, double price) {
        this.company = company;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Vehicle Information:");
        System.out.println("Company: " + company);
        System.out.println("Price: $" + price);
    }
}

class LightMotorVehicle extends Vehicle {
    private double mileage;

    public LightMotorVehicle(String company, double price, double mileage) {
        super(company, price);
        this.mileage = mileage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println("-----------------------------");
    }
}

class HeavyMotorVehicle extends Vehicle {
    private double capacity_in_tons;

    public HeavyMotorVehicle(String company, double price, double capacity_in_tons) {
        super(company, price);
        this.capacity_in_tons = capacity_in_tons;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Capacity in Tons: " + capacity_in_tons + " tons");
        System.out.println("-----------------------------");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vehicles (n): ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter information for Vehicle #" + (i + 1));

            System.out.print("Enter vehicle type (Light / Heavy): ");
            String vehicleType = scanner.nextLine();

            System.out.print("Enter company: ");
            String company = scanner.nextLine();

            System.out.print("Enter price: $");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            if ("Light".equalsIgnoreCase(vehicleType)) {
                System.out.print("Enter mileage: ");
                double mileage = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character

                vehicles[i] = new LightMotorVehicle(company, price, mileage);
            } else if ("Heavy".equalsIgnoreCase(vehicleType)) {
                System.out.print("Enter capacity in tons: ");
                double capacity_in_tons = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character

                vehicles[i] = new HeavyMotorVehicle(company, price, capacity_in_tons);
            } else {
                System.out.println("Invalid vehicle type. Please enter Light or Heavy.");
                i--; // Retry input for the current vehicle
            }
        }

        // Display information for all vehicles
        System.out.println("\nVehicle Information for All Vehicles:");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }

        scanner.close();
    }
}
