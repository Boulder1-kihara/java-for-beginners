/**
 * ArraySumAndAverage.java
 *
 * Demonstrates:
 * 1. Traversing an array with negative, zero, and positive integers.
 * 2. Accumulating total sum.
 * 3. Computing average with explicit type casting to double.
 */
public class ArraySumAndAverage {

    public static void main(String[] args) {
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        double average;

        // Access all elements using for-each loop and calculate sum
        for (int number : numbers) {
            sum += number;
        }

        // Total number of elements
        int arrayLength = numbers.length;

        // CRITICAL CONCEPT: Type Casting
        // In Java, int / int produces integer division (drops decimals).
        // To preserve decimal precision, we cast sum to double:
        average = ((double) sum / (double) arrayLength);

        System.out.println("=== Array Statistics ===");
        System.out.println("Array Length: " + arrayLength);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
