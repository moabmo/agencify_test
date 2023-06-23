/*
 * 
The bug in the given code lies in the calculation of the average. 
The variable total is an integer, and when dividing it by numbers.length, the result is also an integer. This causes the decimal part of the average to be truncated, leading to an incorrect result. To fix this, we need to perform the division using floating-point arithmetic. Here's the corrected code:
 */




public class AverageCalculator {
    public static double calculateAverage(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        double average = (double) total / numbers.length;  // Perform division with floating-point arithmetic
        return average;
    }

    public static void main(String[] args) {
        int[] data = {5, 10, 15, 20, 25};
        double result = calculateAverage(data);
        System.out.println("The average is: " + result);
    }
}


/*
 * In the corrected code, we explicitly cast total to a 
 * double before dividing it by numbers.length. 
 * This ensures that the division is performed using floating-point arithmetic, 
 * preserving the decimal part of the average. 
 * The corrected code is well-structured, modular, and readable. 
 * The bug is addressed, and the code now correctly calculates and displays the average.
 */