import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Use a try-with-resources statement to ensure the scanner is closed automatically.
        try (Scanner scanner = new Scanner(System.in)) {

            // Create an instance of our calculator logic class.
            Calculator calculator = new Calculator();

            double num1, num2;
            char operator;

            // --- Input Stage ---
            System.out.println("--- Simple Java Calculator ---");

            try {
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();

                System.out.print("Enter an operator (+, -, *, /): ");
                operator = scanner.next().charAt(0);

                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();

            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter valid numbers.");
                return; // Exit the program if input is not a number.
            }

            // --- Processing Stage ---
            double result = 0;
            boolean validOperation = true;

            // Use a switch statement to call the appropriate method.
            switch (operator) {
                case '+':
                    result = calculator.add(num1, num2);
                    break;
                case '-':
                    result = calculator.subtract(num1, num2);
                    break;
                case '*':
                    result = calculator.multiply(num1, num2);
                    break;
                case '/':
                    try {
                        // The divide method can throw an exception, so we handle it here.
                        result = calculator.divide(num1, num2);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                    validOperation = false;
                    break;
            }

            // --- Output Stage ---
            if (validOperation) {
                System.out.println("--------------------------------");
                System.out.println("The result is: " + num1 + " " + operator + " " + num2 + " = " + result);
                System.out.println("--------------------------------");
            }

        } // The scanner is automatically closed here.
    }
}