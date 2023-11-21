slip 16 Q1


  // Functional interface for square calculation
@FunctionalInterface
interface SquareCalculator {
    int calculateSquare(int number);
}

public class SquareCalculatorDemo {
    public static void main(String[] args) {
        // Using lambda expression to implement the functional interface
        SquareCalculator squareCalculator = (number) -> number * number;

        // Input: The number for which we want to find the square
        int inputNumber = 7;

        // Finding the square using the functional interface
        int result = squareCalculator.calculateSquare(inputNumber);

        // Displaying the result
        System.out.println("The square of " + inputNumber + " is: " + result);
    }
}
