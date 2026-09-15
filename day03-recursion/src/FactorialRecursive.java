/**
 * FactorialRecursive.java
 *
 * Demonstrates the classic Factorial calculation using recursion:
 * Formula: n! = n * (n-1)!
 * Base Case: 0! = 1
 */
public class FactorialRecursive {

    /**
     * Calculates factorial recursively.
     * @param n Non-negative integer.
     * @return Factorial of n.
     */
    static int factorial(int n) {
        // Step 1: Check termination / base condition
        if (n != 0) {
            // Recursive call: pushes new frame to the call stack
            return n * factorial(n - 1);
        } else {
            // Base condition reached when n == 0
            return 1;
        }
    }

    public static void main(String[] args) {
        int number = 4;
        int result = factorial(number);

        System.out.println("=== Factorial Calculation ===");
        System.out.println(number + " factorial = " + result);

        // Verification of 4! = 4 * 3 * 2 * 1 = 24
        System.out.println("Explanation: 4 * 3 * 2 * 1 = " + result);
    }
}
