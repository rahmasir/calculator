public class Calculator {

    /**
     * Adds two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The sum of a and b.
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts the second number from the first.
     *
     * @param a The first number.
     * @param b The number to subtract.
     * @return The result of the subtraction.
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The product of a and b.
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides the first number by the second.
     *
     * @param a The numerator.
     * @param b The denominator.
     * @return The result of the division.
     * @throws IllegalArgumentException if the denominator (b) is zero.
     */
    public double divide(double a, double b) {
        if (b == 0) {
            // Throw an exception to signal an invalid operation.
            // This is better than returning a magic value like 0 or NaN.
            throw new IllegalArgumentException("Error: Division by zero is not allowed.");
        }
        return a / b;
    }
}