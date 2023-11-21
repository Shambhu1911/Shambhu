//slip3 Q2

// Custom exception class for handling COVID-19 positive cases adnan
class CovidPositiveException extends Exception {
    public CovidPositiveException(String message) {
        super(message);
    }
}

// Patient class with appropriate exception handling
class Patient {
    String patientName;
    int patientAge;
    double patientOxyLevel;
    int patientHRCTReport;

    // Constructor
    public Patient(String patientName, int patientAge, double patientOxyLevel, int patientHRCTReport) throws CovidPositiveException {
        this.patientName = patientName;
        this.patientAge = patientAge;

        // Check if oxygen level is less than 95%
        if (patientOxyLevel < 95.0) {
            throw new CovidPositiveException("Patient is Covid Positive(+) and Needs to be Hospitalized. Oxygen level is less than 95%.");
        }

        // Check if HRCT scan report is greater than 10
        if (patientHRCTReport > 10) {
            throw new CovidPositiveException("Patient is Covid Positive(+) and Needs to be Hospitalized. HRCT scan report is greater than 10.");
        }

        this.patientOxyLevel = patientOxyLevel;
        this.patientHRCTReport = patientHRCTReport;
    }

    // Display patient information
    public void displayPatientInfo() {
        System.out.println("Patient Information:");
        System.out.println("Name: " + patientName);
        System.out.println("Age: " + patientAge);
        System.out.println("Oxygen Level: " + patientOxyLevel + "%");
        System.out.println("HRCT Report: " + patientHRCTReport);
    }
}

public class main4 {
    public static void main(String[] args) {
        try {
            // Creating a Patient object
            Patient patient = new Patient("John Doe", 30, 92.5, 8);

            // Displaying patient information
            patient.displayPatientInfo();
        } catch (CovidPositiveException e) {
            // Handling the custom exception
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
