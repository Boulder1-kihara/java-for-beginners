/**
 * CodeReusabilityDemo.java
 *
 * This program demonstrates:
 * The primary advantage of methods: "Write Once, Reuse Multiple Times".
 * Instead of writing `i * i` over and over, we isolate the logic in `getSquare(int x)`
 * and call it repeatedly inside a loop.
 */
public class CodeReusabilityDemo {

    /**
     * Helper method to calculate square of any number.
     * Keeps code readable, clean, and modular.
     */
    private static int getSquare(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        System.out.println("Calculating squares from 1 to 5 using a reusable method:");

        // Loop from 1 to 5 and invoke getSquare() for each value
        for (int i = 1; i <= 5; i++) {
            int result = getSquare(i);
            System.out.println("Square of " + i + " is: " + result);
        }
    }
}
