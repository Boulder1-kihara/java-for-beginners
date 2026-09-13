/**
 * StandardLibraryMethods.java
 *
 * This program demonstrates:
 * Standard Library Methods (built-in Java methods) that come with
 * the Java Class Library (JCL).
 */
public class StandardLibraryMethods {

    public static void main(String[] args) {
        // 1. Math.sqrt() is a built-in static method from java.lang.Math
        // It computes the square root of a given number.
        double squareRoot = Math.sqrt(4);
        System.out.println("Square root of 4 is: " + squareRoot);

        // 2. Math.max() returns the greater of two values
        int maximum = Math.max(15, 42);
        System.out.println("Maximum of 15 and 42 is: " + maximum);

        // 3. String.toUpperCase() is a built-in method from java.lang.String
        String message = "hello, java world!";
        System.out.println("Uppercase: " + message.toUpperCase());

        // 4. System.out.print() is a standard method from java.io.PrintStream
        System.out.println("All standard library methods are readily available without importing extra libraries!");
    }
}
