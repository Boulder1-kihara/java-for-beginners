/**
 * OperatorOverloadingDemo.java
 *
 * Demonstrates:
 * Operator Overloading in Java:
 * Java has built-in operator overloading for '+' (numeric addition vs string concatenation).
 * Note: Java does NOT allow programmers to define custom operator overloading.
 */
public class OperatorOverloadingDemo {

    public static void main(String[] args) {
        System.out.println("=== Operator Overloading in Java ===");

        // 1. '+' with numbers performs mathematical addition
        int a = 5;
        int b = 6;
        int sum = a + b;
        System.out.println("Mathematical addition (5 + 6): " + sum);

        // 2. '+' with strings performs string concatenation
        String first = "Java ";
        String second = "Programming";
        String name = first + second;
        System.out.println("String concatenation (\"Java \" + \"Programming\"): " + name);

        // 3. Mixed types: string concatenation takes precedence
        System.out.println("Result: " + "Score: " + (5 + 6)); // parenthesis ensures arithmetic first
        System.out.println("Without parenthesis: " + "Score: " + 5 + 6); // concatenated as strings!
    }
}
