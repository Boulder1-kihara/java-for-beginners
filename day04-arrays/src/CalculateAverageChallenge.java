/**
 * CalculateAverageChallenge.java
 *
 * Challenge from the Notes:
 * "Write a function to calculate the average of an array of numbers.
 *  - Return the average of all numbers in the array arr with the size arrSize.
 *  - For example, if arr[] = {10, 20, 30, 40} and arrSize = 4, expected output is 25."
 */
public class CalculateAverageChallenge {

    /**
     * Solution method matching the challenge signature
     */
    public static double calculateAverage(int[] arr, int arrSize) {
        if (arr == null || arrSize == 0) {
            return 0.0;
        }

        int total = 0;
        for (int i = 0; i < arrSize; i++) {
            total += arr[i];
        }

        // Return double average with type casting
        return (double) total / arrSize;
    }

    public static void main(String[] args) {
        System.out.println("=== Testing Array Average Challenge ===");

        // Test 1: Example from notes
        int[] arr1 = {10, 20, 30, 40};
        double avg1 = calculateAverage(arr1, 4);
        System.out.println("Test 1 {10, 20, 30, 40}: Expected = 25.0 | Actual = " + avg1 +
                " -> " + (avg1 == 25.0 ? "PASS" : "FAIL"));

        // Test 2: Single element
        int[] arr2 = {50};
        double avg2 = calculateAverage(arr2, 1);
        System.out.println("Test 2 {50}: Expected = 50.0 | Actual = " + avg2 +
                " -> " + (avg2 == 50.0 ? "PASS" : "FAIL"));

        // Test 3: Mixed positive and negative
        int[] arr3 = {-10, 10, -20, 20};
        double avg3 = calculateAverage(arr3, 4);
        System.out.println("Test 3 {-10, 10, -20, 20}: Expected = 0.0 | Actual = " + avg3 +
                " -> " + (avg3 == 0.0 ? "PASS" : "FAIL"));
    }
}
