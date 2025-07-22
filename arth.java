import java.util.Scanner;

public class arth{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int b = scanner.nextInt();

        // Perform arithmetic operations
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double division = (b != 0) ? (double) a / b : Double.NaN;
        int modulus = (b != 0) ? a % b : 0;

        // Display results
        System.out.println("\n--- Arithmetic Operations ---");
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        if (b != 0) {
            System.out.println("Division: " + division);
            System.out.println("Modulus: " + modulus);
        } else {
            System.out.println("Division: Undefined (division by zero)");
            System.out.println("Modulus: Undefined (modulus by zero)");
        }

        scanner.close();
    }
}





