/**
 * FactorialChallenge.java
 *
 * Challenge from the Notes:
 * "Write a function to calculate the factorial of a number.
 *  - The factorial of a non-negative integer n is the product of all positive integers <= n.
 *  - Return the factorial of the input number num.
 *  - For example, if num = 5, the output should be 120."
 */
public class FactorialChallenge {

    /**
     * Solution method matching the challenge signature
     */
    public static int calculateFactorial(int num) {
        // Handle edge cases
        if (num < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        // Base case: 0! = 1 and 1! = 1
        if (num == 0 || num == 1) {
            return 1;
        }
        // Recursive case
        return num * calculateFactorial(num - 1);
    }

    public static void main(String[] args) {
        System.out.println("=== Running Factorial Challenge Tests ===");

        int[] testCases = {0, 1, 3, 4, 5, 6};
        int[] expectedAnswers = {1, 1, 6, 24, 120, 720};

        boolean allPassed = true;
        for (int i = 0; i < testCases.length; i++) {
            int input = testCases[i];
            int expected = expectedAnswers[i];
            int actual = calculateFactorial(input);

            boolean passed = (actual == expected);
            if (!passed) allPassed = false;

            System.out.printf("Test calculateFactorial(%d): Expected = %-4d | Actual = %-4d -> %s\n",
                    input, expected, actual, (passed ? "PASS" : "FAIL"));
        }

        if (allPassed) {
            System.out.println("\n🎉 All challenge tests passed successfully!");
        }
    }
}
