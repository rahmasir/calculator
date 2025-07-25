
# Simple Java Calculator

A straightforward, command-line based calculator written in Java. This project serves as a basic example of applying software engineering principles like separation of concerns and robust error handling.

## Description

This program performs basic arithmetic operations: addition, subtraction, multiplication, and division. It is built with two main classes: one to handle the user interface and input (`Main.java`) and another to perform the mathematical calculations (`Calculator.java`).

## Features

-   **Basic Arithmetic:** Supports `+`, `-`, `*`, and `/`.

-   **Error Handling:**

    -   Gracefully handles non-numeric input.

    -   Prevents division by zero and displays a clear error message.

    -   Catches invalid operators.

-   **Clean Architecture:** Separates calculation logic from user interaction for better maintainability and testing.


## How to Compile and Run

You will need to have a Java Development Kit (JDK) installed on your system.

1.  **Save the Files:** Make sure you have both `Calculator.java` and `Main.java` in the same directory.

2.  **Open a Terminal:** Navigate to the directory where you saved the files.

3.  **Compile the Code:** Run the Java compiler (`javac`) to compile both files into bytecode:

    ```
    javac Calculator.java Main.java
    ```

4.  **Run the Program:** Execute the compiled code using the `java` command, specifying the class with the `main` method:

    ```
    java Main
    ```

5.  **Follow the Prompts:** The program will then prompt you to enter two numbers and an operator.

    ```
    --- Simple Java Calculator ---
    Enter the first number: 10
    Enter an operator (+, -, *, /): *
    Enter the second number: 5
    --------------------------------
    The result is: 10.0 * 5.0 = 50.0
    -------------------------------- 
    ```


## Project Structure

-   `Calculator.java`: Contains the core logic for all mathematical operations. It has no knowledge of the user interface.

-   `Main.java`: The entry point of the application. It handles all user input and output, and uses an instance of the `Calculator` class to perform the actual work.