slip 10 Q1

// Functional interface for cube calculation
@FunctionalInterface
interface CubeCalculator {
    int calculateCube(int number);
}

public class CubeCalculatorDemo {
    public static void main(String[] args) {
        // Using lambda expression to implement the functional interface
        CubeCalculator cubeCalculator = (number) -> number * number * number;

        // Input: The number for which we want to find the cube
        int inputNumber = 5;

        // Finding the cube using the functional interface
        int result = cubeCalculator.calculateCube(inputNumber);

        // Displaying the result
        System.out.println("The cube of " + inputNumber + " is: " + result);
    }
}
