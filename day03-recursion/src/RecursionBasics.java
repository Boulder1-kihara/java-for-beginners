/**
 * RecursionBasics.java
 *
 * Demonstrates:
 * 1. How a method calls itself (Recursive Call).
 * 2. Why a base condition (termination condition) is critical to prevent StackOverflowError.
 */
public class RecursionBasics {

    /**
     * Simple countdown method:
     * Prints numbers from count down to 1, then stops.
     */
    public static void countDown(int count) {
        // Base condition / termination condition:
        if (count <= 0) {
            System.out.println("Liftoff! (Base condition reached)");
            return; // Stops recursion and begins stack unwinding
        }

        System.out.println("Current count: " + count);

        // Recursive call: calls itself with a smaller value
        countDown(count - 1);
    }

    public static void main(String[] args) {
        System.out.println("Starting recursive countdown from 5:");
        countDown(5);
    }
}
