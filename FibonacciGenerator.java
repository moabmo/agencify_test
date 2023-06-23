import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Enter a number (or 'exit' to quit): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break;
            }

            try {
                BigInteger number = new BigInteger(input);

                if (number.compareTo(BigInteger.ZERO) <= 0) {
                    System.out.println("Invalid input. Please enter a positive integer.");
                } else {
                    List<BigInteger> fibonacciSequence = generateFibonacciSequence(number);
                    System.out.println("Fibonacci Sequence:");
                    for (BigInteger fibNumber : fibonacciSequence) {
                        System.out.print(fibNumber + " ");
                    }
                    System.out.println();
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!!! \nPlease enter a valid integer.");
            }
        } while (true);

        scanner.close();
    }

    /**
     * Generates the Fibonacci sequence up to the given number.
     *
     * @param number The number up to which the Fibonacci sequence is generated.
     * @return A list of BigIntegers representing the Fibonacci sequence.
     */
    public static List<BigInteger> generateFibonacciSequence(BigInteger number) {
        List<BigInteger> fibonacciSequence = new ArrayList<>();
        fibonacciSequence.add(BigInteger.ZERO); // Initialize the sequence with the first Fibonacci number (0)

        if (number.equals(BigInteger.ONE)) {
            return fibonacciSequence; // Return the sequence [0] if the number is 1
        }

        fibonacciSequence.add(BigInteger.ONE); // Add the second Fibonacci number (1) to the sequence

        // Generate Fibonacci numbers until the last number in the sequence is less than the given number
        for (int i = 2; fibonacciSequence.get(i - 1).compareTo(number) < 0; i++) {
            BigInteger next = fibonacciSequence.get(i - 1).add(fibonacciSequence.get(i - 2));
            fibonacciSequence.add(next);
        }

        return fibonacciSequence;
    }
}


